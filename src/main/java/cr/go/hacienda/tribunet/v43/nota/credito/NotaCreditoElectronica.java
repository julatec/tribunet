//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.26 a las 09:04:48 PM CST 
//


package cr.go.hacienda.tribunet.v43.nota.credito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


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
 *         &lt;element name="Clave" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ClaveType"/&gt;
 *         &lt;element name="CodigoActividad"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;minLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumeroConsecutivo" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}NumeroConsecutivoType"/&gt;
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Emisor" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}EmisorType"/&gt;
 *         &lt;element name="Receptor" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ReceptorType" minOccurs="0"/&gt;
 *         &lt;element name="CondicionVenta"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="06"/&gt;
 *               &lt;enumeration value="07"/&gt;
 *               &lt;enumeration value="08"/&gt;
 *               &lt;enumeration value="09"/&gt;
 *               &lt;enumeration value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PlazoCredito" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedioPago" maxOccurs="4"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DetalleServicio" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LineaDetalle" maxOccurs="1000"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                             &lt;element name="PartidaArancelaria" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;minLength value="15"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Codigo" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="13"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoType" maxOccurs="5" minOccurs="0"/&gt;
 *                             &lt;element name="Cantidad"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                   &lt;totalDigits value="16"/&gt;
 *                                   &lt;fractionDigits value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}UnidadMedidaType"/&gt;
 *                             &lt;element name="UnidadMedidaComercial" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Detalle" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="200"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *                             &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *                             &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DescuentoType" maxOccurs="5" minOccurs="0"/&gt;
 *                             &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *                             &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                             &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                             &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}OtrosCargosType" maxOccurs="15" minOccurs="0"/&gt;
 *         &lt;element name="ResumenFactura"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CodigoTipoMoneda" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoMonedaType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalServGravados" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalServExentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalServExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalMercanciasGravadas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalMercanciasExentas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalMercExonerada" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalGravado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalExento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalVenta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *                   &lt;element name="TotalDescuentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalVentaNeta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *                   &lt;element name="TotalImpuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalIVADevuelto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalOtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalComprobante" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InformacionReferencia" maxOccurs="10" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoDoc"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="01"/&gt;
 *                         &lt;enumeration value="02"/&gt;
 *                         &lt;enumeration value="03"/&gt;
 *                         &lt;enumeration value="04"/&gt;
 *                         &lt;enumeration value="05"/&gt;
 *                         &lt;enumeration value="06"/&gt;
 *                         &lt;enumeration value="07"/&gt;
 *                         &lt;enumeration value="08"/&gt;
 *                         &lt;enumeration value="09"/&gt;
 *                         &lt;enumeration value="10"/&gt;
 *                         &lt;enumeration value="11"/&gt;
 *                         &lt;enumeration value="12"/&gt;
 *                         &lt;enumeration value="13"/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                         &lt;enumeration value=""/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Numero"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="Codigo"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="01"/&gt;
 *                         &lt;enumeration value="02"/&gt;
 *                         &lt;enumeration value="03"/&gt;
 *                         &lt;enumeration value="04"/&gt;
 *                         &lt;enumeration value="05"/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Razon"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="180"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Otros" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtroTexto" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OtroContenido" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any processContents='lax' namespace='##other'/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "codigoActividad",
    "numeroConsecutivo",
    "fechaEmision",
    "emisor",
    "receptor",
    "condicionVenta",
    "plazoCredito",
    "medioPago",
    "detalleServicio",
    "otrosCargos",
    "resumenFactura",
    "informacionReferencia",
    "otros",
    "signature"
})
@XmlRootElement(name = "NotaCreditoElectronica", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
public class NotaCreditoElectronica {

    @XmlElement(name = "Clave", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String clave;
    @XmlElement(name = "CodigoActividad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String codigoActividad;
    @XmlElement(name = "NumeroConsecutivo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String numeroConsecutivo;
    @XmlElement(name = "FechaEmision", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "Emisor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected EmisorType emisor;
    @XmlElement(name = "Receptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected ReceptorType receptor;
    @XmlElement(name = "CondicionVenta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String condicionVenta;
    @XmlElement(name = "PlazoCredito", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected String plazoCredito;
    @XmlElement(name = "MedioPago", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected List<String> medioPago;
    @XmlElement(name = "DetalleServicio", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected NotaCreditoElectronica.DetalleServicio detalleServicio;
    @XmlElement(name = "OtrosCargos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected List<OtrosCargosType> otrosCargos;
    @XmlElement(name = "ResumenFactura", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected NotaCreditoElectronica.ResumenFactura resumenFactura;
    @XmlElement(name = "InformacionReferencia", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected List<NotaCreditoElectronica.InformacionReferencia> informacionReferencia;
    @XmlElement(name = "Otros", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected NotaCreditoElectronica.Otros otros;
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
     * Obtiene el valor de la propiedad numeroConsecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConsecutivo() {
        return numeroConsecutivo;
    }

    /**
     * Define el valor de la propiedad numeroConsecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConsecutivo(String value) {
        this.numeroConsecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link EmisorType }
     *     
     */
    public EmisorType getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorType }
     *     
     */
    public void setEmisor(EmisorType value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorType }
     *     
     */
    public ReceptorType getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorType }
     *     
     */
    public void setReceptor(ReceptorType value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionVenta() {
        return condicionVenta;
    }

    /**
     * Define el valor de la propiedad condicionVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionVenta(String value) {
        this.condicionVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad plazoCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazoCredito() {
        return plazoCredito;
    }

    /**
     * Define el valor de la propiedad plazoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazoCredito(String value) {
        this.plazoCredito = value;
    }

    /**
     * Gets the value of the medioPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medioPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedioPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMedioPago() {
        if (medioPago == null) {
            medioPago = new ArrayList<String>();
        }
        return this.medioPago;
    }

    /**
     * Obtiene el valor de la propiedad detalleServicio.
     * 
     * @return
     *     possible object is
     *     {@link NotaCreditoElectronica.DetalleServicio }
     *     
     */
    public NotaCreditoElectronica.DetalleServicio getDetalleServicio() {
        return detalleServicio;
    }

    /**
     * Define el valor de la propiedad detalleServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaCreditoElectronica.DetalleServicio }
     *     
     */
    public void setDetalleServicio(NotaCreditoElectronica.DetalleServicio value) {
        this.detalleServicio = value;
    }

    /**
     * Gets the value of the otrosCargos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otrosCargos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtrosCargos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtrosCargosType }
     * 
     * 
     */
    public List<OtrosCargosType> getOtrosCargos() {
        if (otrosCargos == null) {
            otrosCargos = new ArrayList<OtrosCargosType>();
        }
        return this.otrosCargos;
    }

    /**
     * Obtiene el valor de la propiedad resumenFactura.
     * 
     * @return
     *     possible object is
     *     {@link NotaCreditoElectronica.ResumenFactura }
     *     
     */
    public NotaCreditoElectronica.ResumenFactura getResumenFactura() {
        return resumenFactura;
    }

    /**
     * Define el valor de la propiedad resumenFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaCreditoElectronica.ResumenFactura }
     *     
     */
    public void setResumenFactura(NotaCreditoElectronica.ResumenFactura value) {
        this.resumenFactura = value;
    }

    /**
     * Gets the value of the informacionReferencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionReferencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionReferencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaCreditoElectronica.InformacionReferencia }
     * 
     * 
     */
    public List<NotaCreditoElectronica.InformacionReferencia> getInformacionReferencia() {
        if (informacionReferencia == null) {
            informacionReferencia = new ArrayList<NotaCreditoElectronica.InformacionReferencia>();
        }
        return this.informacionReferencia;
    }

    /**
     * Obtiene el valor de la propiedad otros.
     * 
     * @return
     *     possible object is
     *     {@link NotaCreditoElectronica.Otros }
     *     
     */
    public NotaCreditoElectronica.Otros getOtros() {
        return otros;
    }

    /**
     * Define el valor de la propiedad otros.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaCreditoElectronica.Otros }
     *     
     */
    public void setOtros(NotaCreditoElectronica.Otros value) {
        this.otros = value;
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
     *         &lt;element name="LineaDetalle" maxOccurs="1000"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                   &lt;element name="PartidaArancelaria" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;minLength value="15"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Codigo" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="13"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoType" maxOccurs="5" minOccurs="0"/&gt;
     *                   &lt;element name="Cantidad"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                         &lt;totalDigits value="16"/&gt;
     *                         &lt;fractionDigits value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}UnidadMedidaType"/&gt;
     *                   &lt;element name="UnidadMedidaComercial" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Detalle" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="200"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
     *                   &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
     *                   &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DescuentoType" maxOccurs="5" minOccurs="0"/&gt;
     *                   &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
     *                   &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *                   &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *                   &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "lineaDetalle"
    })
    public static class DetalleServicio {

        @XmlElement(name = "LineaDetalle", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected List<NotaCreditoElectronica.DetalleServicio.LineaDetalle> lineaDetalle;

        /**
         * Gets the value of the lineaDetalle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineaDetalle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineaDetalle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotaCreditoElectronica.DetalleServicio.LineaDetalle }
         * 
         * 
         */
        public List<NotaCreditoElectronica.DetalleServicio.LineaDetalle> getLineaDetalle() {
            if (lineaDetalle == null) {
                lineaDetalle = new ArrayList<NotaCreditoElectronica.DetalleServicio.LineaDetalle>();
            }
            return this.lineaDetalle;
        }


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
         *         &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *         &lt;element name="PartidaArancelaria" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;minLength value="15"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Codigo" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="13"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoType" maxOccurs="5" minOccurs="0"/&gt;
         *         &lt;element name="Cantidad"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *               &lt;totalDigits value="16"/&gt;
         *               &lt;fractionDigits value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}UnidadMedidaType"/&gt;
         *         &lt;element name="UnidadMedidaComercial" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Detalle" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="200"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
         *         &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
         *         &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DescuentoType" maxOccurs="5" minOccurs="0"/&gt;
         *         &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
         *         &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
         *         &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
         *         &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
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
            "numeroLinea",
            "partidaArancelaria",
            "codigo",
            "codigoComercial",
            "cantidad",
            "unidadMedida",
            "unidadMedidaComercial",
            "detalle",
            "precioUnitario",
            "montoTotal",
            "descuento",
            "subTotal",
            "baseImponible",
            "impuesto",
            "impuestoNeto",
            "montoTotalLinea"
        })
        public static class LineaDetalle {

            @XmlElement(name = "NumeroLinea", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger numeroLinea;
            @XmlElement(name = "PartidaArancelaria", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String partidaArancelaria;
            @XmlElement(name = "Codigo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String codigo;
            @XmlElement(name = "CodigoComercial", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected List<CodigoType> codigoComercial;
            @XmlElement(name = "Cantidad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal cantidad;
            @XmlElement(name = "UnidadMedida", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected String unidadMedida;
            @XmlElement(name = "UnidadMedidaComercial", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String unidadMedidaComercial;
            @XmlElement(name = "Detalle", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String detalle;
            @XmlElement(name = "PrecioUnitario", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal precioUnitario;
            @XmlElement(name = "MontoTotal", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal montoTotal;
            @XmlElement(name = "Descuento", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected List<DescuentoType> descuento;
            @XmlElement(name = "SubTotal", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal subTotal;
            @XmlElement(name = "BaseImponible", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected BigDecimal baseImponible;
            @XmlElement(name = "Impuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected List<ImpuestoType> impuesto;
            @XmlElement(name = "ImpuestoNeto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected BigDecimal impuestoNeto;
            @XmlElement(name = "MontoTotalLinea", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal montoTotalLinea;

            /**
             * Obtiene el valor de la propiedad numeroLinea.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumeroLinea() {
                return numeroLinea;
            }

            /**
             * Define el valor de la propiedad numeroLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumeroLinea(BigInteger value) {
                this.numeroLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad partidaArancelaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartidaArancelaria() {
                return partidaArancelaria;
            }

            /**
             * Define el valor de la propiedad partidaArancelaria.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartidaArancelaria(String value) {
                this.partidaArancelaria = value;
            }

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

            /**
             * Gets the value of the codigoComercial property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the codigoComercial property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCodigoComercial().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CodigoType }
             * 
             * 
             */
            public List<CodigoType> getCodigoComercial() {
                if (codigoComercial == null) {
                    codigoComercial = new ArrayList<CodigoType>();
                }
                return this.codigoComercial;
            }

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadMedida.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidadMedida() {
                return unidadMedida;
            }

            /**
             * Define el valor de la propiedad unidadMedida.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidadMedida(String value) {
                this.unidadMedida = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadMedidaComercial.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidadMedidaComercial() {
                return unidadMedidaComercial;
            }

            /**
             * Define el valor de la propiedad unidadMedidaComercial.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidadMedidaComercial(String value) {
                this.unidadMedidaComercial = value;
            }

            /**
             * Obtiene el valor de la propiedad detalle.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetalle() {
                return detalle;
            }

            /**
             * Define el valor de la propiedad detalle.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetalle(String value) {
                this.detalle = value;
            }

            /**
             * Obtiene el valor de la propiedad precioUnitario.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrecioUnitario() {
                return precioUnitario;
            }

            /**
             * Define el valor de la propiedad precioUnitario.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrecioUnitario(BigDecimal value) {
                this.precioUnitario = value;
            }

            /**
             * Obtiene el valor de la propiedad montoTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotal() {
                return montoTotal;
            }

            /**
             * Define el valor de la propiedad montoTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotal(BigDecimal value) {
                this.montoTotal = value;
            }

            /**
             * Gets the value of the descuento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the descuento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescuento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DescuentoType }
             * 
             * 
             */
            public List<DescuentoType> getDescuento() {
                if (descuento == null) {
                    descuento = new ArrayList<DescuentoType>();
                }
                return this.descuento;
            }

            /**
             * Obtiene el valor de la propiedad subTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubTotal() {
                return subTotal;
            }

            /**
             * Define el valor de la propiedad subTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubTotal(BigDecimal value) {
                this.subTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad baseImponible.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseImponible() {
                return baseImponible;
            }

            /**
             * Define el valor de la propiedad baseImponible.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseImponible(BigDecimal value) {
                this.baseImponible = value;
            }

            /**
             * Gets the value of the impuesto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the impuesto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImpuesto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImpuestoType }
             * 
             * 
             */
            public List<ImpuestoType> getImpuesto() {
                if (impuesto == null) {
                    impuesto = new ArrayList<ImpuestoType>();
                }
                return this.impuesto;
            }

            /**
             * Obtiene el valor de la propiedad impuestoNeto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImpuestoNeto() {
                return impuestoNeto;
            }

            /**
             * Define el valor de la propiedad impuestoNeto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImpuestoNeto(BigDecimal value) {
                this.impuestoNeto = value;
            }

            /**
             * Obtiene el valor de la propiedad montoTotalLinea.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotalLinea() {
                return montoTotalLinea;
            }

            /**
             * Define el valor de la propiedad montoTotalLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotalLinea(BigDecimal value) {
                this.montoTotalLinea = value;
            }

        }

    }


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
     *         &lt;element name="TipoDoc"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="01"/&gt;
     *               &lt;enumeration value="02"/&gt;
     *               &lt;enumeration value="03"/&gt;
     *               &lt;enumeration value="04"/&gt;
     *               &lt;enumeration value="05"/&gt;
     *               &lt;enumeration value="06"/&gt;
     *               &lt;enumeration value="07"/&gt;
     *               &lt;enumeration value="08"/&gt;
     *               &lt;enumeration value="09"/&gt;
     *               &lt;enumeration value="10"/&gt;
     *               &lt;enumeration value="11"/&gt;
     *               &lt;enumeration value="12"/&gt;
     *               &lt;enumeration value="13"/&gt;
     *               &lt;enumeration value="99"/&gt;
     *               &lt;enumeration value=""/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Numero"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="Codigo"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="01"/&gt;
     *               &lt;enumeration value="02"/&gt;
     *               &lt;enumeration value="03"/&gt;
     *               &lt;enumeration value="04"/&gt;
     *               &lt;enumeration value="05"/&gt;
     *               &lt;enumeration value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Razon"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="180"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
        "tipoDoc",
        "numero",
        "fechaEmision",
        "codigo",
        "razon"
    })
    public static class InformacionReferencia {

        @XmlElement(name = "TipoDoc", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String tipoDoc;
        @XmlElement(name = "Numero", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String numero;
        @XmlElement(name = "FechaEmision", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaEmision;
        @XmlElement(name = "Codigo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String codigo;
        @XmlElement(name = "Razon", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String razon;

        /**
         * Obtiene el valor de la propiedad tipoDoc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDoc() {
            return tipoDoc;
        }

        /**
         * Define el valor de la propiedad tipoDoc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDoc(String value) {
            this.tipoDoc = value;
        }

        /**
         * Obtiene el valor de la propiedad numero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumero() {
            return numero;
        }

        /**
         * Define el valor de la propiedad numero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumero(String value) {
            this.numero = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaEmision.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaEmision() {
            return fechaEmision;
        }

        /**
         * Define el valor de la propiedad fechaEmision.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaEmision(XMLGregorianCalendar value) {
            this.fechaEmision = value;
        }

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad razon.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRazon() {
            return razon;
        }

        /**
         * Define el valor de la propiedad razon.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRazon(String value) {
            this.razon = value;
        }

    }


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
     *         &lt;element name="OtroTexto" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OtroContenido" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any processContents='lax' namespace='##other'/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "otroTexto",
        "otroContenido"
    })
    public static class Otros {

        @XmlElement(name = "OtroTexto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected List<NotaCreditoElectronica.Otros.OtroTexto> otroTexto;
        @XmlElement(name = "OtroContenido", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected List<NotaCreditoElectronica.Otros.OtroContenido> otroContenido;

        /**
         * Gets the value of the otroTexto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otroTexto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtroTexto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotaCreditoElectronica.Otros.OtroTexto }
         * 
         * 
         */
        public List<NotaCreditoElectronica.Otros.OtroTexto> getOtroTexto() {
            if (otroTexto == null) {
                otroTexto = new ArrayList<NotaCreditoElectronica.Otros.OtroTexto>();
            }
            return this.otroTexto;
        }

        /**
         * Gets the value of the otroContenido property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otroContenido property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtroContenido().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotaCreditoElectronica.Otros.OtroContenido }
         * 
         * 
         */
        public List<NotaCreditoElectronica.Otros.OtroContenido> getOtroContenido() {
            if (otroContenido == null) {
                otroContenido = new ArrayList<NotaCreditoElectronica.Otros.OtroContenido>();
            }
            return this.otroContenido;
        }


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
         *         &lt;any processContents='lax' namespace='##other'/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class OtroContenido {

            @XmlAnyElement(lax = true)
            protected Object any;
            @XmlAttribute(name = "codigo")
            protected String codigo;

            /**
             * Obtiene el valor de la propiedad any.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public Object getAny() {
                return any;
            }

            /**
             * Define el valor de la propiedad any.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public void setAny(Object value) {
                this.any = value;
            }

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OtroTexto {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "codigo")
            protected String codigo;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

        }

    }


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
     *         &lt;element name="CodigoTipoMoneda" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoMonedaType" minOccurs="0"/&gt;
     *         &lt;element name="TotalServGravados" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalServExentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalServExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalMercanciasGravadas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalMercanciasExentas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalMercExonerada" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalGravado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalExento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalVenta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
     *         &lt;element name="TotalDescuentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalVentaNeta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
     *         &lt;element name="TotalImpuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalIVADevuelto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalOtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalComprobante" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
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
        "codigoTipoMoneda",
        "totalServGravados",
        "totalServExentos",
        "totalServExonerado",
        "totalMercanciasGravadas",
        "totalMercanciasExentas",
        "totalMercExonerada",
        "totalGravado",
        "totalExento",
        "totalExonerado",
        "totalVenta",
        "totalDescuentos",
        "totalVentaNeta",
        "totalImpuesto",
        "totalIVADevuelto",
        "totalOtrosCargos",
        "totalComprobante"
    })
    public static class ResumenFactura {

        @XmlElement(name = "CodigoTipoMoneda", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected CodigoMonedaType codigoTipoMoneda;
        @XmlElement(name = "TotalServGravados", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalServGravados;
        @XmlElement(name = "TotalServExentos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalServExentos;
        @XmlElement(name = "TotalServExonerado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalServExonerado;
        @XmlElement(name = "TotalMercanciasGravadas", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalMercanciasGravadas;
        @XmlElement(name = "TotalMercanciasExentas", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalMercanciasExentas;
        @XmlElement(name = "TotalMercExonerada", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalMercExonerada;
        @XmlElement(name = "TotalGravado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalGravado;
        @XmlElement(name = "TotalExento", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalExento;
        @XmlElement(name = "TotalExonerado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalExonerado;
        @XmlElement(name = "TotalVenta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected BigDecimal totalVenta;
        @XmlElement(name = "TotalDescuentos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalDescuentos;
        @XmlElement(name = "TotalVentaNeta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected BigDecimal totalVentaNeta;
        @XmlElement(name = "TotalImpuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalImpuesto;
        @XmlElement(name = "TotalIVADevuelto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalIVADevuelto;
        @XmlElement(name = "TotalOtrosCargos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalOtrosCargos;
        @XmlElement(name = "TotalComprobante", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected BigDecimal totalComprobante;

        /**
         * Obtiene el valor de la propiedad codigoTipoMoneda.
         * 
         * @return
         *     possible object is
         *     {@link CodigoMonedaType }
         *     
         */
        public CodigoMonedaType getCodigoTipoMoneda() {
            return codigoTipoMoneda;
        }

        /**
         * Define el valor de la propiedad codigoTipoMoneda.
         * 
         * @param value
         *     allowed object is
         *     {@link CodigoMonedaType }
         *     
         */
        public void setCodigoTipoMoneda(CodigoMonedaType value) {
            this.codigoTipoMoneda = value;
        }

        /**
         * Obtiene el valor de la propiedad totalServGravados.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalServGravados() {
            return totalServGravados;
        }

        /**
         * Define el valor de la propiedad totalServGravados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalServGravados(BigDecimal value) {
            this.totalServGravados = value;
        }

        /**
         * Obtiene el valor de la propiedad totalServExentos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalServExentos() {
            return totalServExentos;
        }

        /**
         * Define el valor de la propiedad totalServExentos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalServExentos(BigDecimal value) {
            this.totalServExentos = value;
        }

        /**
         * Obtiene el valor de la propiedad totalServExonerado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalServExonerado() {
            return totalServExonerado;
        }

        /**
         * Define el valor de la propiedad totalServExonerado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalServExonerado(BigDecimal value) {
            this.totalServExonerado = value;
        }

        /**
         * Obtiene el valor de la propiedad totalMercanciasGravadas.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMercanciasGravadas() {
            return totalMercanciasGravadas;
        }

        /**
         * Define el valor de la propiedad totalMercanciasGravadas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMercanciasGravadas(BigDecimal value) {
            this.totalMercanciasGravadas = value;
        }

        /**
         * Obtiene el valor de la propiedad totalMercanciasExentas.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMercanciasExentas() {
            return totalMercanciasExentas;
        }

        /**
         * Define el valor de la propiedad totalMercanciasExentas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMercanciasExentas(BigDecimal value) {
            this.totalMercanciasExentas = value;
        }

        /**
         * Obtiene el valor de la propiedad totalMercExonerada.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMercExonerada() {
            return totalMercExonerada;
        }

        /**
         * Define el valor de la propiedad totalMercExonerada.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMercExonerada(BigDecimal value) {
            this.totalMercExonerada = value;
        }

        /**
         * Obtiene el valor de la propiedad totalGravado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGravado() {
            return totalGravado;
        }

        /**
         * Define el valor de la propiedad totalGravado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGravado(BigDecimal value) {
            this.totalGravado = value;
        }

        /**
         * Obtiene el valor de la propiedad totalExento.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalExento() {
            return totalExento;
        }

        /**
         * Define el valor de la propiedad totalExento.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalExento(BigDecimal value) {
            this.totalExento = value;
        }

        /**
         * Obtiene el valor de la propiedad totalExonerado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalExonerado() {
            return totalExonerado;
        }

        /**
         * Define el valor de la propiedad totalExonerado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalExonerado(BigDecimal value) {
            this.totalExonerado = value;
        }

        /**
         * Obtiene el valor de la propiedad totalVenta.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalVenta() {
            return totalVenta;
        }

        /**
         * Define el valor de la propiedad totalVenta.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalVenta(BigDecimal value) {
            this.totalVenta = value;
        }

        /**
         * Obtiene el valor de la propiedad totalDescuentos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalDescuentos() {
            return totalDescuentos;
        }

        /**
         * Define el valor de la propiedad totalDescuentos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalDescuentos(BigDecimal value) {
            this.totalDescuentos = value;
        }

        /**
         * Obtiene el valor de la propiedad totalVentaNeta.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalVentaNeta() {
            return totalVentaNeta;
        }

        /**
         * Define el valor de la propiedad totalVentaNeta.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalVentaNeta(BigDecimal value) {
            this.totalVentaNeta = value;
        }

        /**
         * Obtiene el valor de la propiedad totalImpuesto.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuesto() {
            return totalImpuesto;
        }

        /**
         * Define el valor de la propiedad totalImpuesto.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalImpuesto(BigDecimal value) {
            this.totalImpuesto = value;
        }

        /**
         * Obtiene el valor de la propiedad totalIVADevuelto.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalIVADevuelto() {
            return totalIVADevuelto;
        }

        /**
         * Define el valor de la propiedad totalIVADevuelto.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalIVADevuelto(BigDecimal value) {
            this.totalIVADevuelto = value;
        }

        /**
         * Obtiene el valor de la propiedad totalOtrosCargos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalOtrosCargos() {
            return totalOtrosCargos;
        }

        /**
         * Define el valor de la propiedad totalOtrosCargos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalOtrosCargos(BigDecimal value) {
            this.totalOtrosCargos = value;
        }

        /**
         * Obtiene el valor de la propiedad totalComprobante.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalComprobante() {
            return totalComprobante;
        }

        /**
         * Define el valor de la propiedad totalComprobante.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalComprobante(BigDecimal value) {
            this.totalComprobante = value;
        }

    }

}
