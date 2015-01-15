/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eidansoft.dvorakeyboard.core;

import java.util.List;

/**
 *
 * @author alorente
 */
public class LeccionImpl implements ILeccion{

    private List<String> palabras;
    private long tiempoMax;
    
    public LeccionImpl(List<String> palabras, long tiempoMax) {
        this.palabras = palabras;
        this.tiempoMax = tiempoMax;
    }
    
    @Override
    public List<String> getPalabras() {
        return palabras;
    }

    @Override
    public long getTiempoMax() {
        return tiempoMax;
    }
    
}
