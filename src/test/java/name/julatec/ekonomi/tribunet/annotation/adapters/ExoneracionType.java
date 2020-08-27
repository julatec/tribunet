package name.julatec.ekonomi.tribunet.annotation.adapters;

import name.julatec.ekonomi.tribunet.annotation.Adapt;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;

@Adapt({
        cr.go.hacienda.tribunet.v42y2016.factura.ExoneracionType.class,
        cr.go.hacienda.tribunet.v42y2016.tiquete.ExoneracionType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.credito.ExoneracionType.class,
        cr.go.hacienda.tribunet.v42y2016.nota.debito.ExoneracionType.class,
        cr.go.hacienda.tribunet.v42y2017.factura.ExoneracionType.class,
        cr.go.hacienda.tribunet.v42y2017.tiquete.ExoneracionType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.credito.ExoneracionType.class,
        cr.go.hacienda.tribunet.v42y2017.nota.debito.ExoneracionType.class,
        cr.go.hacienda.tribunet.v43.factura.ExoneracionType.class,
        cr.go.hacienda.tribunet.v43.factura.compra.ExoneracionType.class,
        cr.go.hacienda.tribunet.v43.factura.exportacion.ExoneracionType.class,
        cr.go.hacienda.tribunet.v43.tiquete.ExoneracionType.class,
        cr.go.hacienda.tribunet.v43.nota.credito.ExoneracionType.class,
        cr.go.hacienda.tribunet.v43.nota.debito.ExoneracionType.class,
})
public interface ExoneracionType {

    default String getTipoDocumento() {
        return null;
    }

    default String getNumeroDocumento() {
        return null;
    }

    default String getNombreInstitucion() {
        return null;
    }

    default XMLGregorianCalendar getFechaEmision() {
        return null;
    }

    default BigInteger getPorcentajeExoneracion() {
        return null;
    }

    default BigDecimal getMontoExoneracion() {
        return null;
    }

}
