
package com.making.cp.cliente.tramite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentoRequeridoTramiteDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentoRequeridoTramiteDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDocumentoRequerido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoMetadataTipoDocumento" type="{http://services.ecos.edu.uniandes.co/}metadataTipoDocumentoDto" minOccurs="0"/>
 *         &lt;element name="codigoTramiteDefinicion" type="{http://services.ecos.edu.uniandes.co/}tramiteDefinicionDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoRequeridoTramiteDto", propOrder = {
    "codigoDocumentoRequerido",
    "codigoMetadataTipoDocumento",
    "codigoTramiteDefinicion"
})
public class DocumentoRequeridoTramiteDto {

    protected Integer codigoDocumentoRequerido;
    protected MetadataTipoDocumentoDto codigoMetadataTipoDocumento;
    protected TramiteDefinicionDto codigoTramiteDefinicion;

    /**
     * Obtiene el valor de la propiedad codigoDocumentoRequerido.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoDocumentoRequerido() {
        return codigoDocumentoRequerido;
    }

    /**
     * Define el valor de la propiedad codigoDocumentoRequerido.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoDocumentoRequerido(Integer value) {
        this.codigoDocumentoRequerido = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMetadataTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link MetadataTipoDocumentoDto }
     *     
     */
    public MetadataTipoDocumentoDto getCodigoMetadataTipoDocumento() {
        return codigoMetadataTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoMetadataTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataTipoDocumentoDto }
     *     
     */
    public void setCodigoMetadataTipoDocumento(MetadataTipoDocumentoDto value) {
        this.codigoMetadataTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTramiteDefinicion.
     * 
     * @return
     *     possible object is
     *     {@link TramiteDefinicionDto }
     *     
     */
    public TramiteDefinicionDto getCodigoTramiteDefinicion() {
        return codigoTramiteDefinicion;
    }

    /**
     * Define el valor de la propiedad codigoTramiteDefinicion.
     * 
     * @param value
     *     allowed object is
     *     {@link TramiteDefinicionDto }
     *     
     */
    public void setCodigoTramiteDefinicion(TramiteDefinicionDto value) {
        this.codigoTramiteDefinicion = value;
    }

}
