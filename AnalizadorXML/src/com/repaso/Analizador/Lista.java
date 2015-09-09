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
    private ArrayList<String> lista = new ArrayList<String>();
    private String texto;

    public Lista(String texto)
    {
        llenarLista(texto);
    }// fin del constructor

    //metodo que llenar una List a partir de un String obtenido de un archivo txt o un String
    public void  llenarLista(String texto)
    {
        //Si texto es diferente de null llenar lista
        if(texto != null)
        {
            String[] arregloLista = texto.split("(\\n)+");
            for(int i = 0; i < arregloLista.length; i++)
            {
                lista.add(arregloLista[i].replace("\r", ""));
            }

        }else{// de lo contrario
            System.out.println("Lista es null");
        }// fin de else - if

    }// fin del metodo llenarLista

    //se obitne una List
    public List<String> obtenerLista(){
        return lista;
    }//fin del metodo obtenerLista


    //metodo que busca un elemento en una Lista
    public boolean estaElemento(String elemento)
    {
        return obtenerLista().contains(elemento);
    }






}
