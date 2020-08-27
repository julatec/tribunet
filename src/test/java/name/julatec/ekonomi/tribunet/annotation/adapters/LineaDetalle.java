package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.math.BigDecimal;
import java.util.stream.Stream;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.FacturaElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.TiqueteElectronico.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v42y2016.nota.credito.NotaCreditoElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v42y2016.nota.debito.NotaDebitoElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v42y2017.factura.FacturaElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.TiqueteElectronico.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.NotaCreditoElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.NotaDebitoElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v43.factura.FacturaElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v43.factura.compra.FacturaElectronicaCompra.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.FacturaElectronicaExportacion.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v43.tiquete.TiqueteElectronico.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v43.nota.credito.NotaCreditoElectronica.DetalleServicio.LineaDetalle.class,
        cr.go.hacienda.tribunet.v43.nota.debito.NotaDebitoElectronica.DetalleServicio.LineaDetalle.class,
})
public interface LineaDetalle {

    BigDecimal getMontoTotal();

    BigDecimal getSubTotal();

    default BigDecimal getBaseImponible() {
        return null;
    }

    Stream<ImpuestoType> getImpuesto();

    default BigDecimal getImpuestoNeto() {
        return null;
    }

    BigDecimal getMontoTotalLinea();

}
