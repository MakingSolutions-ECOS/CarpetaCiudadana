
package com.making.cp.cliente.tramite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaTramiteDefinicion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaTramiteDefinicion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.ecos.edu.uniandes.co/}respuestaService">
 *       &lt;sequence>
 *         &lt;element name="tramiteDefinicionDtos" type="{http://services.ecos.edu.uniandes.co/}tramiteDefinicionDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaTramiteDefinicion", propOrder = {
    "tramiteDefinicionDtos"
})
public class RespuestaTramiteDefinicion
    extends RespuestaService
{

    @XmlElement(nillable = true)
    protected List<TramiteDefinicionDto> tramiteDefinicionDtos;

    /**
     * Gets the value of the tramiteDefinicionDtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tramiteDefinicionDtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTramiteDefinicionDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TramiteDefinicionDto }
     * 
     * 
     */
    public List<TramiteDefinicionDto> getTramiteDefinicionDtos() {
        if (tramiteDefinicionDtos == null) {
            tramiteDefinicionDtos = new ArrayList<TramiteDefinicionDto>();
        }
        return this.tramiteDefinicionDtos;
    }

}
