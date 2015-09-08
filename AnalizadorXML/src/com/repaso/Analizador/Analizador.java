package com.repaso.Analizador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Analizador {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int[] totatlVocales = new int[5];
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
		LectorArchivo lectorArchivo = new LectorArchivo("/Users/Juanito/Documents/Parrafo.txt");
		System.out.println("Hola mundo");
		//Parrafo parrafoArchivo = new Parrafo(lectorArchivo.obtenerTexto());
		/*
		System.out.println("Vocal a: " + parrafoArchivo.contarVocales()[0]);
		System.out.println("Vocal e: " + parrafoArchivo.contarVocales()[1]);
		System.out.println("Vocal i: " + parrafoArchivo.contarVocales()[2]);
		System.out.println("Vocal o: " + parrafoArchivo.contarVocales()[3]);
		System.out.println("Vocal u: " + parrafoArchivo.contarVocales()[4]);
		System.out.println("total palabras: " + parrafoArchivo.contarPalabras());
		System.out.println("Numero de las: " + parrafoArchivo.contarArticulos().get("las"));
		System.out.println("Numero de el: " + parrafoArchivo.contarArticulos().get("el"));
		System.out.println("Numero de los: " + parrafoArchivo.contarArticulos().get("los"));
		System.out.println("Numero de la: " + parrafoArchivo.contarArticulos().get("la"));
		*/
	}

}
