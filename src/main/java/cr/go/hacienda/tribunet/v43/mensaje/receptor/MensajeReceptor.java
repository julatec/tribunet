//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.26 a las 09:04:07 PM CST 
//


package cr.go.hacienda.tribunet.v43.mensaje.receptor;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Clave"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{50,50}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumeroCedulaEmisor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *               &lt;pattern value="\d{9,12}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaEmisionDoc" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Mensaje"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DetalleMensaje" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="160"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MontoTotalImpuesto" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="18"/&gt;
 *               &lt;fractionDigits value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CodigoActividad" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CondicionImpuesto" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MontoTotalImpuestoAcreditar" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor}DecimalDineroType" minOccurs="0"/&gt;
 *         &lt;element name="MontoTotalDeGastoAplicable" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor}DecimalDineroType" minOccurs="0"/&gt;
 *         &lt;element name="TotalFactura"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="18"/&gt;
 *               &lt;fractionDigits value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumeroCedulaReceptor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *               &lt;pattern value="\d{9,12}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumeroConsecutivoReceptor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;pattern value="\d{20,20}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clave",
    "numeroCedulaEmisor",
    "fechaEmisionDoc",
    "mensaje",
    "detalleMensaje",
    "montoTotalImpuesto",
    "codigoActividad",
    "condicionImpuesto",
    "montoTotalImpuestoAcreditar",
    "montoTotalDeGastoAplicable",
    "totalFactura",
    "numeroCedulaReceptor",
    "numeroConsecutivoReceptor",
    "signature"
})
@XmlRootElement(name = "MensajeReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
public class MensajeReceptor {

    @XmlElement(name = "Clave", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String clave;
    @XmlElement(name = "NumeroCedulaEmisor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String numeroCedulaEmisor;
    @XmlElement(name = "FechaEmisionDoc", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmisionDoc;
    @XmlElement(name = "Mensaje", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected BigInteger mensaje;
    @XmlElement(name = "DetalleMensaje", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected String detalleMensaje;
    @XmlElement(name = "MontoTotalImpuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected BigDecimal montoTotalImpuesto;
    @XmlElement(name = "CodigoActividad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected String codigoActividad;
    @XmlElement(name = "CondicionImpuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected String condicionImpuesto;
    @XmlElement(name = "MontoTotalImpuestoAcreditar", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected BigDecimal montoTotalImpuestoAcreditar;
    @XmlElement(name = "MontoTotalDeGastoAplicable", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor")
    protected BigDecimal montoTotalDeGastoAplicable;
    @XmlElement(name = "TotalFactura", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected BigDecimal totalFactura;
    @XmlElement(name = "NumeroCedulaReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String numeroCedulaReceptor;
    @XmlElement(name = "NumeroConsecutivoReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor", required = true)
    protected String numeroConsecutivoReceptor;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCedulaEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaEmisor() {
        return numeroCedulaEmisor;
    }

    /**
     * Define el valor de la propiedad numeroCedulaEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaEmisor(String value) {
        this.numeroCedulaEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmisionDoc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmisionDoc() {
        return fechaEmisionDoc;
    }

    /**
     * Define el valor de la propiedad fechaEmisionDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmisionDoc(XMLGregorianCalendar value) {
        this.fechaEmisionDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMensaje(BigInteger value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleMensaje() {
        return detalleMensaje;
    }

    /**
     * Define el valor de la propiedad detalleMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleMensaje(String value) {
        this.detalleMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalImpuesto() {
        return montoTotalImpuesto;
    }

    /**
     * Define el valor de la propiedad montoTotalImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalImpuesto(BigDecimal value) {
        this.montoTotalImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividad() {
        return codigoActividad;
    }

    /**
     * Define el valor de la propiedad codigoActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividad(String value) {
        this.codigoActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionImpuesto() {
        return condicionImpuesto;
    }

    /**
     * Define el valor de la propiedad condicionImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionImpuesto(String value) {
        this.condicionImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalImpuestoAcreditar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalImpuestoAcreditar() {
        return montoTotalImpuestoAcreditar;
    }

    /**
     * Define el valor de la propiedad montoTotalImpuestoAcreditar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalImpuestoAcreditar(BigDecimal value) {
        this.montoTotalImpuestoAcreditar = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalDeGastoAplicable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalDeGastoAplicable() {
        return montoTotalDeGastoAplicable;
    }

    /**
     * Define el valor de la propiedad montoTotalDeGastoAplicable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalDeGastoAplicable(BigDecimal value) {
        this.montoTotalDeGastoAplicable = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFactura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFactura() {
        return totalFactura;
    }

    /**
     * Define el valor de la propiedad totalFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFactura(BigDecimal value) {
        this.totalFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCedulaReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaReceptor() {
        return numeroCedulaReceptor;
    }

    /**
     * Define el valor de la propiedad numeroCedulaReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaReceptor(String value) {
        this.numeroCedulaReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroConsecutivoReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConsecutivoReceptor() {
        return numeroConsecutivoReceptor;
    }

    /**
     * Define el valor de la propiedad numeroConsecutivoReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConsecutivoReceptor(String value) {
        this.numeroConsecutivoReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
