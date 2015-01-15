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
public interface ITeclado {
    List<String> getCaracteresLineaNumeros();
    List<String> getNumerosLineaNumeros();
    List<String> getCaracteresLinea1();
    List<String> getCaracteresLinea2();
    List<String> getCaracteresLinea3();
    List<String> getLetrasLinea1();
    List<String> getLetrasLinea2();
    List<String> getLetrasLinea3();
    
    void setCaracteresLineaNumeros(List<String> caracteres);
    void setCaracteresLinea1(List<String> caracteres);
    void setCaracteresLinea2(List<String> caracteres);
    void setCaracteresLinea3(List<String> caracteres);
}
