package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.math.BigDecimal;

@Adapt(value = {
        cr.go.hacienda.tribunet.v43.factura.CodigoMonedaType.class,
        cr.go.hacienda.tribunet.v43.factura.compra.CodigoMonedaType.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.CodigoMonedaType.class,
        cr.go.hacienda.tribunet.v43.tiquete.CodigoMonedaType.class,
        cr.go.hacienda.tribunet.v43.nota.credito.CodigoMonedaType.class,
        cr.go.hacienda.tribunet.v43.nota.debito.CodigoMonedaType.class,
})
public interface CodigoTipoMoneda {

    default String getCodigoMoneda() {
        return null;
    }

    default BigDecimal getTipoCambio() {
        return null;
    }

}
