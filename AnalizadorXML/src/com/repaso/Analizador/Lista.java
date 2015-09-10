package com.repaso.Analizador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sintelti on 08/09/2015.
 */
public class Lista
{
    private static ArrayList<Palabra> lista = new ArrayList<Palabra>();
    private static ArrayList<Palabra> listaProhibidas = new ArrayList<Palabra>();
    private String texto;

    public Lista(String textoConocidas, String textoProhibidas)
    {
        llenarListaConocidas(textoConocidas);
        llenarListaProhibidas(textoProhibidas);
    }// fin del constructor

    //metodo que llenar una List a partir de un String obtenido de un archivo txt o un String
    public void  llenarListaConocidas(String texto)
    {
        //Si texto es diferente de null llenar lista
        if(texto != null)
        {
            String[] arregloLista = texto.split("(\\n)+");
            for(int i = 0; i < arregloLista.length; i++)
            {
                lista.add(new Palabra(arregloLista[i].replace("\r", "")));
            }

        }else{// de lo contrario
            System.out.println("Lista es null");
        }// fin de else - if

    }// fin del metodo llenarLista



    //metodo que llenar una List a partir de un String obtenido de un archivo txt o un String
    public void  llenarListaProhibidas(String texto)
    {
        //Si texto es diferente de null llenar lista
        if(texto != null)
        {
            String[] arregloLista = texto.split("(\\n)+");
            for(int i = 0; i < arregloLista.length; i++)
            {
                listaProhibidas.add(new Palabra(arregloLista[i].replace("\r", "")));
            }

        }else{// de lo contrario
            System.out.println("Lista es null");
        }// fin de else - if

    }// fin del metodo llenarLista


    //se obitne una List
    public List<Palabra> obtenerListaConocidas(){
        return lista;
    }//fin del metodo obtenerLista

    //se obtiene una List de palabrasProhibidas
    public List<Palabra> obtenerListaProhibidas(){
        return listaProhibidas;
    }// fin del metodo obtenerLista


    //metodo que busca un elemento en una Lista
    public static boolean estaElemento(Oracion obj)
    {
        boolean esConocida = false;
        for (Palabra palabra : obj.obtenerPalabra())
        {
            //System.out.println(obtenerLista().equals(palabra.obtenerPalabra()));
            for(int i = 0; i < lista.size(); i++)
            {
                //System.out.println(obtenerListaConocidas().get(i).obtenerPalabra().equals(palabra.obtenerPalabra()));
                if (lista.get(i).obtenerPalabra().equals(palabra.obtenerPalabra()))
                {
                    //System.out.println(palabra.obtenerPalabra());
                    esConocida = true;
                }
            }// fin del for interno
        }// fin del for externo
        return esConocida;
    }// fin de estaElemento

    public static boolean esProhibida(Oracion obj)
    {
        boolean esPrhoibida = false;

        for( Palabra palabra : obj.obtenerPalabra() )
        {
            //System.out.println(obtenerLista().equals(palabra.obtenerPalabra()));
            for(int i = 0; i < listaProhibidas.size(); i++)
            {
                //System.out.println(obtenerLista().get(i).obtenerPalabra().equals(palabra.obtenerPalabra()));
                if(listaProhibidas.get(i).obtenerPalabra().equals(palabra.obtenerPalabra()))
                {
                    //System.out.println("Palabras censuradas: " + palabra.obtenerPalabra());
                    esPrhoibida = true;
                }
            }// fin del for interno
        }

        return esPrhoibida;
    }// fin del metodo censurarPalabra


    public static Oracion censurarPalabra(Oracion oracion)
    {
        Oracion nuevaOracion = null;
        String acumuladorPalabras = "";

        for (int i = 0; i < oracion.obtenerPalabra().size(); i++)
        {

            if(esCensurada(oracion.obtenerPalabra().get(i)))
            {
                //System.out.print(oracion.obtenerPalabra().get(i).obtenerPalabra() + "*****");
                acumuladorPalabras += "*****" + " ";
            }else{
                acumuladorPalabras += oracion.obtenerPalabra().get(i).obtenerPalabra() + " ";
            }
        }
        //System.out.println(acumuladorPalabras);

        return new Oracion(acumuladorPalabras);
    }// fin del metodo censurarPalabra

    private static boolean esCensurada(Palabra palabra)
    {
        boolean esPrhoibida = false;
        //System.out.println(obtenerLista().equals(palabra.obtenerPalabra()));
        for(int i = 0; i < listaProhibidas.size(); i++)
        {
            //System.out.println(obtenerLista().get(i).obtenerPalabra().equals(palabra.obtenerPalabra()));
            if(listaProhibidas.get(i).obtenerPalabra().equals(palabra.obtenerPalabra()))
            {
                //System.out.println("Palabras censuradas: " + palabra.obtenerPalabra());
                esPrhoibida = true;
            }
        }// fin del for interno

        return esPrhoibida;
    }


}
