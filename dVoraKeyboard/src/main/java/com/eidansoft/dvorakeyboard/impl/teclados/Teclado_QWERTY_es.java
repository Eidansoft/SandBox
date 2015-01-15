/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eidansoft.dvorakeyboard.impl.teclados;

import com.eidansoft.dvorakeyboard.core.ITeclado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alorente
 */
public class Teclado_QWERTY_es implements ITeclado{

    TecladoImpl teclado;
    
    public Teclado_QWERTY_es() {
        List<String> lineaNumeros = new ArrayList<>();
        lineaNumeros.add("º");
        lineaNumeros.add("1");
        lineaNumeros.add("2");
        lineaNumeros.add("3");
        lineaNumeros.add("4");
        lineaNumeros.add("5");
        lineaNumeros.add("6");
        lineaNumeros.add("7");
        lineaNumeros.add("8");
        lineaNumeros.add("9");
        lineaNumeros.add("0");
        lineaNumeros.add("'");
        lineaNumeros.add("¡");
        
        List<String> linea1 = new ArrayList<>();
        linea1.add("q");
        linea1.add("w");
        linea1.add("e");
        linea1.add("r");
        linea1.add("t");
        linea1.add("y");
        linea1.add("u");
        linea1.add("i");
        linea1.add("o");
        linea1.add("p");
        linea1.add("`");
        linea1.add("+");
        linea1.add("");
        
        List<String> linea2 = new ArrayList<>();
        linea2.add("a");
        linea2.add("s");
        linea2.add("d");
        linea2.add("f");
        linea2.add("g");
        linea2.add("h");
        linea2.add("j");
        linea2.add("k");
        linea2.add("l");
        linea2.add("ñ");
        linea2.add("´");
        linea2.add("ç");
        
        List<String> linea3 = new ArrayList<>();
        linea3.add("<");
        linea3.add("z");
        linea3.add("x");
        linea3.add("c");
        linea3.add("v");
        linea3.add("b");
        linea3.add("n");
        linea3.add("m");
        linea3.add(",");
        linea3.add(".");
        linea3.add("-");
        
        teclado.setCaracteresLineaNumeros(lineaNumeros);
        teclado.setCaracteresLinea1(linea1);
        teclado.setCaracteresLinea2(linea2);
        teclado.setCaracteresLinea3(linea3);
    }

    @Override
    public List<String> getCaracteresLineaNumeros() {
        return teclado.getCaracteresLineaNumeros();
    }

    @Override
    public List<String> getNumerosLineaNumeros() {
        return teclado.getNumerosLineaNumeros();
    }

    @Override
    public List<String> getCaracteresLinea1() {
        return teclado.getCaracteresLinea1();
    }

    @Override
    public List<String> getCaracteresLinea2() {
        return teclado.getCaracteresLinea2();
    }

    @Override
    public List<String> getCaracteresLinea3() {
        return teclado.getCaracteresLinea3();
    }

    @Override
    public List<String> getLetrasLinea1() {
        return teclado.getLetrasLinea1();
    }

    @Override
    public List<String> getLetrasLinea2() {
        return teclado.getLetrasLinea2();
    }

    @Override
    public List<String> getLetrasLinea3() {
        return teclado.getLetrasLinea3();
    }

    @Override
    public void setCaracteresLineaNumeros(List<String> caracteres) {
        teclado.setCaracteresLineaNumeros(caracteres);
    }

    @Override
    public void setCaracteresLinea1(List<String> caracteres) {
        teclado.setCaracteresLinea1(caracteres);
    }

    @Override
    public void setCaracteresLinea2(List<String> caracteres) {
        teclado.setCaracteresLinea2(caracteres);
    }

    @Override
    public void setCaracteresLinea3(List<String> caracteres) {
        teclado.setCaracteresLinea3(caracteres);
    }
}
