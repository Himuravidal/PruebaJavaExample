package proyecto_01_ejemplo;

import java.util.Scanner;

public class Main {
											
	public static void main(String[] args) {
		
		String name = "Criss"; 
		int ex = 10;
		int exdsd = 10;
		int cantidadTrabajador = 20;	
		int otraVariable = 100;
		
		int MESES_DEL_AÑO;
		
		
		int edad[] = new int[3];
		edad[0] = 15;
		edad[1] = 35;
		edad[2] = 25;

		if (edad.length == 4) {
			for (int i = 0; i < 3; i++) 
			{
				System.out.println("Contiene 4 elementos");
			}
				} else {
				for (int i = 0; i < 3; i++) {
					System.out.println("Los elementos del array edad son:" 
							+ " Elemento " + (i + 1) + " Es: " + edad[i]);
				}
		}
		

		
		/*
		 * Esta parte del codigo realiza una funcion X
		 * Recibe parametros J y devuelve N
		 * 
		 */

		// String [] nombres = new String[] {"Criss", "Sergio", "Veda"};
		String[] nombres = { "Criss", "Sergio", "Veda", "Garcy", "Ana",
				"Diana", "Pedro", "Joaquin" };
		// int [] numeros = new int[] {10, 20, 339, 400};
		int[] numeros = { 10, 20, 339, 400 };

		// for each
		for (String contenido : nombres) {
			System.out.println("Los nombres son :" + contenido);
		}
		// for each
		for (int num : numeros) {
			System.out.println("Los numeros son :" + num);
		}

	}// este cierra el main

}// este cierra la clase
