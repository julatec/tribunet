//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.27 a las 09:10:51 AM CST 
//


package cr.go.hacienda.tribunet.v42y2017.tiquete;

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
 *         &lt;element name="Clave" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}ClaveType"/&gt;
 *         &lt;element name="NumeroConsecutivo" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}NumeroConsecutivoType"/&gt;
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Emisor" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}EmisorType"/&gt;
 *         &lt;element name="Receptor" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}ReceptorType" minOccurs="0"/&gt;
 *         &lt;element name="CondicionVenta"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="06"/&gt;
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
 *         &lt;element name="DetalleServicio"&gt;
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
 *                             &lt;element name="Codigo" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}CodigoType" maxOccurs="5" minOccurs="0"/&gt;
 *                             &lt;element name="Cantidad"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                   &lt;totalDigits value="16"/&gt;
 *                                   &lt;fractionDigits value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="UnidadMedida" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}UnidadMedidaType"/&gt;
 *                             &lt;element name="UnidadMedidaComercial" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Detalle"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="160"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PrecioUnitario" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
 *                             &lt;element name="MontoTotal" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
 *                             &lt;element name="MontoDescuento" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                             &lt;element name="NaturalezaDescuento" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="80"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SubTotal" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
 *                             &lt;element name="Impuesto" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="MontoTotalLinea" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
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
 *         &lt;element name="ResumenFactura"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CodigoMoneda" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="AED"/&gt;
 *                         &lt;enumeration value="AFN"/&gt;
 *                         &lt;enumeration value="ALL"/&gt;
 *                         &lt;enumeration value="AMD"/&gt;
 *                         &lt;enumeration value="ANG"/&gt;
 *                         &lt;enumeration value="AOA"/&gt;
 *                         &lt;enumeration value="ARS"/&gt;
 *                         &lt;enumeration value="AUD"/&gt;
 *                         &lt;enumeration value="AWG"/&gt;
 *                         &lt;enumeration value="AZN"/&gt;
 *                         &lt;enumeration value="BAM"/&gt;
 *                         &lt;enumeration value="BBD"/&gt;
 *                         &lt;enumeration value="BDT"/&gt;
 *                         &lt;enumeration value="BGN"/&gt;
 *                         &lt;enumeration value="BHD"/&gt;
 *                         &lt;enumeration value="BIF"/&gt;
 *                         &lt;enumeration value="BMD"/&gt;
 *                         &lt;enumeration value="BND"/&gt;
 *                         &lt;enumeration value="BOB"/&gt;
 *                         &lt;enumeration value="BOV"/&gt;
 *                         &lt;enumeration value="BRL"/&gt;
 *                         &lt;enumeration value="BSD"/&gt;
 *                         &lt;enumeration value="BTN"/&gt;
 *                         &lt;enumeration value="BWP"/&gt;
 *                         &lt;enumeration value="BYR"/&gt;
 *                         &lt;enumeration value="BZD"/&gt;
 *                         &lt;enumeration value="CAD"/&gt;
 *                         &lt;enumeration value="CDF"/&gt;
 *                         &lt;enumeration value="CHE"/&gt;
 *                         &lt;enumeration value="CHF"/&gt;
 *                         &lt;enumeration value="CHW"/&gt;
 *                         &lt;enumeration value="CLF"/&gt;
 *                         &lt;enumeration value="CLP"/&gt;
 *                         &lt;enumeration value="CNY"/&gt;
 *                         &lt;enumeration value="COP"/&gt;
 *                         &lt;enumeration value="COU"/&gt;
 *                         &lt;enumeration value="CRC"/&gt;
 *                         &lt;enumeration value="CUC"/&gt;
 *                         &lt;enumeration value="CUP"/&gt;
 *                         &lt;enumeration value="CVE"/&gt;
 *                         &lt;enumeration value="CZK"/&gt;
 *                         &lt;enumeration value="DJF"/&gt;
 *                         &lt;enumeration value="DKK"/&gt;
 *                         &lt;enumeration value="DOP"/&gt;
 *                         &lt;enumeration value="DZD"/&gt;
 *                         &lt;enumeration value="EGP"/&gt;
 *                         &lt;enumeration value="ERN"/&gt;
 *                         &lt;enumeration value="ETB"/&gt;
 *                         &lt;enumeration value="EUR"/&gt;
 *                         &lt;enumeration value="FJD"/&gt;
 *                         &lt;enumeration value="FKP"/&gt;
 *                         &lt;enumeration value="GBP"/&gt;
 *                         &lt;enumeration value="GEL"/&gt;
 *                         &lt;enumeration value="GHS"/&gt;
 *                         &lt;enumeration value="GIP"/&gt;
 *                         &lt;enumeration value="GMD"/&gt;
 *                         &lt;enumeration value="GNF"/&gt;
 *                         &lt;enumeration value="GTQ"/&gt;
 *                         &lt;enumeration value="GYD"/&gt;
 *                         &lt;enumeration value="HKD"/&gt;
 *                         &lt;enumeration value="HNL"/&gt;
 *                         &lt;enumeration value="HRK"/&gt;
 *                         &lt;enumeration value="HTG"/&gt;
 *                         &lt;enumeration value="HUF"/&gt;
 *                         &lt;enumeration value="IDR"/&gt;
 *                         &lt;enumeration value="ILS"/&gt;
 *                         &lt;enumeration value="INR"/&gt;
 *                         &lt;enumeration value="IQD"/&gt;
 *                         &lt;enumeration value="IRR"/&gt;
 *                         &lt;enumeration value="ISK"/&gt;
 *                         &lt;enumeration value="JMD"/&gt;
 *                         &lt;enumeration value="JOD"/&gt;
 *                         &lt;enumeration value="JPY"/&gt;
 *                         &lt;enumeration value="KES"/&gt;
 *                         &lt;enumeration value="KGS"/&gt;
 *                         &lt;enumeration value="KHR"/&gt;
 *                         &lt;enumeration value="KMF"/&gt;
 *                         &lt;enumeration value="KPW"/&gt;
 *                         &lt;enumeration value="KRW"/&gt;
 *                         &lt;enumeration value="KWD"/&gt;
 *                         &lt;enumeration value="KYD"/&gt;
 *                         &lt;enumeration value="KZT"/&gt;
 *                         &lt;enumeration value="LAK"/&gt;
 *                         &lt;enumeration value="LBP"/&gt;
 *                         &lt;enumeration value="LKR"/&gt;
 *                         &lt;enumeration value="LRD"/&gt;
 *                         &lt;enumeration value="LSL"/&gt;
 *                         &lt;enumeration value="LYD"/&gt;
 *                         &lt;enumeration value="MAD"/&gt;
 *                         &lt;enumeration value="MDL"/&gt;
 *                         &lt;enumeration value="MGA"/&gt;
 *                         &lt;enumeration value="MKD"/&gt;
 *                         &lt;enumeration value="MMK"/&gt;
 *                         &lt;enumeration value="MNT"/&gt;
 *                         &lt;enumeration value="MOP"/&gt;
 *                         &lt;enumeration value="MRO"/&gt;
 *                         &lt;enumeration value="MUR"/&gt;
 *                         &lt;enumeration value="MVR"/&gt;
 *                         &lt;enumeration value="MWK"/&gt;
 *                         &lt;enumeration value="MXN"/&gt;
 *                         &lt;enumeration value="MXV"/&gt;
 *                         &lt;enumeration value="MYR"/&gt;
 *                         &lt;enumeration value="MZN"/&gt;
 *                         &lt;enumeration value="NAD"/&gt;
 *                         &lt;enumeration value="NGN"/&gt;
 *                         &lt;enumeration value="NIO"/&gt;
 *                         &lt;enumeration value="NOK"/&gt;
 *                         &lt;enumeration value="NPR"/&gt;
 *                         &lt;enumeration value="NZD"/&gt;
 *                         &lt;enumeration value="OMR"/&gt;
 *                         &lt;enumeration value="PAB"/&gt;
 *                         &lt;enumeration value="PEN"/&gt;
 *                         &lt;enumeration value="PGK"/&gt;
 *                         &lt;enumeration value="PHP"/&gt;
 *                         &lt;enumeration value="PKR"/&gt;
 *                         &lt;enumeration value="PLN"/&gt;
 *                         &lt;enumeration value="PYG"/&gt;
 *                         &lt;enumeration value="QAR"/&gt;
 *                         &lt;enumeration value="RON"/&gt;
 *                         &lt;enumeration value="RSD"/&gt;
 *                         &lt;enumeration value="RUB"/&gt;
 *                         &lt;enumeration value="RWF"/&gt;
 *                         &lt;enumeration value="SAR"/&gt;
 *                         &lt;enumeration value="SBD"/&gt;
 *                         &lt;enumeration value="SCR"/&gt;
 *                         &lt;enumeration value="SDG"/&gt;
 *                         &lt;enumeration value="SEK"/&gt;
 *                         &lt;enumeration value="SGD"/&gt;
 *                         &lt;enumeration value="SHP"/&gt;
 *                         &lt;enumeration value="SLL"/&gt;
 *                         &lt;enumeration value="SOS"/&gt;
 *                         &lt;enumeration value="SRD"/&gt;
 *                         &lt;enumeration value="SSP"/&gt;
 *                         &lt;enumeration value="STD"/&gt;
 *                         &lt;enumeration value="SVC"/&gt;
 *                         &lt;enumeration value="SYP"/&gt;
 *                         &lt;enumeration value="SZL"/&gt;
 *                         &lt;enumeration value="THB"/&gt;
 *                         &lt;enumeration value="TJS"/&gt;
 *                         &lt;enumeration value="TMT"/&gt;
 *                         &lt;enumeration value="TND"/&gt;
 *                         &lt;enumeration value="TOP"/&gt;
 *                         &lt;enumeration value="TRY"/&gt;
 *                         &lt;enumeration value="TTD"/&gt;
 *                         &lt;enumeration value="TWD"/&gt;
 *                         &lt;enumeration value="TZS"/&gt;
 *                         &lt;enumeration value="UAH"/&gt;
 *                         &lt;enumeration value="UGX"/&gt;
 *                         &lt;enumeration value="USD"/&gt;
 *                         &lt;enumeration value="USN"/&gt;
 *                         &lt;enumeration value="UYI"/&gt;
 *                         &lt;enumeration value="UYU"/&gt;
 *                         &lt;enumeration value="UZS"/&gt;
 *                         &lt;enumeration value="VEF"/&gt;
 *                         &lt;enumeration value="VND"/&gt;
 *                         &lt;enumeration value="VUV"/&gt;
 *                         &lt;enumeration value="WST"/&gt;
 *                         &lt;enumeration value="XAF"/&gt;
 *                         &lt;enumeration value="XAG"/&gt;
 *                         &lt;enumeration value="XAU"/&gt;
 *                         &lt;enumeration value="XBA"/&gt;
 *                         &lt;enumeration value="XBB"/&gt;
 *                         &lt;enumeration value="XBC"/&gt;
 *                         &lt;enumeration value="XBD"/&gt;
 *                         &lt;enumeration value="XCD"/&gt;
 *                         &lt;enumeration value="XDR"/&gt;
 *                         &lt;enumeration value="XOF"/&gt;
 *                         &lt;enumeration value="XPD"/&gt;
 *                         &lt;enumeration value="XPF"/&gt;
 *                         &lt;enumeration value="XPT"/&gt;
 *                         &lt;enumeration value="XSU"/&gt;
 *                         &lt;enumeration value="XTS"/&gt;
 *                         &lt;enumeration value="XUA"/&gt;
 *                         &lt;enumeration value="XXX"/&gt;
 *                         &lt;enumeration value="YER"/&gt;
 *                         &lt;enumeration value="ZAR"/&gt;
 *                         &lt;enumeration value="ZMW"/&gt;
 *                         &lt;enumeration value="ZWL"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TipoCambio" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalServGravados" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalServExentos" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalMercanciasGravadas" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalMercanciasExentas" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalGravado" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalExento" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalVenta" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
 *                   &lt;element name="TotalDescuentos" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalVentaNeta" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
 *                   &lt;element name="TotalImpuesto" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
 *                   &lt;element name="TotalComprobante" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
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
 *                         &lt;enumeration value="99"/&gt;
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
 *         &lt;element name="Normativa"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NumeroResolucion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="13"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FechaResolucion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
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
    "numeroConsecutivo",
    "fechaEmision",
    "emisor",
    "receptor",
    "condicionVenta",
    "plazoCredito",
    "medioPago",
    "detalleServicio",
    "resumenFactura",
    "informacionReferencia",
    "normativa",
    "otros",
    "signature"
})
@XmlRootElement(name = "TiqueteElectronico", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
public class TiqueteElectronico {

    @XmlElement(name = "Clave", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected String clave;
    @XmlElement(name = "NumeroConsecutivo", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected String numeroConsecutivo;
    @XmlElement(name = "FechaEmision", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "Emisor", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected EmisorType emisor;
    @XmlElement(name = "Receptor", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
    protected ReceptorType receptor;
    @XmlElement(name = "CondicionVenta", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected String condicionVenta;
    @XmlElement(name = "PlazoCredito", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
    protected String plazoCredito;
    @XmlElement(name = "MedioPago", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected List<String> medioPago;
    @XmlElement(name = "DetalleServicio", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected TiqueteElectronico.DetalleServicio detalleServicio;
    @XmlElement(name = "ResumenFactura", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected TiqueteElectronico.ResumenFactura resumenFactura;
    @XmlElement(name = "InformacionReferencia", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
    protected List<TiqueteElectronico.InformacionReferencia> informacionReferencia;
    @XmlElement(name = "Normativa", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
    protected TiqueteElectronico.Normativa normativa;
    @XmlElement(name = "Otros", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
    protected TiqueteElectronico.Otros otros;
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
     *     {@link TiqueteElectronico.DetalleServicio }
     *     
     */
    public TiqueteElectronico.DetalleServicio getDetalleServicio() {
        return detalleServicio;
    }

    /**
     * Define el valor de la propiedad detalleServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link TiqueteElectronico.DetalleServicio }
     *     
     */
    public void setDetalleServicio(TiqueteElectronico.DetalleServicio value) {
        this.detalleServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad resumenFactura.
     * 
     * @return
     *     possible object is
     *     {@link TiqueteElectronico.ResumenFactura }
     *     
     */
    public TiqueteElectronico.ResumenFactura getResumenFactura() {
        return resumenFactura;
    }

    /**
     * Define el valor de la propiedad resumenFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link TiqueteElectronico.ResumenFactura }
     *     
     */
    public void setResumenFactura(TiqueteElectronico.ResumenFactura value) {
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
     * {@link TiqueteElectronico.InformacionReferencia }
     * 
     * 
     */
    public List<TiqueteElectronico.InformacionReferencia> getInformacionReferencia() {
        if (informacionReferencia == null) {
            informacionReferencia = new ArrayList<TiqueteElectronico.InformacionReferencia>();
        }
        return this.informacionReferencia;
    }

    /**
     * Obtiene el valor de la propiedad normativa.
     * 
     * @return
     *     possible object is
     *     {@link TiqueteElectronico.Normativa }
     *     
     */
    public TiqueteElectronico.Normativa getNormativa() {
        return normativa;
    }

    /**
     * Define el valor de la propiedad normativa.
     * 
     * @param value
     *     allowed object is
     *     {@link TiqueteElectronico.Normativa }
     *     
     */
    public void setNormativa(TiqueteElectronico.Normativa value) {
        this.normativa = value;
    }

    /**
     * Obtiene el valor de la propiedad otros.
     * 
     * @return
     *     possible object is
     *     {@link TiqueteElectronico.Otros }
     *     
     */
    public TiqueteElectronico.Otros getOtros() {
        return otros;
    }

    /**
     * Define el valor de la propiedad otros.
     * 
     * @param value
     *     allowed object is
     *     {@link TiqueteElectronico.Otros }
     *     
     */
    public void setOtros(TiqueteElectronico.Otros value) {
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
     *                   &lt;element name="Codigo" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}CodigoType" maxOccurs="5" minOccurs="0"/&gt;
     *                   &lt;element name="Cantidad"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                         &lt;totalDigits value="16"/&gt;
     *                         &lt;fractionDigits value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="UnidadMedida" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}UnidadMedidaType"/&gt;
     *                   &lt;element name="UnidadMedidaComercial" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Detalle"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="160"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PrecioUnitario" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
     *                   &lt;element name="MontoTotal" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
     *                   &lt;element name="MontoDescuento" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *                   &lt;element name="NaturalezaDescuento" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="80"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SubTotal" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
     *                   &lt;element name="Impuesto" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="MontoTotalLinea" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
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

        @XmlElement(name = "LineaDetalle", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected List<TiqueteElectronico.DetalleServicio.LineaDetalle> lineaDetalle;

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
         * {@link TiqueteElectronico.DetalleServicio.LineaDetalle }
         * 
         * 
         */
        public List<TiqueteElectronico.DetalleServicio.LineaDetalle> getLineaDetalle() {
            if (lineaDetalle == null) {
                lineaDetalle = new ArrayList<TiqueteElectronico.DetalleServicio.LineaDetalle>();
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
         *         &lt;element name="Codigo" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}CodigoType" maxOccurs="5" minOccurs="0"/&gt;
         *         &lt;element name="Cantidad"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *               &lt;totalDigits value="16"/&gt;
         *               &lt;fractionDigits value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="UnidadMedida" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}UnidadMedidaType"/&gt;
         *         &lt;element name="UnidadMedidaComercial" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
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
         *         &lt;element name="PrecioUnitario" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
         *         &lt;element name="MontoTotal" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
         *         &lt;element name="MontoDescuento" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
         *         &lt;element name="NaturalezaDescuento" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="80"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SubTotal" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
         *         &lt;element name="Impuesto" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="MontoTotalLinea" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
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
            "codigo",
            "cantidad",
            "unidadMedida",
            "unidadMedidaComercial",
            "detalle",
            "precioUnitario",
            "montoTotal",
            "montoDescuento",
            "naturalezaDescuento",
            "subTotal",
            "impuesto",
            "montoTotalLinea"
        })
        public static class LineaDetalle {

            @XmlElement(name = "NumeroLinea", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger numeroLinea;
            @XmlElement(name = "Codigo", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
            protected List<CodigoType> codigo;
            @XmlElement(name = "Cantidad", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
            protected BigDecimal cantidad;
            @XmlElement(name = "UnidadMedida", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
            protected String unidadMedida;
            @XmlElement(name = "UnidadMedidaComercial", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
            protected String unidadMedidaComercial;
            @XmlElement(name = "Detalle", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
            protected String detalle;
            @XmlElement(name = "PrecioUnitario", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
            protected BigDecimal precioUnitario;
            @XmlElement(name = "MontoTotal", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
            protected BigDecimal montoTotal;
            @XmlElement(name = "MontoDescuento", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
            protected BigDecimal montoDescuento;
            @XmlElement(name = "NaturalezaDescuento", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
            protected String naturalezaDescuento;
            @XmlElement(name = "SubTotal", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
            protected BigDecimal subTotal;
            @XmlElement(name = "Impuesto", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
            protected List<ImpuestoType> impuesto;
            @XmlElement(name = "MontoTotalLinea", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
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
             * Gets the value of the codigo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the codigo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCodigo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CodigoType }
             * 
             * 
             */
            public List<CodigoType> getCodigo() {
                if (codigo == null) {
                    codigo = new ArrayList<CodigoType>();
                }
                return this.codigo;
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
             * Obtiene el valor de la propiedad montoDescuento.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoDescuento() {
                return montoDescuento;
            }

            /**
             * Define el valor de la propiedad montoDescuento.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoDescuento(BigDecimal value) {
                this.montoDescuento = value;
            }

            /**
             * Obtiene el valor de la propiedad naturalezaDescuento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaturalezaDescuento() {
                return naturalezaDescuento;
            }

            /**
             * Define el valor de la propiedad naturalezaDescuento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaturalezaDescuento(String value) {
                this.naturalezaDescuento = value;
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
     *               &lt;enumeration value="99"/&gt;
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

        @XmlElement(name = "TipoDoc", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected String tipoDoc;
        @XmlElement(name = "Numero", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected String numero;
        @XmlElement(name = "FechaEmision", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaEmision;
        @XmlElement(name = "Codigo", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected String codigo;
        @XmlElement(name = "Razon", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
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
     *         &lt;element name="NumeroResolucion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="13"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FechaResolucion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
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
        "numeroResolucion",
        "fechaResolucion"
    })
    public static class Normativa {

        @XmlElement(name = "NumeroResolucion", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected String numeroResolucion;
        @XmlElement(name = "FechaResolucion", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected String fechaResolucion;

        /**
         * Obtiene el valor de la propiedad numeroResolucion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroResolucion() {
            return numeroResolucion;
        }

        /**
         * Define el valor de la propiedad numeroResolucion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroResolucion(String value) {
            this.numeroResolucion = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaResolucion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaResolucion() {
            return fechaResolucion;
        }

        /**
         * Define el valor de la propiedad fechaResolucion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaResolucion(String value) {
            this.fechaResolucion = value;
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

        @XmlElement(name = "OtroTexto", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected List<TiqueteElectronico.Otros.OtroTexto> otroTexto;
        @XmlElement(name = "OtroContenido", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected List<TiqueteElectronico.Otros.OtroContenido> otroContenido;

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
         * {@link TiqueteElectronico.Otros.OtroTexto }
         * 
         * 
         */
        public List<TiqueteElectronico.Otros.OtroTexto> getOtroTexto() {
            if (otroTexto == null) {
                otroTexto = new ArrayList<TiqueteElectronico.Otros.OtroTexto>();
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
         * {@link TiqueteElectronico.Otros.OtroContenido }
         * 
         * 
         */
        public List<TiqueteElectronico.Otros.OtroContenido> getOtroContenido() {
            if (otroContenido == null) {
                otroContenido = new ArrayList<TiqueteElectronico.Otros.OtroContenido>();
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
             *     {@link Element }
             *     {@link Object }
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
             *     {@link Element }
             *     {@link Object }
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
     *         &lt;element name="CodigoMoneda" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="AED"/&gt;
     *               &lt;enumeration value="AFN"/&gt;
     *               &lt;enumeration value="ALL"/&gt;
     *               &lt;enumeration value="AMD"/&gt;
     *               &lt;enumeration value="ANG"/&gt;
     *               &lt;enumeration value="AOA"/&gt;
     *               &lt;enumeration value="ARS"/&gt;
     *               &lt;enumeration value="AUD"/&gt;
     *               &lt;enumeration value="AWG"/&gt;
     *               &lt;enumeration value="AZN"/&gt;
     *               &lt;enumeration value="BAM"/&gt;
     *               &lt;enumeration value="BBD"/&gt;
     *               &lt;enumeration value="BDT"/&gt;
     *               &lt;enumeration value="BGN"/&gt;
     *               &lt;enumeration value="BHD"/&gt;
     *               &lt;enumeration value="BIF"/&gt;
     *               &lt;enumeration value="BMD"/&gt;
     *               &lt;enumeration value="BND"/&gt;
     *               &lt;enumeration value="BOB"/&gt;
     *               &lt;enumeration value="BOV"/&gt;
     *               &lt;enumeration value="BRL"/&gt;
     *               &lt;enumeration value="BSD"/&gt;
     *               &lt;enumeration value="BTN"/&gt;
     *               &lt;enumeration value="BWP"/&gt;
     *               &lt;enumeration value="BYR"/&gt;
     *               &lt;enumeration value="BZD"/&gt;
     *               &lt;enumeration value="CAD"/&gt;
     *               &lt;enumeration value="CDF"/&gt;
     *               &lt;enumeration value="CHE"/&gt;
     *               &lt;enumeration value="CHF"/&gt;
     *               &lt;enumeration value="CHW"/&gt;
     *               &lt;enumeration value="CLF"/&gt;
     *               &lt;enumeration value="CLP"/&gt;
     *               &lt;enumeration value="CNY"/&gt;
     *               &lt;enumeration value="COP"/&gt;
     *               &lt;enumeration value="COU"/&gt;
     *               &lt;enumeration value="CRC"/&gt;
     *               &lt;enumeration value="CUC"/&gt;
     *               &lt;enumeration value="CUP"/&gt;
     *               &lt;enumeration value="CVE"/&gt;
     *               &lt;enumeration value="CZK"/&gt;
     *               &lt;enumeration value="DJF"/&gt;
     *               &lt;enumeration value="DKK"/&gt;
     *               &lt;enumeration value="DOP"/&gt;
     *               &lt;enumeration value="DZD"/&gt;
     *               &lt;enumeration value="EGP"/&gt;
     *               &lt;enumeration value="ERN"/&gt;
     *               &lt;enumeration value="ETB"/&gt;
     *               &lt;enumeration value="EUR"/&gt;
     *               &lt;enumeration value="FJD"/&gt;
     *               &lt;enumeration value="FKP"/&gt;
     *               &lt;enumeration value="GBP"/&gt;
     *               &lt;enumeration value="GEL"/&gt;
     *               &lt;enumeration value="GHS"/&gt;
     *               &lt;enumeration value="GIP"/&gt;
     *               &lt;enumeration value="GMD"/&gt;
     *               &lt;enumeration value="GNF"/&gt;
     *               &lt;enumeration value="GTQ"/&gt;
     *               &lt;enumeration value="GYD"/&gt;
     *               &lt;enumeration value="HKD"/&gt;
     *               &lt;enumeration value="HNL"/&gt;
     *               &lt;enumeration value="HRK"/&gt;
     *               &lt;enumeration value="HTG"/&gt;
     *               &lt;enumeration value="HUF"/&gt;
     *               &lt;enumeration value="IDR"/&gt;
     *               &lt;enumeration value="ILS"/&gt;
     *               &lt;enumeration value="INR"/&gt;
     *               &lt;enumeration value="IQD"/&gt;
     *               &lt;enumeration value="IRR"/&gt;
     *               &lt;enumeration value="ISK"/&gt;
     *               &lt;enumeration value="JMD"/&gt;
     *               &lt;enumeration value="JOD"/&gt;
     *               &lt;enumeration value="JPY"/&gt;
     *               &lt;enumeration value="KES"/&gt;
     *               &lt;enumeration value="KGS"/&gt;
     *               &lt;enumeration value="KHR"/&gt;
     *               &lt;enumeration value="KMF"/&gt;
     *               &lt;enumeration value="KPW"/&gt;
     *               &lt;enumeration value="KRW"/&gt;
     *               &lt;enumeration value="KWD"/&gt;
     *               &lt;enumeration value="KYD"/&gt;
     *               &lt;enumeration value="KZT"/&gt;
     *               &lt;enumeration value="LAK"/&gt;
     *               &lt;enumeration value="LBP"/&gt;
     *               &lt;enumeration value="LKR"/&gt;
     *               &lt;enumeration value="LRD"/&gt;
     *               &lt;enumeration value="LSL"/&gt;
     *               &lt;enumeration value="LYD"/&gt;
     *               &lt;enumeration value="MAD"/&gt;
     *               &lt;enumeration value="MDL"/&gt;
     *               &lt;enumeration value="MGA"/&gt;
     *               &lt;enumeration value="MKD"/&gt;
     *               &lt;enumeration value="MMK"/&gt;
     *               &lt;enumeration value="MNT"/&gt;
     *               &lt;enumeration value="MOP"/&gt;
     *               &lt;enumeration value="MRO"/&gt;
     *               &lt;enumeration value="MUR"/&gt;
     *               &lt;enumeration value="MVR"/&gt;
     *               &lt;enumeration value="MWK"/&gt;
     *               &lt;enumeration value="MXN"/&gt;
     *               &lt;enumeration value="MXV"/&gt;
     *               &lt;enumeration value="MYR"/&gt;
     *               &lt;enumeration value="MZN"/&gt;
     *               &lt;enumeration value="NAD"/&gt;
     *               &lt;enumeration value="NGN"/&gt;
     *               &lt;enumeration value="NIO"/&gt;
     *               &lt;enumeration value="NOK"/&gt;
     *               &lt;enumeration value="NPR"/&gt;
     *               &lt;enumeration value="NZD"/&gt;
     *               &lt;enumeration value="OMR"/&gt;
     *               &lt;enumeration value="PAB"/&gt;
     *               &lt;enumeration value="PEN"/&gt;
     *               &lt;enumeration value="PGK"/&gt;
     *               &lt;enumeration value="PHP"/&gt;
     *               &lt;enumeration value="PKR"/&gt;
     *               &lt;enumeration value="PLN"/&gt;
     *               &lt;enumeration value="PYG"/&gt;
     *               &lt;enumeration value="QAR"/&gt;
     *               &lt;enumeration value="RON"/&gt;
     *               &lt;enumeration value="RSD"/&gt;
     *               &lt;enumeration value="RUB"/&gt;
     *               &lt;enumeration value="RWF"/&gt;
     *               &lt;enumeration value="SAR"/&gt;
     *               &lt;enumeration value="SBD"/&gt;
     *               &lt;enumeration value="SCR"/&gt;
     *               &lt;enumeration value="SDG"/&gt;
     *               &lt;enumeration value="SEK"/&gt;
     *               &lt;enumeration value="SGD"/&gt;
     *               &lt;enumeration value="SHP"/&gt;
     *               &lt;enumeration value="SLL"/&gt;
     *               &lt;enumeration value="SOS"/&gt;
     *               &lt;enumeration value="SRD"/&gt;
     *               &lt;enumeration value="SSP"/&gt;
     *               &lt;enumeration value="STD"/&gt;
     *               &lt;enumeration value="SVC"/&gt;
     *               &lt;enumeration value="SYP"/&gt;
     *               &lt;enumeration value="SZL"/&gt;
     *               &lt;enumeration value="THB"/&gt;
     *               &lt;enumeration value="TJS"/&gt;
     *               &lt;enumeration value="TMT"/&gt;
     *               &lt;enumeration value="TND"/&gt;
     *               &lt;enumeration value="TOP"/&gt;
     *               &lt;enumeration value="TRY"/&gt;
     *               &lt;enumeration value="TTD"/&gt;
     *               &lt;enumeration value="TWD"/&gt;
     *               &lt;enumeration value="TZS"/&gt;
     *               &lt;enumeration value="UAH"/&gt;
     *               &lt;enumeration value="UGX"/&gt;
     *               &lt;enumeration value="USD"/&gt;
     *               &lt;enumeration value="USN"/&gt;
     *               &lt;enumeration value="UYI"/&gt;
     *               &lt;enumeration value="UYU"/&gt;
     *               &lt;enumeration value="UZS"/&gt;
     *               &lt;enumeration value="VEF"/&gt;
     *               &lt;enumeration value="VND"/&gt;
     *               &lt;enumeration value="VUV"/&gt;
     *               &lt;enumeration value="WST"/&gt;
     *               &lt;enumeration value="XAF"/&gt;
     *               &lt;enumeration value="XAG"/&gt;
     *               &lt;enumeration value="XAU"/&gt;
     *               &lt;enumeration value="XBA"/&gt;
     *               &lt;enumeration value="XBB"/&gt;
     *               &lt;enumeration value="XBC"/&gt;
     *               &lt;enumeration value="XBD"/&gt;
     *               &lt;enumeration value="XCD"/&gt;
     *               &lt;enumeration value="XDR"/&gt;
     *               &lt;enumeration value="XOF"/&gt;
     *               &lt;enumeration value="XPD"/&gt;
     *               &lt;enumeration value="XPF"/&gt;
     *               &lt;enumeration value="XPT"/&gt;
     *               &lt;enumeration value="XSU"/&gt;
     *               &lt;enumeration value="XTS"/&gt;
     *               &lt;enumeration value="XUA"/&gt;
     *               &lt;enumeration value="XXX"/&gt;
     *               &lt;enumeration value="YER"/&gt;
     *               &lt;enumeration value="ZAR"/&gt;
     *               &lt;enumeration value="ZMW"/&gt;
     *               &lt;enumeration value="ZWL"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TipoCambio" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalServGravados" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalServExentos" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalMercanciasGravadas" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalMercanciasExentas" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalGravado" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalExento" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalVenta" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
     *         &lt;element name="TotalDescuentos" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalVentaNeta" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
     *         &lt;element name="TotalImpuesto" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType" minOccurs="0"/&gt;
     *         &lt;element name="TotalComprobante" type="{https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico}DecimalDineroType"/&gt;
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
        "codigoMoneda",
        "tipoCambio",
        "totalServGravados",
        "totalServExentos",
        "totalMercanciasGravadas",
        "totalMercanciasExentas",
        "totalGravado",
        "totalExento",
        "totalVenta",
        "totalDescuentos",
        "totalVentaNeta",
        "totalImpuesto",
        "totalComprobante"
    })
    public static class ResumenFactura {

        @XmlElement(name = "CodigoMoneda", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected String codigoMoneda;
        @XmlElement(name = "TipoCambio", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal tipoCambio;
        @XmlElement(name = "TotalServGravados", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalServGravados;
        @XmlElement(name = "TotalServExentos", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalServExentos;
        @XmlElement(name = "TotalMercanciasGravadas", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalMercanciasGravadas;
        @XmlElement(name = "TotalMercanciasExentas", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalMercanciasExentas;
        @XmlElement(name = "TotalGravado", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalGravado;
        @XmlElement(name = "TotalExento", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalExento;
        @XmlElement(name = "TotalVenta", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected BigDecimal totalVenta;
        @XmlElement(name = "TotalDescuentos", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalDescuentos;
        @XmlElement(name = "TotalVentaNeta", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected BigDecimal totalVentaNeta;
        @XmlElement(name = "TotalImpuesto", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico")
        protected BigDecimal totalImpuesto;
        @XmlElement(name = "TotalComprobante", namespace = "https://tribunet.hacienda.go.cr/docs/esquemas/2017/v4.2/tiqueteElectronico", required = true)
        protected BigDecimal totalComprobante;

        /**
         * Obtiene el valor de la propiedad codigoMoneda.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoMoneda() {
            return codigoMoneda;
        }

        /**
         * Define el valor de la propiedad codigoMoneda.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoMoneda(String value) {
            this.codigoMoneda = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoCambio.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTipoCambio() {
            return tipoCambio;
        }

        /**
         * Define el valor de la propiedad tipoCambio.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTipoCambio(BigDecimal value) {
            this.tipoCambio = value;
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
