package ITAcademyM02;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.*;

public class M2Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		/** NIVELL 1
		 * 
		 * - Fase 1
			Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra. 
			Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres. 
		 */
		
		char[] nom = new char[8];
		nom[0] = 'V';
		nom[1] = 'i';
		nom[2] = 'c';
		nom[3] = 't';
		nom[4] = 'o';
		nom[5] = 'r';
		nom[6] = '1'; // testing task 2
		nom[7] = '!'; // testing task 2

		// Alternative in one line:
		// char[] nom = {'V','i','c','t','o','r'};
		
		for (char n:nom) {
			System.out.println(n);
		}
		
		/**
		 * - Fase 2
			Canvia la taula per una llista (List<Character>) 
			Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. 
			Sinó, imprimeix: ‘CONSONTANT’. 
			Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’. 
		 */
		
		// nom is already a List<char>
		// System.out.println(nom.getClass().getSimpleName());
		// List<char[]> nomLlista = Arrays.asList(nom);
		
		/** Com s'implementa això?
		 * public static boolean isVowel(char c) {
			  return "AEIOUaeiou".indexOf(c) != -1;
			}
		 */
		
		for (char n:nom) {
			
			// Checks if is a Letter or a Digit
			if (Character.isLetter(n)) {
				
				// Checks if is a vowel or a consonant (case insensitive)
				if ("AEIOUaeiou".indexOf(n) != -1) {
					System.out.println(n + ": VOCAL");
				}
				else {
					System.out.println(n + ": CONSTANT");
				}
			} else if (Character.isDigit(n)) {
				System.out.println("Els noms de persones no contenen números!");
			} else {
				System.out.println("What? No és ni una lletra ni un número...");
			}
						
		}
		
		
		/**
		 * - Fase 3
			Emmagatzemar en un Map tant les lletres de la llista com el nombre 
			de vegades que apareixen.  		
		 */
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char n:nom) {    
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
				// map.merge(n, 1, Integer::sum);
			} else {
				map.put(n, 1);
			}
		}
		 
		/**
		 * - Fase 4
			Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra. 
			Fusiona les dues llistes en una sola. 
			A més, afegeix una posició amb un espai buit entre la primera i la segona. 
			És a dir, partim de la llista name i surname i al acabar l’execució només 
			tindrem una que es dirà fullName. 
		 */
	
		char[] cognom = {'C', 'u','a','d','r','a','t'};
		
		StringBuilder sb = new StringBuilder(64);
		
		sb.append(nom);
		sb.append(" ");
		sb.append(cognom);
		
		char fullName[] = sb.toString().toCharArray();
		
		for (char n:fullName) {
			System.out.println(n);
		}
		
		/**
		 * NIVELL 2
		 *
		 * - Fase 1:
			Crea una aplicació que dibuixi una escala de nombres, 
			sent cada línia nombres començant en un i acabant en el nombre de la línia. 
			Aquest és un exemple, si introduïm un 5 com a alçada: 
		 */
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Number: " ));
		String numbers = "";
		int counter = 1;
		while (counter <= number) {
			numbers = numbers + counter;
			counter++;
		}
		
		// System.out.println(numbers);
		
		int c = 1;
		while (c <= number) {
			System.out.println(numbers.substring(0, c));
			c++;
		}
		
		
		/**
		 * - Fase2:
		 * Crea una aplicació que dibuixi una piràmide invertida de asteriscs. 
		 * Nosaltres li vam passar l'altura de la piràmide per teclat. Aquest és un exemple: 
		 */
		
		
		int number2 = 0;
		while (number2 < 11) {
			number2 = Integer.parseInt(JOptionPane.showInputDialog("Number of asterisks (at least 11): " ));
		}
		
		String asterisks = "";
		int counter2 = 1;
		while (counter2 <= number2) {
			asterisks = asterisks + "*";
			counter2++;
		}
		
		// System.out.println(asterisks);
		
		
		int w = 0;
		String whites = " ";
		
		while (number2 >= 0) {
			System.out.println(whites.substring(0, w) + asterisks.substring(0, number2));
			number2--;
			number2--;
			whites = whites + " ";
			w++;
		}
		
		/** NIVELL 3
		 * 
		 * En quest exercici es proposa un exercici complex de comprovacions i bucles per crear un rellotge digital que mostra l'hora sense parar. A més té un segon d'espera per més realisme. 
			Només necessites 3 variables int (hour, minutes, seconds) 
			El rellotge ha de tenir 6 dígits en tot moment: 00:00:00 
			L’aplicació no ha de finalitzar mai. 
			Per que el rellotge trigui un segon has d’implementar:  Thread.sleep(1000); 
		 */
		
		DecimalFormat formatter = new DecimalFormat("00");
		
		int hour = 0;
		while (hour < 24) {
			int minutes = 0;
			while (minutes < 60) {
				int seconds = 0;
				while (seconds < 60) {
					seconds++;
					Thread.sleep(1000); 
					String output = formatter.format(hour) + ":" + formatter.format(minutes) + ":" + formatter.format(seconds);
					System.out.println(output);
					System.out.println("\r");
					
					// printing "\r" should remove the print instead of doing newline
					// reported eclipse bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=87991
				}
				minutes++;
			}
			hour++;
			if (hour == 24) {
				hour = 0;
			}
		}
		
		
	}

}
