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
		//lista
		LectorArchivo leerLista = new LectorArchivo("/Users/JC/Documents/palabrasConocidas.txt");
		LectorArchivo leerProhibidas = new LectorArchivo("/Users/JC/Documents/palabrasProhibidas.txt");
		Lista diccionario = new Lista(leerLista.obtenerTexto(), leerProhibidas.obtenerTexto());
		//diccionario.censurarPalabra(new Oracion("ahi te va la lanza del foro"));
		//Lista.censurarPalabra(new Oracion("ahi te va la lanza del foro"));


		LectorArchivo lectorArchivo = new LectorArchivo("/Users/JC/Documents/Parrafo.txt");
		//LectorArchivo lectorArchivo = new LectorArchivo("/Users/JC/Documents/Parrafo.txt");
		//Parrafo parrafoArchivo = new Parrafo(lectorArchivo.obtenerTexto());

		//archivo
        Documento documento = new Documento(lectorArchivo.obtenerTexto());

		System.out.println("Numero de Conocidas: " + documento.contarConocidas());
		System.out.println("Numero de Censuradas: " + documento.contarPalabrasCensuradas());

		//Lista listaProhibidas = new Lista(leerProhibidas.obtenerTexto());

		//diccionario.estaElemento(documento.obtenerListaParrafos().get(0).obtenerListaOraciones().get(0));
		//diccionario.censurarPalabra(documento.obtenerListaParrafos().get(0).obtenerListaOraciones().get(0));
		//listaProhibidas.censurarPalabra(documento.obtenerListaParrafos().get(0).obtenerListaOraciones().get(0));



        ArchivoXML archivoxml = new ArchivoXML();
        archivoxml.crearTagsParrafoOracion(documento);
		archivoxml.crearTagAnalizar(documento);
        archivoxml.crearXML();

	}// fin de main

}// fin de la clase Analizador
