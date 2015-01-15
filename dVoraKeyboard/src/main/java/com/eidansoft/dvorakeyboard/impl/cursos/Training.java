/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eidansoft.dvorakeyboard.impl.cursos;

import com.eidansoft.dvorakeyboard.core.ICurso;
import com.eidansoft.dvorakeyboard.core.IDiccionarioPalabras;
import com.eidansoft.dvorakeyboard.core.ILeccion;
import com.eidansoft.dvorakeyboard.core.ITeclado;
import com.eidansoft.dvorakeyboard.core.LeccionImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alorente
 */
public class Training implements ICurso{

    @Override
    public ILeccion getLeccion(int nivel, ITeclado teclado, IDiccionarioPalabras diccionario) {
        List<String> palabras = obtenerPalabras(teclado, diccionario);
        
        //Si hay menos de 10 palabras en el diccionario no puedo seguir
        if (palabras.size() < 11){
            throw new IllegalArgumentException("El diccionario necesita un minimo de 20 palabras para funcionar");
        }
        if (palabras.size() < 9+(10*nivel)
        //TODO workin here
        palabras = filtraPalabrasNivel(nivel, palabras);
        int numeroLetras = contarLetras(palabras);
        return new LeccionImpl(palabras, numeroLetras * 1000); //tiempo asignado 1 pulsacion/segundo
    }

    private int contarLetras(List<String> palabras) {
        int res = 0;
        Iterator<String> it = palabras.iterator();
        while (it.hasNext()) {
            String palabra = it.next();
            res += palabra.length();
        }
        return  res;
    }

    private List<String> obtenerPalabras(ITeclado teclado, IDiccionarioPalabras diccionario) {
        List<String> letras = teclado.getLetrasLinea1();
        letras.addAll(teclado.getLetrasLinea2());
        letras.addAll(teclado.getLetrasLinea3());
        
        return diccionario.getPalabrasConLetras(letras);
    }

    private List<String> filtraPalabrasNivel(int nivel, List<String> palabras) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            res.add(palabras.get(i + (10*nivel)));
        }
        return res;
    }
    
}
