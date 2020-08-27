package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.EmisorType.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.EmisorType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.credito.EmisorType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.debito.EmisorType.class,
        cr.go.hacienda.tribunet.v42y2017.factura.EmisorType.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.EmisorType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.EmisorType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.EmisorType.class,
        cr.go.hacienda.tribunet.v43.factura.EmisorType.class,
        cr.go.hacienda.tribunet.v43.factura.compra.EmisorType.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.EmisorType.class,
        cr.go.hacienda.tribunet.v43.tiquete.EmisorType.class,
        cr.go.hacienda.tribunet.v43.nota.credito.EmisorType.class,
        cr.go.hacienda.tribunet.v43.nota.debito.EmisorType.class,
})
public interface Emisor {

    String getNombre();

    Identificacion getIdentificacion();

}
