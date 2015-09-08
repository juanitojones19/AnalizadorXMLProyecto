package com.repaso.Analizador;

import java.util.Map;

public interface Analizable 
{
	public boolean esEOF(String palabra);
	public int contarVocales();
	public int contarPalabras();
	public int contarArticulos();
	public String[] separar(String texto);
}
