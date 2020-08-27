package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;

import java.util.Date;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.nota.debito.NotaDebitoElectronica.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.NotaDebitoElectronica.class,
        cr.go.hacienda.tribunet.v43.nota.debito.NotaDebitoElectronica.class,
})
public interface NotaDebito {

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
