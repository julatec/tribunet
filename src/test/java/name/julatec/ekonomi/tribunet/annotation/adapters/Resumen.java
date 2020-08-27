package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.math.BigDecimal;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.FacturaElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.TiqueteElectronico.ResumenFactura.class,
        cr.go.hacienda.tribunet.v42y2016.nota.credito.NotaCreditoElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v42y2016.nota.debito.NotaDebitoElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v42y2017.factura.FacturaElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.TiqueteElectronico.ResumenFactura.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.NotaCreditoElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.NotaDebitoElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v43.factura.FacturaElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v43.factura.compra.FacturaElectronicaCompra.ResumenFactura.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.FacturaElectronicaExportacion.ResumenFactura.class,
        cr.go.hacienda.tribunet.v43.tiquete.TiqueteElectronico.ResumenFactura.class,
        cr.go.hacienda.tribunet.v43.nota.credito.NotaCreditoElectronica.ResumenFactura.class,
        cr.go.hacienda.tribunet.v43.nota.debito.NotaDebitoElectronica.ResumenFactura.class,
})
public interface Resumen extends CodigoTipoMoneda {

    default String getCodigoMoneda() {
        return null;
    }

    default BigDecimal getTipoCambio() {
        return null;
    }

    default CodigoTipoMoneda getCodigoTipoMoneda() {
        return this;
    }

    default BigDecimal getTotalServGravados() {
        return null;
    }

    default BigDecimal getTotalServExentos() {
        return null;
    }

    default BigDecimal getTotalMercanciasGravadas() {
        return null;
    }

    default BigDecimal getTotalMercanciasExentas() {
        return null;
    }

    default BigDecimal getTotalGravado() {
        return null;
    }

    default BigDecimal getTotalExento() {
        return null;
    }

    default BigDecimal getTotalVenta() {
        return null;
    }

    default BigDecimal getTotalDescuentos() {
        return null;
    }

    default BigDecimal getTotalVentaNeta() {
        return null;
    }

    BigDecimal getTotalImpuesto();

    default BigDecimal getTotalIVADevuelto() {
        return null;
    }

    default BigDecimal getTotalOtrosCargos() {
        return null;
    }

    BigDecimal getTotalComprobante();
}
