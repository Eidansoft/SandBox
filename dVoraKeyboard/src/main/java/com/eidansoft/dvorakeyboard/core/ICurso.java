/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eidansoft.dvorakeyboard.core;

/**
 *
 * @author alorente
 */
public interface ICurso {
    ILeccion getLeccion(int nivel, ITeclado teclado, IDiccionarioPalabras diccionario);
}
