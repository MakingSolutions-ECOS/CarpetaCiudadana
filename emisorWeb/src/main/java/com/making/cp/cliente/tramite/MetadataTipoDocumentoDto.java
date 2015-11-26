
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para metadataTipoDocumentoDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="metadataTipoDocumentoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoMetadataTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripcionMetadataTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreMetadataTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validezDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataTipoDocumentoDto", propOrder = {
    "codigoMetadataTipoDocumento",
    "descripcionMetadataTipoDocumento",
    "nombreMetadataTipoDocumento",
    "validezDocumento"
})
public class MetadataTipoDocumentoDto {

    protected Integer codigoMetadataTipoDocumento;
    protected String descripcionMetadataTipoDocumento;
    protected String nombreMetadataTipoDocumento;
    protected int validezDocumento;

    /**
     * Obtiene el valor de la propiedad codigoMetadataTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoMetadataTipoDocumento() {
        return codigoMetadataTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoMetadataTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoMetadataTipoDocumento(Integer value) {
        this.codigoMetadataTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMetadataTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMetadataTipoDocumento() {
        return descripcionMetadataTipoDocumento;
    }

    /**
     * Define el valor de la propiedad descripcionMetadataTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMetadataTipoDocumento(String value) {
        this.descripcionMetadataTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMetadataTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMetadataTipoDocumento() {
        return nombreMetadataTipoDocumento;
    }

    /**
     * Define el valor de la propiedad nombreMetadataTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMetadataTipoDocumento(String value) {
        this.nombreMetadataTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad validezDocumento.
     * 
     */
    public int getValidezDocumento() {
        return validezDocumento;
    }

    /**
     * Define el valor de la propiedad validezDocumento.
     * 
     */
    public void setValidezDocumento(int value) {
        this.validezDocumento = value;
    }

}
