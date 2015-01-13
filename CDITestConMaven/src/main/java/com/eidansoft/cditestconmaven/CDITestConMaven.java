/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eidansoft.cditestconmaven;

import javax.enterprise.context.RequestScoped;
import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.apache.deltaspike.cdise.api.ContextControl;
import org.apache.deltaspike.core.api.provider.BeanProvider;

/**
 *
 * @author alorente
 */
public class CDITestConMaven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //con las dos lineas siguientes se detona el contenedor de inyección de dependencias
        CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();
        cdiContainer.boot();
        //con las siguientes el alcance(scope) de la aplicación, se puede cambiar ;-)
        ContextControl contextControl = cdiContainer.getContextControl();
        contextControl.startContext(RequestScoped.class);
        //acá la clase con la que vamos a comenzar (que sería algo como un segundo main
        //Mediator mediator = (Mediator)BeanProvider.getContextualReference("mio", false);
        Mediator mediator = BeanProvider.getContextualReference(Mediator.class, false);
        //ejecutamos el metodo que nos da entrada a nuestro programa
        mediator.execInTransaction();
        //detenemos el contexto
        contextControl.stopContext(RequestScoped.class);
        //damos de baja el contenedor
        cdiContainer.shutdown();
    }
    
}
