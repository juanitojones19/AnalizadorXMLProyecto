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
    private List<String> lista = new ArrayList<String>();
    private String texto;

    public Lista(String texto)
    {
        String[] lista = llenarLista(texto);
        for (int i = 0; i < lista.length; i++)
        {
            System.out.println(lista[i]);
        }
    }// fin del constructor

    public String[] llenarLista(String texto)
    {
        String[] arregloLista = texto.split("(\\n)+");

        return arregloLista;
    }




}
