package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.util.Date;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.FacturaElectronica.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.TiqueteElectronico.class,
        cr.go.hacienda.tribunet.v42y2017.factura.FacturaElectronica.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.TiqueteElectronico.class,
        cr.go.hacienda.tribunet.v43.factura.FacturaElectronica.class,
        cr.go.hacienda.tribunet.v43.tiquete.TiqueteElectronico.class,
})
public interface Factura {

    String getClave();

    String getNumeroConsecutivo();

    Emisor getEmisor();

    Receptor getReceptor();

    Resumen getResumenFactura();

    DetalleServicio getDetalleServicio();

    javax.xml.datatype.XMLGregorianCalendar getFechaEmision();

    default Date getFechaEmisionAsDate() {
        return getFechaEmision().toGregorianCalendar().getTime();
    }

}
