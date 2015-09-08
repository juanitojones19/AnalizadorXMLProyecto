package com.repaso.Analizador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LectorArchivo 
{
	private String texto;
	public LectorArchivo( String ruta ) throws FileNotFoundException, IOException
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
    }// fin del constructor
	
	public String obtenerTexto()
	{
		return texto;
	}


}
