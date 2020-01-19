//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.01.18 a las 10:57:19 PM CST 
//


package cr.go.hacienda.tribunet.v43.nota.debito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Clase Java para OtrosCargosType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="OtrosCargosType"&gt;
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
 *         &lt;element name="NumeroIdentidadTercero" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NombreTercero" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Detalle"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="160"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Porcentaje" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="6"/&gt;
 *               &lt;fractionDigits value="5"/&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MontoCargo" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica}DecimalDineroType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtrosCargosType", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", propOrder = {
        "tipoDocumento",
        "numeroIdentidadTercero",
        "nombreTercero",
        "detalle",
        "porcentaje",
        "montoCargo"
})
public class OtrosCargosType {

    @XmlElement(name = "TipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "NumeroIdentidadTercero")
    protected String numeroIdentidadTercero;
    @XmlElement(name = "NombreTercero")
    protected String nombreTercero;
    @XmlElement(name = "Detalle", required = true)
    protected String detalle;
    @XmlElement(name = "Porcentaje")
    protected BigDecimal porcentaje;
    @XmlElement(name = "MontoCargo", required = true)
    protected BigDecimal montoCargo;

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
     * Obtiene el valor de la propiedad numeroIdentidadTercero.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumeroIdentidadTercero() {
        return numeroIdentidadTercero;
    }

    /**
     * Define el valor de la propiedad numeroIdentidadTercero.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumeroIdentidadTercero(String value) {
        this.numeroIdentidadTercero = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTercero.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombreTercero() {
        return nombreTercero;
    }

    /**
     * Define el valor de la propiedad nombreTercero.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombreTercero(String value) {
        this.nombreTercero = value;
    }

    /**
     * Obtiene el valor de la propiedad detalle.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDetalle(String value) {
        this.detalle = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentaje.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCargo.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getMontoCargo() {
        return montoCargo;
    }

    /**
     * Define el valor de la propiedad montoCargo.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setMontoCargo(BigDecimal value) {
        this.montoCargo = value;
    }

}
