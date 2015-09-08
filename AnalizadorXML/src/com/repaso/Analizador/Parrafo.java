package com.repaso.Analizador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parrafo implements Analizable{
	
	private String texto;
	private List<Oracion> listaOraciones = new ArrayList<Oracion>();
	private int totalPalabras;
	private int contadorVocales;//almacena elnumero total de vocales en el parrafo
    private int contadorArticulos;
    private int numeroOraciones; // almacena el numero de oraciones en el parrafo

	
	public Parrafo(String entrada)
	{
		this.texto = entrada;
		String[] arregloOraciones = separarOraciones(entrada);
        numeroOraciones = arregloOraciones.length;
		//Map<String,Integer> articulos = new HashMap<String,Integer>();
		for(int i = 0; i < arregloOraciones.length; i++ )
		{
			listaOraciones.add(new Oracion(arregloOraciones[i]));
			totalPalabras += listaOraciones.get(i).contarPalabras();

			//establecerContadorArticulos(listaOraciones.get(i).contarArticulos());


            //almancena el numero total de  vocales ene l parrafo
            contadorVocales += listaOraciones.get(i).contarVocales();

            //almacena el numero total de articulos en el parrafo;
            contadorArticulos += listaOraciones.get(i).contarArticulos();
		}
	}

    /*
	private void establecerContadorArticulos(Map<String, Integer> articulos)
	{
		int total = articulos.get("las") + contadorArticulos.get("las");
		contadorArticulos.put("las", total );
		
		total = articulos.get("el") + contadorArticulos.get("el");
		contadorArticulos.put("el", total );
		
		total = articulos.get("la") + contadorArticulos.get("la");
		contadorArticulos.put("la", total );
		
		total = articulos.get("los") + contadorArticulos.get("los");
		contadorArticulos.put("los", total );
		
	}
	*/


	public int contarPalabras() {
		// TODO Auto-generated method stub
		return totalPalabras;
	}

	public String[] separar(String texto)
	{
		// TODO Auto-generated method stub
		return null;
	}

	//metodo que separa las oraciones de un "parrafo"
	public String[] separarOraciones(String texto) 
	{
		// TODO Auto-generated method stub
		String[] arregloOracion = texto.split("[\n]");
		return arregloOracion;
	}


	public boolean esEOF(String palabra) 
	{
		return false;
	}

	
	public int contarVocales() {
		// TODO Auto-generated method stub
		return contadorVocales;
	}


    public int contarArticulos() {
        // TODO Auto-generated method stub
        return contadorArticulos;
    }

    public int obtenerNumeroOraciones()
    {
        return  numeroOraciones;
    }

}// fin de la clase
