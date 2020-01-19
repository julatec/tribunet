//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.01.18 a las 10:57:19 PM CST 
//


package cr.go.hacienda.tribunet.v43.nota.debito;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Clase Java para ExoneracionType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ExoneracionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoDocumento"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="06"/&gt;
 *               &lt;enumeration value="07"/&gt;
 *               &lt;enumeration value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumeroDocumento"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NombreInstitucion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="160"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PorcentajeExoneracion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *               &lt;totalDigits value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MontoExoneracion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica}DecimalDineroType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExoneracionType", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", propOrder = {
        "tipoDocumento",
        "numeroDocumento",
        "nombreInstitucion",
        "fechaEmision",
        "porcentajeExoneracion",
        "montoExoneracion"
})
public class ExoneracionType {

    @XmlElement(name = "TipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "NumeroDocumento", required = true)
    protected String numeroDocumento;
    @XmlElement(name = "NombreInstitucion", required = true)
    protected String nombreInstitucion;
    @XmlElement(name = "FechaEmision", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "PorcentajeExoneracion", required = true)
    protected BigInteger porcentajeExoneracion;
    @XmlElement(name = "MontoExoneracion", required = true)
    protected BigDecimal montoExoneracion;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreInstitucion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    /**
     * Define el valor de la propiedad nombreInstitucion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombreInstitucion(String value) {
        this.nombreInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeExoneracion.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPorcentajeExoneracion() {
        return porcentajeExoneracion;
    }

    /**
     * Define el valor de la propiedad porcentajeExoneracion.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPorcentajeExoneracion(BigInteger value) {
        this.porcentajeExoneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoExoneracion.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getMontoExoneracion() {
        return montoExoneracion;
    }

    /**
     * Define el valor de la propiedad montoExoneracion.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setMontoExoneracion(BigDecimal value) {
        this.montoExoneracion = value;
    }

}
