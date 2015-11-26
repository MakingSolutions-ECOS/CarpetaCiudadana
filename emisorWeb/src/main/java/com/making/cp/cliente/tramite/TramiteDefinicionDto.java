
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tramiteDefinicionDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tramiteDefinicionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCategoria" type="{http://services.ecos.edu.uniandes.co/}categoriasTramiteDto" minOccurs="0"/>
 *         &lt;element name="codigoEntidadEmisora" type="{http://services.ecos.edu.uniandes.co/}emisorDto" minOccurs="0"/>
 *         &lt;element name="codigoTramiteDefinicion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="definicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoRequeridoTramiteList" type="{http://services.ecos.edu.uniandes.co/}documentoRequeridoTramiteDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="habilitado" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tramiteDefinicionDto", propOrder = {
    "codigoCategoria",
    "codigoEntidadEmisora",
    "codigoTramiteDefinicion",
    "definicion",
    "descripcion",
    "documentoRequeridoTramiteList",
    "habilitado"
})
public class TramiteDefinicionDto {

    protected CategoriasTramiteDto codigoCategoria;
    protected EmisorDto codigoEntidadEmisora;
    protected Integer codigoTramiteDefinicion;
    protected String definicion;
    protected String descripcion;
    @XmlElement(nillable = true)
    protected List<DocumentoRequeridoTramiteDto> documentoRequeridoTramiteList;
    protected short habilitado;

    /**
     * Obtiene el valor de la propiedad codigoCategoria.
     * 
     * @return
     *     possible object is
     *     {@link CategoriasTramiteDto }
     *     
     */
    public CategoriasTramiteDto getCodigoCategoria() {
        return codigoCategoria;
    }

    /**
     * Define el valor de la propiedad codigoCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriasTramiteDto }
     *     
     */
    public void setCodigoCategoria(CategoriasTramiteDto value) {
        this.codigoCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEntidadEmisora.
     * 
     * @return
     *     possible object is
     *     {@link EmisorDto }
     *     
     */
    public EmisorDto getCodigoEntidadEmisora() {
        return codigoEntidadEmisora;
    }

    /**
     * Define el valor de la propiedad codigoEntidadEmisora.
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorDto }
     *     
     */
    public void setCodigoEntidadEmisora(EmisorDto value) {
        this.codigoEntidadEmisora = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTramiteDefinicion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTramiteDefinicion() {
        return codigoTramiteDefinicion;
    }

    /**
     * Define el valor de la propiedad codigoTramiteDefinicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTramiteDefinicion(Integer value) {
        this.codigoTramiteDefinicion = value;
    }

    /**
     * Obtiene el valor de la propiedad definicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinicion() {
        return definicion;
    }

    /**
     * Define el valor de la propiedad definicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinicion(String value) {
        this.definicion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the documentoRequeridoTramiteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoRequeridoTramiteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoRequeridoTramiteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoRequeridoTramiteDto }
     * 
     * 
     */
    public List<DocumentoRequeridoTramiteDto> getDocumentoRequeridoTramiteList() {
        if (documentoRequeridoTramiteList == null) {
            documentoRequeridoTramiteList = new ArrayList<DocumentoRequeridoTramiteDto>();
        }
        return this.documentoRequeridoTramiteList;
    }

    /**
     * Obtiene el valor de la propiedad habilitado.
     * 
     */
    public short getHabilitado() {
        return habilitado;
    }

    /**
     * Define el valor de la propiedad habilitado.
     * 
     */
    public void setHabilitado(short value) {
        this.habilitado = value;
    }

}
