package com.repaso.Analizador;

import java.io.FileNotFoundException;
import java.io.IOException;

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
		LectorArchivo lectorArchivo = new LectorArchivo("/Users/Sintelti/Documents/Parrafos.txt");
		//Parrafo parrafoArchivo = new Parrafo(lectorArchivo.obtenerTexto());
        Documento documento = new Documento(lectorArchivo.obtenerTexto());
        System.out.println("Numero de Parrafos: " + documento.contarParrafos());
        System.out.println("Numero de Oraciones: " + documento.contarOraciones());
        System.out.println("Numero de palabras: " + documento.contarPalabras());
        System.out.println("Numero de vocales: " + documento.contarVocales());
        System.out.println("Numero de articulos: " + documento.contarArticulos());

        LectorArchivo leerLista = new LectorArchivo("/Users/Sintelti/Documents/palabrasConocidas.txt");
        Lista listaConocidas = new Lista(leerLista.obtenerTexto());

	}// fin de main

}// fin de la clase Analizador
