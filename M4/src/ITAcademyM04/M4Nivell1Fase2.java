package ITAcademyM04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class M4Nivell1Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String plats[] = new String[10];
		int preus[] = new int[10];
		
		/**
		 * Fase 2
		 * Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. 
		 * Afegirem el nom del plat i després el preu. Pots fer us de diccionaris de
		 * dades(Java HashMap).
		 * 
		 * Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per
		 * menjar, guardarem la informació en una List fent servir un bucle while. 
		 * 
		 * Haurem de preguntar si es vol seguir demanant menjar. 
		 * Podeu fer servir el sistema (1:Si / 0:No), per tant haureu de crear 
		 * un altre variable int per guardar la informació. 
		 */
		
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
		
		int a = 0;
		for (Map.Entry<String, Integer> entry:menuDiccionari.entrySet()) {
			plats[a] = entry.getKey();
			preus[a] = entry.getValue();
			a++;
		}

		System.out.println(Arrays.toString(plats));
		System.out.println(Arrays.toString(preus));
		
		String continuar = "1";
		boolean demanarPlat = true;
		List<String> platsDemanats = new ArrayList<String>();

		try {
			while (continuar.equals("1")) {

				if (demanarPlat) {
					System.out.println("Quin plat vols?");
					String plat = getAnswer("Quin plat vols?", "Plats");
					platsDemanats.add(plat);
				}

				System.out.println("Vols continuar? (1:Si / 0:No)");
				String respostaContinuar = getAnswer("Vols continuar? (1:Si / 0:No)", "Continuar");
				if (!respostaContinuar.equals("1") && !respostaContinuar.equals("0")) {
					System.out.println("Resposta incorrecte");
					demanarPlat = false;
				} else {
					continuar = respostaContinuar;
					demanarPlat = true;
				}
			}
			System.out.println(platsDemanats);
		} catch(Exception e) {
		      System.out.println("Alguna cosa no ha funcionat." + e);
		}
		
	}
	
	private static String getAnswer(String title, String question) {
		String answer = JOptionPane.showInputDialog(null, title, question, JOptionPane.QUESTION_MESSAGE);
		return answer;

	}

}
