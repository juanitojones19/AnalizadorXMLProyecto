package com.repaso.Analizador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sintelti on 08/09/2015.
 */
public class Lista
{
    String texto;

    public Lista(String ruta)
    {

        try
        {
            int caracter;
            String letras;
            texto = "";
            FileReader f = new FileReader(ruta);
            BufferedReader b = new BufferedReader(f);
            while((caracter = b.read())!= -1) {
                //System.out.println(caracter);
                letras = "" + (char)caracter;
                texto += letras;
                //System.out.print(texto);
            }
            b.close();
        }catch(FileNotFoundException error){
            error.printStackTrace();

        }catch (IOException error){
            error.printStackTrace();
        }


    }// fin del constructor
    public String obtenerTexto(){
        return texto;
    }

}
