//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.26 a las 08:55:14 PM CST 
//


package cr.go.hacienda.tribunet.v42y2016.nota.credito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EmisorType complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="EmisorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombre"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Identificacion" type="{https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/notaCreditoElectronica}IdentificacionType"/&gt;
 *         &lt;element name="NombreComercial" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ubicacion" type="{https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/notaCreditoElectronica}UbicacionType"/&gt;
 *         &lt;element name="Telefono" type="{https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/notaCreditoElectronica}TelefonoType" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/notaCreditoElectronica}TelefonoType" minOccurs="0"/&gt;
 *         &lt;element name="CorreoElectronico"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmisorType", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/notaCreditoElectronica", propOrder = {
        "nombre",
        "identificacion",
        "nombreComercial",
        "ubicacion",
        "telefono",
        "fax",
        "correoElectronico"
})
public class EmisorType {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Identificacion", required = true)
    protected IdentificacionType identificacion;
    @XmlElement(name = "NombreComercial")
    protected String nombreComercial;
    @XmlElement(name = "Ubicacion", required = true)
    protected UbicacionType ubicacion;
    @XmlElementRef(name = "Telefono", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/notaCreditoElectronica", type = JAXBElement.class, required = false)
    protected JAXBElement<TelefonoType> telefono;
    @XmlElementRef(name = "Fax", namespace = "https://www.hacienda.go.cr/ATV/docs/esquemas/2016/v4.2/notaCreditoElectronica", type = JAXBElement.class, required = false)
    protected JAXBElement<TelefonoType> fax;
    @XmlElement(name = "CorreoElectronico", required = true)
    protected String correoElectronico;

    /**
     * Obtiene el valor de la propiedad nombre.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     *
     * @return possible object is
     * {@link IdentificacionType }
     */
    public IdentificacionType getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     *
     * @param value allowed object is
     *              {@link IdentificacionType }
     */
    public void setIdentificacion(IdentificacionType value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComercial.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     *
     * @return possible object is
     * {@link UbicacionType }
     */
    public UbicacionType getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     *
     * @param value allowed object is
     *              {@link UbicacionType }
     */
    public void setUbicacion(UbicacionType value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public JAXBElement<TelefonoType> getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public void setTelefono(JAXBElement<TelefonoType> value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public JAXBElement<TelefonoType> getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public void setFax(JAXBElement<TelefonoType> value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronico.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Define el valor de la propiedad correoElectronico.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

}
