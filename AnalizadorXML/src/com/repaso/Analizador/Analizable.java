package com.repaso.Analizador;

import java.util.Map;

public interface Analizable 
{
	public boolean esEOF(String palabra);
	public int[] contarVocales();
	public int contarPalabras();
	public Map<String, Integer> contarArticulos();
	public String[] separar(String texto);
}
