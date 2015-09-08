package com.repaso.Analizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Sintelti on 07/09/2015.
 */
public class Documento implements Analizable
{
    private int contadorParrafo;
    private List<Parrafo> listaParrafo = new ArrayList<Parrafo>();


    public Documento(String texto)
    {
        String[] arregloParrafos = separar(texto);
        //se agregan los parrafos a la listaParrafo
        for ( int i = 0; i < arregloParrafos.length; i++  )
        {
            listaParrafo.add(new Parrafo(arregloParrafos[i]));
            contadorParrafo += listaParrafo.get(i).contarPalabras();
        }
    }

    public boolean esEOF(String palabra) {
        return false;
    }

    public int[] contarVocales() {
        return new int[0];
    }

    public int contarPalabras() {
        return contadorParrafo;
    }

    public Map<String, Integer> contarArticulos() {
        return null;
    }

    public String[] separar(String texto) {
        String[] arregloParrafo = texto.split("(\\n\\r)+\\n");
        return arregloParrafo;
    }
}
