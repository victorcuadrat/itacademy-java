package ITAcademyM04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.tools.javac.util.List;


public class M4Nivell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * NIVELL 1
		 * 
		 * Fase 1
		 * L’exercici consisteix a mostrar per consola una carta d’un restaurant
		 * on afegirem diferents plats i després escollirem que volem per menjar. 
		 * 
		 * Un cop fet això s’haurà de calcular el preu del menjar el programa ens 
		 * dirà amb quins bitllets hem de pagar. 
		 * 
		 * - Creeu una variable int per cada un dels bitllets que existeixen 
		 * des de 5€ a 500€, haureu de crear un altre variable per guardar el preu 
		 * total del menjar.  
		 * 
		 * - Creeu dos arrays, un on guardarem el menú i un altre on guardarem el preu 
		 * de cada plat.  
		 */
		
		int cinc = 5, deu = 10, vint = 20, cinquanta = 50, cent = 100, doscents = 200, cinccents = 500;
		
		String[] menu = new String[8];
		String[] preus = new String[8];

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
		
		int a = 0;
		for (Map.Entry item : menuDiccionari.entrySet()) {
			menu[a] = item.getKey().toString();
			preus[a] = item.getValue().toString();
			a++;
		}

		System.out.println(Arrays.toString(menu));
		System.out.println(Arrays.toString(preus));
		
		java.util.Iterator<Entry<String, Integer>> iter = menuDiccionari.entrySet().iterator();
		
		List<Integer> comanda = new ArrayList<Integer>();
		
		int b = 0;
		while (b < menu.length) {
			System.out.println("Vols" + menu[menu.length] + "que val" + preus[preus.length] + "?");
			menu = ArrayUtils.removeElement(menu, menu[menu.length]);
			preus = ArrayUtils.removeElement(preus, preus[preus.length]);
		}

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
	}

}
