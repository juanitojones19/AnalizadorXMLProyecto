package com.repaso.Analizador;



import java.util.Map;

public class Palabra implements Analizable
{
	private String texto;
	private int[] vocales = new int[5];
	
	public Palabra(String entrada)
	{
		texto = entrada;
		String[] arregloLetras = separar(texto);
		for (int i = 0; i < arregloLetras.length; i++) {
            establecerContadorVocales(arregloLetras[i]);
		}
	}// fin del constructor
	
	//establece el numero de vocales se tiene en una palabra
	private void establecerContadorVocales(String letra)
	{
        //System.out.print(letra.getClass());
        if(letra.equals("a") || letra.equals("A"))
		{
			vocales[0] += 1; 
		}else if(letra.equals("e") || letra.equals("E")){
			vocales[1] += 1;
		}else if (letra.equals("i") || letra.equals("I") ){
			vocales[2] += 1;
		}else if (letra.equals("o") || letra.equals("O")){
			vocales[3] += 1;
		}else if (letra.equals("u") || letra.equals("U")){
			vocales[4] += 1;
		}
	}// fin de establecerContadorVocales

	//cuenta las palabras de un texto
	public int contarPalabras() {
		// TODO Auto-generated method stub
		return 1;
	}


	public boolean esEOF(String palabra) {
		// TODO Auto-generated method stub
		return palabra.equals("EOF");
	}

	//separa las vocales de una palabra
	public String[] separar(String palabra) {
		// TODO Auto-generated method stub
		String[] arregloPalabra = new String[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
            arregloPalabra[i] = "" + palabra.charAt(i);
        }

		return arregloPalabra;
	}

	
	public int[] contarVocales() {
		// TODO Auto-generated method stub
		return vocales;
	}

	
	public Map<String, Integer> contarArticulos() {
		// TODO Auto-generated method stub
		return null;
	}

}
