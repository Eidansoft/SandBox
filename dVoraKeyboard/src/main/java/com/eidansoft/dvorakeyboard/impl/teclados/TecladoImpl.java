/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eidansoft.dvorakeyboard.impl.teclados;

import com.eidansoft.dvorakeyboard.core.ITeclado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alorente
 */
public class TecladoImpl implements ITeclado{

    private List<String> lineaNumeros;
    private List<String> linea1;
    private List<String> linea2;
    private List<String> linea3;
    
    private final List<String> letrasYnum;
    
    public TecladoImpl() {
        letrasYnum = new ArrayList<>();
        letrasYnum.add("1");
        letrasYnum.add("2");
        letrasYnum.add("3");
        letrasYnum.add("4");
        letrasYnum.add("5");
        letrasYnum.add("6");
        letrasYnum.add("7");
        letrasYnum.add("8");
        letrasYnum.add("9");
        letrasYnum.add("0");
        letrasYnum.add("q");
        letrasYnum.add("w");
        letrasYnum.add("e");
        letrasYnum.add("r");
        letrasYnum.add("t");
        letrasYnum.add("y");
        letrasYnum.add("u");
        letrasYnum.add("i");
        letrasYnum.add("o");
        letrasYnum.add("p");
        letrasYnum.add("a");
        letrasYnum.add("s");
        letrasYnum.add("d");
        letrasYnum.add("f");
        letrasYnum.add("g");
        letrasYnum.add("h");
        letrasYnum.add("j");
        letrasYnum.add("k");
        letrasYnum.add("l");
        letrasYnum.add("ñ");
        letrasYnum.add("z");
        letrasYnum.add("x");
        letrasYnum.add("c");
        letrasYnum.add("v");
        letrasYnum.add("b");
        letrasYnum.add("n");
        letrasYnum.add("m");
    }

    @Override
    public List<String> getLetrasLinea1() {
        return eliminaSimbolos(linea1);
    }

    @Override
    public List<String> getLetrasLinea2() {
        return eliminaSimbolos(linea2);
    }

    @Override
    public List<String> getLetrasLinea3() {
        return eliminaSimbolos(linea3);
    }

    @Override
    public List<String> getCaracteresLineaNumeros() {
        return lineaNumeros;
    }

    @Override
    public List<String> getNumerosLineaNumeros() {
        return eliminaSimbolos(lineaNumeros);
    }

    @Override
    public List<String> getCaracteresLinea1() {
        return linea1;
    }

    @Override
    public List<String> getCaracteresLinea2() {
        return linea2;
    }

    @Override
    public List<String> getCaracteresLinea3() {
        return linea3;
    }
    
    private List<String> eliminaSimbolos(List<String> caracteres){
        List<String> res = new ArrayList<>();
        Iterator<String> it = caracteres.iterator();
        while (it.hasNext()) {
            String caracter = it.next();
            if (letrasYnum.contains(caracter)){
                res.add(caracter);
            }
        }
        return res;
    }

    @Override
    public void setCaracteresLineaNumeros(List<String> caracteres) {
        lineaNumeros = caracteres;
    }

    @Override
    public void setCaracteresLinea1(List<String> caracteres) {
        linea1 = caracteres;
    }

    @Override
    public void setCaracteresLinea2(List<String> caracteres) {
        linea2 = caracteres;
    }

    @Override
    public void setCaracteresLinea3(List<String> caracteres) {
        linea3 = caracteres;
    }
}
