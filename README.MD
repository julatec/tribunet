# tribunet

In Costa Rica, the government defined the schema of the Electronic Invoices (Factura Electrónica). This project provides all the POJOs (Java Object Plain Objects) for versions 4.2 and 4.3 provided by Ministerio de Hacienda in the 
[official link](https://www.hacienda.go.cr/ATV/ComprobanteElectronico/frmAnexosyEstructuras.aspx).

## Technical Details

This project compiles with Java 10 (there are incompatibilities with Java 11 and JAXB).

### Package structure:

```
cr/go/hacienda/tribunet/
├── v42y2016
│ ├── factura
│ ├── mensaje
│ ├── nota
│ └── tiquete
├── v42y2017
│ ├── factura
│ ├── mensaje
│ ├── nota
│ └── tiquete
└── v43
    ├── factura
    ├── mensaje
    ├── nota
    └── tiquete
```

### Annotation Processor

This project provides the `Adapt` annotation and the corresponding Annotation processor. The goal is to provide a mechanism where all multiple versions of the different `XML` entities can be adapted to a common facade avoiding all the boilerplate code and corner cases.