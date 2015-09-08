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
	private int[] contadorVocales = new int[5];
	private Map<String,Integer> contadorArticulos = new HashMap<String,Integer>();
	
	public Oracion(String entrada)
	{
		this.oracion = entrada;
		int[] vocales = new int[5];
		contadorArticulos.put("las", 0);
		contadorArticulos.put("el", 0);
		contadorArticulos.put("los", 0);
		contadorArticulos.put("la", 0);

		String[] arregloPalabras = separar(oracion);
		for(int i = 0; i < arregloPalabras.length; i++)
		{
			//impresion de consola de prueba
			listaPalabras.add(new Palabra(arregloPalabras[i]));
			//totalPalabras++;
			vocales = listaPalabras.get(i).contarVocales();
			establecerContadorVocales(vocales);
			establecerContadorArticulos(arregloPalabras[i]);
			if(!listaPalabras.get(i).esEOF(arregloPalabras[i]))
			{
				totalPalabras++;
			}
		}
	}// fin del constructor
	
	private void establecerContadorArticulos(String palabra)
	{
		int contador = 1;
		if(contadorArticulos.containsKey(palabra))
		{
			contador += contadorArticulos.get(palabra);
			contadorArticulos.put(palabra, contador );
		}
	}
	
	private void establecerContadorVocales(int[] vocales)
	{
		contadorVocales[0] += vocales[0];
		contadorVocales[1] += vocales[1];
		contadorVocales[2] += vocales[2];
		contadorVocales[3] += vocales[3];
		contadorVocales[4] += vocales[4];
	}

	//metodo que cuenta el numero total de palabras en una "Oracion"
	public int contarPalabras() {
		// TODO Auto-generated method stub
		return totalPalabras;
	}

	//metodo que separa las palabras de una "Oracion"
	public String[] separar(String texto) {
		// TODO Auto-generated method stub
		texto = texto.replaceAll("[\\.\\,]", "");
		String[] arregloPalabras = texto.split("\\s");
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


	public int[] contarVocales() {
		// TODO Auto-generated method stub
		return contadorVocales;
	}

	public Map<String, Integer> contarArticulos() {
		// TODO Auto-generated method stub
		return contadorArticulos;
	}
	

}
