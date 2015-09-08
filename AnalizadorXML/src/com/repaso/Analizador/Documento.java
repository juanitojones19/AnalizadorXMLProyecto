package com.repaso.Analizador;

import java.util.Map;

/**
 * Created by Sintelti on 07/09/2015.
 */
public class Documento implements Analizable {


    public Documento(String texto)
    {

    }

    public boolean esEOF(String palabra) {
        return false;
    }

    public int[] contarVocales() {
        return new int[0];
    }

    public int contarPalabras() {
        return 0;
    }

    public Map<String, Integer> contarArticulos() {
        return null;
    }

    public String[] separar(String texto) {
        String[] arregloParrafo = texto.split("(\\n\\r)+\\n");

        for(int i = 0; i < arregloParrafo.length; i++ )
        {
            System.out.println("Parrafo: " + i + arregloParrafo[i]);
        }

        return arregloParrafo;
    }
}
