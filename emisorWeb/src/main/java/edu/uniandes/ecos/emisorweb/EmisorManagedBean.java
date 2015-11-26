/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.emisorweb;

import com.making.cp.cliente.tramite.TramiteService;
import com.making.cp.cliente.tramite.TramiteService_Service;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sergio Forero
 */
@Named(value = "emisorManagedBean")
@SessionScoped
public class EmisorManagedBean implements Serializable {

    private TramiteService_Service service;
    private TramiteService metaDataService;

    /**
     * Creates a new instance of EmisorManagedBean
     */
    public EmisorManagedBean() {
    }

    @PostConstruct
    public void init() {
        service = new TramiteService_Service();
        metaDataService = service.getTramiteServicePort();
    }

    
    public void responderTramite(){
        metaDataService.cambiarEstadoTramiteProceso(6, 1, 3);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO:", "Se ha cambiado el estado del tramite."));
    }
}
