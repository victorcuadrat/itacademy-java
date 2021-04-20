package ITAcademyM04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class M4Nivell1Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> menuDiccionari = new HashMap<String, Integer>();
		
		menuDiccionari.put("Sopa", 8);
		menuDiccionari.put("Pizza", 11);
		menuDiccionari.put("Carn", 15);
		menuDiccionari.put("Gelat", 6);
		menuDiccionari.put("Paella", 18);
		menuDiccionari.put("Vi", 28);
		menuDiccionari.put("Amanida", 9);
		menuDiccionari.put("Peix", 17);
		menuDiccionari.put("Marisc", 37);
		menuDiccionari.put("Llom", 7);
		
		List<String> platsDemanats = new ArrayList<String>();

		platsDemanats.add("Pizza");
		platsDemanats.add("Sopa");
		platsDemanats.add("Carbonara");

		/**
		 * Fase 3
		 * Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb
		 * l’array que hem fet al principi. En el cas que la informació que hem introduït
		 * a la List coincideixi amb la del array, haurem de sumar el preu del producte 
		 * demanat; en el cas contrari haurem de mostrar un missatge que digui que el 
		 * producte que hem demanat no existeix. 
		 * 
		 * Recomanacions: has de validar que les dades introduïdes per consola 
		 * compleixen els requeriments de format i extensió per mitjà del control 
		 * d'excepcions de Java. 
		 */
		
		int sumaTotal = 0;
		
		for (String p:platsDemanats) {
			try {
				if (menuDiccionari.containsKey(p)) {
					sumaTotal += menuDiccionari.get(p);
				} else {
					System.out.println("No hi ha: " + p);
				}
			} catch(Exception e) {
			      System.out.println("Alguna cosa no ha funcionat.");
			}
		}
	     System.out.println("La suma total és: " + sumaTotal);
	}
}
