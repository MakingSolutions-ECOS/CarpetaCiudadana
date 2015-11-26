
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para municipioDto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="municipioDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudadanoList" type="{http://services.ecos.edu.uniandes.co/}ciudadanoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoDepartamento" type="{http://services.ecos.edu.uniandes.co/}departamentoDto" minOccurs="0"/>
 *         &lt;element name="codigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "municipioDto", propOrder = {
    "ciudadanoList",
    "codigoDepartamento",
    "codigoMunicipio",
    "nombreMunicipio"
})
public class MunicipioDto {

    @XmlElement(nillable = true)
    protected List<CiudadanoDto> ciudadanoList;
    protected DepartamentoDto codigoDepartamento;
    protected Integer codigoMunicipio;
    protected String nombreMunicipio;

    /**
     * Gets the value of the ciudadanoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciudadanoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiudadanoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiudadanoDto }
     * 
     * 
     */
    public List<CiudadanoDto> getCiudadanoList() {
        if (ciudadanoList == null) {
            ciudadanoList = new ArrayList<CiudadanoDto>();
        }
        return this.ciudadanoList;
    }

    /**
     * Obtiene el valor de la propiedad codigoDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link DepartamentoDto }
     *     
     */
    public DepartamentoDto getCodigoDepartamento() {
        return codigoDepartamento;
    }

    /**
     * Define el valor de la propiedad codigoDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartamentoDto }
     *     
     */
    public void setCodigoDepartamento(DepartamentoDto value) {
        this.codigoDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define el valor de la propiedad codigoMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoMunicipio(Integer value) {
        this.codigoMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    /**
     * Define el valor de la propiedad nombreMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMunicipio(String value) {
        this.nombreMunicipio = value;
    }

}
