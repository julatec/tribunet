//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.27 a las 09:04:43 AM CST 
//


package cr.go.hacienda.tribunet.v42y2016.mensaje.hacienda;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="NombreEmisor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TipoIdentificacionEmisor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumeroCedulaEmisor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{9,12}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NombreReceptor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TipoIdentificacionReceptor" minOccurs="0"&gt;
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
 *         &lt;element name="NumeroCedulaReceptor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *               &lt;pattern value="\d{9,12}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mensaje"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DetalleMensaje"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
 *         &lt;element name="TotalFactura"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="18"/&gt;
 *               &lt;fractionDigits value="5"/&gt;
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
    "nombreEmisor",
    "tipoIdentificacionEmisor",
    "numeroCedulaEmisor",
    "nombreReceptor",
    "tipoIdentificacionReceptor",
    "numeroCedulaReceptor",
    "mensaje",
    "detalleMensaje",
    "montoTotalImpuesto",
    "totalFactura",
    "signature"
})
@XmlRootElement(name = "MensajeHacienda", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda")
public class MensajeHacienda {

    @XmlElement(name = "Clave", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda", required = true)
    protected String clave;
    @XmlElement(name = "NombreEmisor", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda", required = true)
    protected String nombreEmisor;
    @XmlElement(name = "TipoIdentificacionEmisor", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda", required = true)
    protected String tipoIdentificacionEmisor;
    @XmlElement(name = "NumeroCedulaEmisor", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda", required = true)
    protected String numeroCedulaEmisor;
    @XmlElement(name = "NombreReceptor", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda")
    protected String nombreReceptor;
    @XmlElement(name = "TipoIdentificacionReceptor", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda")
    protected String tipoIdentificacionReceptor;
    @XmlElement(name = "NumeroCedulaReceptor", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda")
    protected String numeroCedulaReceptor;
    @XmlElement(name = "Mensaje", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda", required = true)
    protected BigInteger mensaje;
    @XmlElement(name = "DetalleMensaje", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda", required = true)
    protected String detalleMensaje;
    @XmlElement(name = "MontoTotalImpuesto", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda")
    protected BigDecimal montoTotalImpuesto;
    @XmlElement(name = "TotalFactura", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/mensajeHacienda", required = true)
    protected BigDecimal totalFactura;
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
     * Obtiene el valor de la propiedad nombreEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmisor() {
        return nombreEmisor;
    }

    /**
     * Define el valor de la propiedad nombreEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmisor(String value) {
        this.nombreEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionEmisor() {
        return tipoIdentificacionEmisor;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionEmisor(String value) {
        this.tipoIdentificacionEmisor = value;
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
     * Obtiene el valor de la propiedad nombreReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreReceptor() {
        return nombreReceptor;
    }

    /**
     * Define el valor de la propiedad nombreReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreReceptor(String value) {
        this.nombreReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionReceptor() {
        return tipoIdentificacionReceptor;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionReceptor(String value) {
        this.tipoIdentificacionReceptor = value;
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
