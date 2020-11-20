package proyecto_01_ejemplo;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> listaNums = new ArrayList<Integer>();
		
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("Criss");
		listaNombres.add("Ana");
		listaNombres.add("Diana");
		listaNombres.add("Pedro");
		
		//System.out.println("Lista de Nombres: " + listaNombres);
		
		listaNombres.add("Stefanie");
		listaNombres.add("Rafael");
		listaNombres.add("Angelica");
		
	//	System.out.println("Lista de Nombres: Nuevos " + listaNombres);
		
		String name = "Daniela";
		
		listaNombres.add(name);
		
		// listaNombres.clear();
		
		listaNombres.remove(0);
	
		
		System.out.println("Lista de Nombres: Nuevos " + listaNombres.get(0));
		
	}

}
