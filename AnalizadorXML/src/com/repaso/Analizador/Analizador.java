package com.repaso.Analizador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Analizador {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		// Una simple
        /*
		LectorConsola lector = new LectorConsola();
		lector.leerUnaLinea();
		Parrafo parrafo = new Parrafo(lector.obtenerTexto());
		System.out.println("Numero de palabras: " + parrafo.contarPalabras());
		
		//Multiples lineas
		LectorConsola lectorMulti = new LectorConsola();
		lectorMulti.leerMultiplesLineas();
		Parrafo parrafoMultiLinea = new Parrafo(lectorMulti.obtenerMultiLinea());
		System.out.println("total palabras: " + parrafoMultiLinea.contarPalabras());
		*/
		//Archivo
		//LectorArchivo lectorArchivo = new LectorArchivo("/Users/Sintelti/Documents/Parrafos.txt");
		LectorArchivo lectorArchivo = new LectorArchivo("/Users/JC/Documents/Parrafo.txt");
		//Parrafo parrafoArchivo = new Parrafo(lectorArchivo.obtenerTexto());
        Documento documento = new Documento(lectorArchivo.obtenerTexto());
        System.out.println("Numero de Parrafos: " + documento.contarParrafos());
        System.out.println("Numero de Oraciones: " + documento.contarOraciones());
        System.out.println("Numero de palabras: " + documento.contarPalabras());
        System.out.println("Numero de vocales: " + documento.contarVocales());
        System.out.println("Numero de articulos: " + documento.contarArticulos());

        LectorArchivo leerLista = new LectorArchivo("/Users/JC/Documents/palabrasConocidas.txt");
        Lista listaConocidas = new Lista(leerLista.obtenerTexto());

		//lista de prueba
		List<String> lista = new ArrayList<String>();

		lista.add("hola");
		lista.add("como");
		lista.add("no");
		lista.add("si");
		lista.add("yo");
		lista.add("la");

		String palabra = "hola";
		String palabra2 = listaConocidas.obtenerLista().get(0);

		System.out.println("Palabra: " + palabra + " Palabra2: " + palabra2);
		System.out.println("Son iguales: " + (palabra2.contains(palabra)));
		/*

		for(int i = 0; i < listaConocidas.obtenerLista().size(); i++)
		{
			System.out.println("Elemento: " + lista.get(i));
		}


		for(int i = 0; i < listaConocidas.obtenerLista().size(); i++)
		{
			//System.out.println("Elemento: " + listaConocidas.obtenerLista().get(i).toString());

			if(listaConocidas.estaElemento("hola")) {
				System.out.println("Si se encuenta " + lista.get(i));
			}
		}
		*/


		System.out.println("ESta?: " + listaConocidas.estaElemento("hola"));
		System.out.println("ESta?: " + listaConocidas.estaElemento("como"));
		System.out.println("ESta?: " + listaConocidas.estaElemento("no"));
		System.out.println("ESta?: " + listaConocidas.estaElemento("si"));
		System.out.println("ESta?: " + listaConocidas.estaElemento("yo"));
		System.out.println("ESta?: " + listaConocidas.estaElemento("la"));

	}// fin de main

}// fin de la clase Analizador
