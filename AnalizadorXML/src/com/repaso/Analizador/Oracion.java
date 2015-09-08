package com.repaso.Analizador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Oracion implements Analizable
{
	private String oracion;
	private int totalPalabras = 0;
	private List<Palabra> listaPalabras = new ArrayList<Palabra>();
	private int contadorVocales;
    private int contadorArticulos;
	private final String[] articulos = {"el", "la","los", "las", "un", "una", "unos", "unas"};

	
	public Oracion(String entrada)
	{
		this.oracion = entrada;

		String[] arregloPalabras = separar(oracion);
		for(int i = 0; i < arregloPalabras.length; i++)
		{
			//impresion de consola de prueba
			listaPalabras.add(new Palabra(arregloPalabras[i]));
			//totalPalabras++;

            contadorVocales += listaPalabras.get(i).contarVocales();

			establecerContadorArticulos(arregloPalabras[i]);
			if(!listaPalabras.get(i).esEOF(arregloPalabras[i]))
			{
				totalPalabras++;
			}
		}
	}// fin del constructor
	
	private void establecerContadorArticulos(String palabra)
	{
		for(int i = 0; i < articulos.length; i++ )
        {
            if(articulos[i].equals(palabra.toLowerCase()))
            {
                contadorArticulos += 1;
            }
        }

	}// fin del metodo establecerContadorArticulos


	//metodo que cuenta el numero total de palabras en una "Oracion"
	public int contarPalabras() {
		// TODO Auto-generated method stub
		return totalPalabras;
	}

	//metodo que separa las palabras de una "Oracion"
	public String[] separar(String texto) {
		// TODO Auto-generated method stub
		texto = texto.replaceAll("[\\.\\,]", "");
		String[] arregloPalabras = texto.split("(\\s)+");
		return arregloPalabras;
	}

	//obtiene el numero total de palabras
	public int obtenerTotalPalabras()
	{
		return totalPalabras;
	}

	public boolean esEOF(String palabra) {
		// TODO Auto-generated method stub
		return false;
	}

    //regrsa el valor de la variable contador Vocales
	public int contarVocales() {
		// TODO Auto-generated method stub
		return contadorVocales;
	}

    public int contarArticulos() {
        // TODO Auto-generated method stub
        return contadorArticulos;
    }

}// fin de la clase Oraciones
