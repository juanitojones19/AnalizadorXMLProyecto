package com.repaso.Analizador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parrafo implements Analizable{
	
	private String texto;
	private List<Oracion> listaOraciones = new ArrayList<Oracion>();
	private int totalPalabras;
	private int[] contadorVocales = new int[5];
	private Map<String,Integer> contadorArticulos = new HashMap<String,Integer>();
	
	public Parrafo(String entrada)
	{
		this.texto = entrada;
		String[] arregloOraciones = separarOraciones(entrada);
		int[] vocales = new int[5];
		//Map<String,Integer> articulos = new HashMap<String,Integer>();
		contadorArticulos.put("las", 0);
		contadorArticulos.put("el", 0);
		contadorArticulos.put("los", 0);
		contadorArticulos.put("la", 0);
		for(int i = 0; i < arregloOraciones.length; i++ )
		{
			listaOraciones.add(new Oracion(arregloOraciones[i]));
			totalPalabras += listaOraciones.get(i).contarPalabras();
			vocales = listaOraciones.get(i).contarVocales();
			establecerContadorVocales(vocales);
			//articulos = listaOraciones.get(i).contarArticulos();
			establecerContadorArticulos(listaOraciones.get(i).contarArticulos());
		}
	}
	
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
	
	private void establecerContadorVocales(int[] vocales)
	{
		contadorVocales[0] += vocales[0];
		contadorVocales[1] += vocales[1];
		contadorVocales[2] += vocales[2];
		contadorVocales[3] += vocales[3];
		contadorVocales[4] += vocales[4];
		
	}

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

	
	public int[] contarVocales() {
		// TODO Auto-generated method stub
		return contadorVocales;
	}

	
	public Map<String, Integer> contarArticulos() {
		// TODO Auto-generated method stub
		return contadorArticulos;
	}

}
