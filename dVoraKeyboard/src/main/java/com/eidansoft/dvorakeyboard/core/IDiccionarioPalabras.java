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
public interface IDiccionarioPalabras {
    List<String> getPalabrasConLetras(List<String> letras);
    List<String> getPalabrasRegEx(String regEx);
}
