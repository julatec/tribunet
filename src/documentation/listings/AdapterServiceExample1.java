@Autowired
private void reportFactories(ListableBeanFactory factory) throws JAXBException {
    final Map<String, DocumentLifecycle> lifecycleMap = new TreeMap<>();
    for (AdapterFactory adapter : 
    factory.getBeansOfType(AdapterFactory.class).values()) {
        for (Class<?> target : adapter.supportedClasses()) {
            final XmlRootElement rootElement = 
            target.getAnnotation(XmlRootElement.class);
            if (rootElement == null) {
                continue;
            }
            final String namespace = rootElement.namespace();
            lifecycleMap.put(namespace, new DocumentLifecycle(adapter, target));
        }
    }
    this.lifecycleMap = Collections.unmodifiableMap(lifecycleMap);
}

public Optional<Object> adapt(Document document) throws JAXBException {
    final String namespace = document.getDocumentElement().getNamespaceURI();
    if (namespace != null && lifecycleMap.containsKey(namespace)) {
        final DocumentLifecycle lifecycle = lifecycleMap.get(namespace);
        final Object entity = lifecycle.unmarshaller.unmarshal(document);
        final Object adaptedEntity = lifecycle.adapter.adapt(entity);
        return Optional.ofNullable(adaptedEntity);
    }
    return Optional.empty();
}

private static final class DocumentLifecycle {
    final AdapterFactory adapter;
    final Class<?> document;
    final JAXBContext jaxbContext;
    final Unmarshaller unmarshaller;
    final Marshaller marshaller;
    private DocumentLifecycle(AdapterFactory adapter, Class<?> document) 
    throws JAXBException {
        this.adapter = adapter;
        this.document = document;
        this.jaxbContext = JAXBContext.newInstance(document.getPackageName());
        this.unmarshaller = jaxbContext.createUnmarshaller();
        this.marshaller = jaxbContext.createMarshaller();
        this.unmarshaller.setEventHandler(new CustomValidationEventHandler());
    }
    private static class CustomValidationEventHandler 
    implements ValidationEventHandler {
        public boolean handleEvent(ValidationEvent evt) {
            if (evt.getMessage().contains("Unexpected element") ||
                    evt.getMessage().contains("elemento inesperado")) {
                return true;
            }
            return true;
        }
    }
}