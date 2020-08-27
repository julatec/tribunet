package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.util.Date;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.nota.credito.NotaCreditoElectronica.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.NotaCreditoElectronica.class,
        cr.go.hacienda.tribunet.v43.nota.credito.NotaCreditoElectronica.class,
})
public interface NotaCredito {

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
