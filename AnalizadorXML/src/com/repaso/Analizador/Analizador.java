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
		LectorArchivo lectorArchivo = new LectorArchivo("/Users/Sintelti/Documents/Parrafos.txt");
		//LectorArchivo lectorArchivo = new LectorArchivo("/Users/JC/Documents/Parrafo.txt");
		//Parrafo parrafoArchivo = new Parrafo(lectorArchivo.obtenerTexto());
        Documento documento = new Documento(lectorArchivo.obtenerTexto());
        System.out.println("Numero de Parrafos: " + documento.contarParrafos());
        System.out.println("Numero de Oraciones: " + documento.contarOraciones());
        System.out.println("Numero de palabras: " + documento.contarPalabras());
        System.out.println("Numero de vocales: " + documento.contarVocales());
        System.out.println("Numero de articulos: " + documento.contarArticulos());

        LectorArchivo leerLista = new LectorArchivo("/Users/Sintelti/Documents/palabrasConocidas.txt");
        Lista listaConocidas = new Lista(leerLista.obtenerTexto());


        System.out.println(documento.obtenerListaParrafos().size());
        int parrafos = documento.obtenerListaParrafos().size();

        //System.out.println(documento.obtenerListaParrafos().get(1).obtenerListaOraciones().get(0).toString());
        int oraciones = documento.obtenerListaParrafos().get(1).obtenerListaOraciones().size();




        ArchivoXML archivoxml = new ArchivoXML();
        archivoxml.crearTagsParrafoOracion(parrafos,oraciones);
        archivoxml.crearXML();

	}// fin de main

}// fin de la clase Analizador
