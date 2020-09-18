@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.credito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.debito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.factura.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.factura.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.factura.compra.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.tiquete.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.nota.credito.ImpuestoType.class,
        cr.go.hacienda.tribunet.v43.nota.debito.ImpuestoType.class,
})
public interface ImpuestoType {
    String getCodigo();
    default String getCodigoTarifa() { return null; }
    BigDecimal getTarifa();
    default BigDecimal getFactorIVA() { return null; }
    BigDecimal getMonto()
    defualt BigDecimal getMontoExportacion() { return null; }
    ExoneracionType getExoneracion();
}