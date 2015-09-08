package com.repaso.Analizador;



import java.util.Map;

public class Palabra implements Analizable
{
	private String texto;

    //contador que almacena el numero total de vocales
    private int contadorVocales;
	
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
            contadorVocales += 1;
		}else if(letra.equals("e") || letra.equals("E")){
            contadorVocales += 1;
		}else if (letra.equals("i") || letra.equals("I") ){
            contadorVocales += 1;
		}else if (letra.equals("o") || letra.equals("O")){
            contadorVocales += 1;
		}else if (letra.equals("u") || letra.equals("U")){
            contadorVocales += 1;
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

	public int contarVocales() {
		// TODO Auto-generated method stub
		return contadorVocales;
	}

	
	public int contarArticulos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
