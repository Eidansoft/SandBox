/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eidansoft.cditestconmaven;

import javax.inject.Inject;
import javax.inject.Named;

public class Mediator {
    @Inject InjectedByDIImpl injectedByDI;

    //este es el metodo que se ejecuta en la clase anterior
    public void execInTransaction() {
        System.out.println("Holaaaa");
        injectedByDI.tryToExec();
    }
}
