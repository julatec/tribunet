//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.26 a las 09:04:48 PM CST 
//


package cr.go.hacienda.tribunet.v43.nota.credito;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CodigoMonedaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CodigoMonedaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoMoneda"&gt;
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
 *         &lt;element name="TipoCambio" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigoMonedaType", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", propOrder = {
    "codigoMoneda",
    "tipoCambio"
})
public class CodigoMonedaType {

    @XmlElement(name = "CodigoMoneda", required = true)
    protected String codigoMoneda;
    @XmlElement(name = "TipoCambio", required = true)
    protected BigDecimal tipoCambio;

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

}
