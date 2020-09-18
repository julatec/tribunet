@org.springframework.stereotype.Service("ImpuestoTypeFactory")
public final class ImpuestoTypeFactory implements 
name.julatec.ekonomi.tribunet.annotation.AdapterFactory {

	static final class cr_go_hacienda_tribunet_v42y2016_factura_ImpuestoType 
	implements name.julatec.ekonomi.tribunet.annotation.adapters.ImpuestoType {
		private final cr.go.hacienda.tribunet.v42y2016.factura.ImpuestoType target;
		cr_go_hacienda_tribunet_v42y2016_factura_ImpuestoType(
		    cr.go.hacienda.tribunet.v42y2016.factura.ImpuestoType target) {
			this.target = target;
			getExoneracion = new ExoneracionTypeFactory.
			cr_go_hacienda_tribunet_v42y2016_factura_ExoneracionType(
			    target.getExoneracion());
		}
		public final java.lang.String getCodigo() { 
		    return target == null ? null : target.getCodigo(); }
		public final java.math.BigDecimal getTarifa() { 
		    return target == null ? null : target.getTarifa(); }
		public final java.math.BigDecimal getMonto() { 
		    return target == null ? null : target.getMonto(); }
		private final name.julatec.ekonomi.tribunet.annotation.adapters.
		ExoneracionType getExoneracion;
		public final name.julatec.ekonomi.tribunet.annotation.adapters.
		ExoneracionType getExoneracion() { return getExoneracion; }
	}
	/** One Inner Adapter Implementation Class for each source class  **/
	private static final Class<?>[] supportedClasses = new Class[] {
		cr.go.hacienda.tribunet.v42y2016.factura.ImpuestoType.class,
        // ... All the list of the Adapter Annotation
		cr.go.hacienda.tribunet.v43.nota.debito.ImpuestoType.class,
	};
	public final Class<?>[] supportedClasses() { return supportedClasses; }
	public <T> T adapt(Object target) {
		if (target instanceof cr.go.hacienda.tribunet.v42y2016.factura.ImpuestoType) 
		return (T) new cr_go_hacienda_tribunet_v42y2016_factura_ImpuestoType(
		    (cr.go.hacienda.tribunet.v42y2016.factura.ImpuestoType) target);
		// ... All the list of the Adapter Annotation
		if (target instanceof cr.go.hacienda.tribunet.v43.nota.debito.ImpuestoType) 
		return (T) new cr_go_hacienda_tribunet_v43_nota_debito_ImpuestoType(
		    (cr.go.hacienda.tribunet.v43.nota.debito.ImpuestoType) target);
		return null;
	};
	
}