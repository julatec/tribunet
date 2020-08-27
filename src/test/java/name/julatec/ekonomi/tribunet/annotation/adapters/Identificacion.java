package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.IdentificacionType.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.IdentificacionType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.credito.IdentificacionType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.debito.IdentificacionType.class,
        cr.go.hacienda.tribunet.v42y2017.factura.IdentificacionType.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.IdentificacionType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.IdentificacionType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.IdentificacionType.class,
        cr.go.hacienda.tribunet.v43.factura.IdentificacionType.class,
        cr.go.hacienda.tribunet.v43.factura.compra.IdentificacionType.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.IdentificacionType.class,
        cr.go.hacienda.tribunet.v43.tiquete.IdentificacionType.class,
        cr.go.hacienda.tribunet.v43.nota.credito.IdentificacionType.class,
        cr.go.hacienda.tribunet.v43.nota.debito.IdentificacionType.class,
})
public interface Identificacion {

    String getTipo();

    String getNumero();
}
