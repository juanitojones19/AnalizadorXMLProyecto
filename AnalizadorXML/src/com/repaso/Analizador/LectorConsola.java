package com.repaso.Analizador;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LectorConsola 
{
	private String texto;
	private String multiLinea;
	
	public void leerUnaLinea()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa el texto: ");
		texto = entrada.nextLine();
	}
	
	public void leerMultiplesLineas()
	{
		multiLinea = "";
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa el texto: ");
		String EOF = entrada.nextLine();
		EOF += "\n";
		multiLinea += EOF;
		
		do
		{
			System.out.print("Ingresa el texto: ");
			EOF = entrada.nextLine();		
			EOF += "\n";
			multiLinea += EOF;
		}while(!EOF.equalsIgnoreCase("EOF\n"));

	}
	
	//obteiene el texto ingresado
	public String obtenerTexto(){
		return texto;
	}
	
	public String obtenerMultiLinea()
	{
		return multiLinea;
	}
}
