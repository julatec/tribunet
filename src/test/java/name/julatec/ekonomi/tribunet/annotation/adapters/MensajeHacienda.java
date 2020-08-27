package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.math.BigDecimal;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.mensaje.hacienda.MensajeHacienda.class,
        cr.go.hacienda.tribunet.v42y2017.mensaje.hacienda.MensajeHacienda.class,
        cr.go.hacienda.tribunet.v43.mensaje.hacienda.MensajeHacienda.class,
})
public interface MensajeHacienda {

    String getClave();

    String getNumeroCedulaEmisor();

    BigDecimal getMontoTotalImpuesto();

    BigDecimal getTotalFactura();

}
