package com.repaso.Analizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Sintelti on 07/09/2015.
 */
public class Documento implements Analizable
{
    private int contadorPalabra;// variable que almacena elnumero total de parrafos
    private List<Parrafo> listaParrafo = new ArrayList<Parrafo>();
    private int contadorVocales;// variable que almacena el numero total de vocales
    private int contadorArticulos; //variable que almacena el numeor total de articulos
    private int contadorOraciones;
    private int contadorParrafos;
    private int contadorConocidas;
    private int contadorDesconocidas;
    private int contadorPalabrasCensuradas;


    public Documento(String texto)
    {
        String[] arregloParrafos = separar(texto);
        contadorParrafos = arregloParrafos.length;
        //se agregan los parrafos a la listaParrafo
        for ( int i = 0; i < arregloParrafos.length; i++  )
        {
            listaParrafo.add(new Parrafo(arregloParrafos[i]));
            contadorPalabra += listaParrafo.get(i).contarPalabras();
            contadorVocales += listaParrafo.get(i).contarVocales();
            contadorArticulos += listaParrafo.get(i).contarArticulos();
            contadorOraciones += listaParrafo.get(i).obtenerNumeroOraciones();
            contadorConocidas += listaParrafo.get(i).obtenerConocidas();
            contadorPalabrasCensuradas += listaParrafo.get(i).obtenerNumeroPalabrasCensuradas();
        }
        contadorDesconocidas = contadorPalabra - contadorConocidas;
    }

    public boolean esEOF(String palabra) {
        return false;
    }

    public int contarVocales() {
        return contadorVocales;
    }

    public int contarPalabras() {
        return contadorPalabra;
    }

    public int contarArticulos() {
        // TODO Auto-generated method stub
        return contadorArticulos;
    }

    public int contarOraciones(){
        return contadorOraciones;
    }

    public int contarParrafos(){
        return contadorParrafos;
    }

    public int contarConocidas(){
        return contadorConocidas;
    }

    public int contarDesconocidas(){
        return contadorDesconocidas;
    }

    public int contarPalabrasCensuradas(){
        return contadorPalabrasCensuradas;
    }

    public String[] separar(String texto) {
        String[] arregloParrafo = texto.split("(\\n\\r)+\\n");
        return arregloParrafo;
    }

    public List<Parrafo> obtenerListaParrafos()
    {
        return listaParrafo;
    }

}// fin de la clase
