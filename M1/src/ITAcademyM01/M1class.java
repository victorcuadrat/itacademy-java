package ITAcademyM01;

public class M1class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom = "Victor";
		String cognom1 = "Cuadrat";
		String cognom2 = "Mu�oz";

		int dia = 06;
		int mes = 06;
		int any = 1997;
		
		
		System.out.println(cognom1 + " " + cognom2 + ", " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		
		int trespas = 1948;
		int quatre = 4;
		int div = (any - trespas)/quatre;
		System.out.println(div);
		
		// int nou = trespas;
		
		for ( int i = 0; i <= div; i++) {
			System.out.println(i);
			
			trespas = trespas + quatre;
			
			System.out.println(trespas);
		}
		
		boolean esTrespas = false;
		
		String certa = "El meu any de naixement �s de trasp�s";
		String falsa = "El meu any de naixement no �s de trasp�s";
		
		String nomcompl = nom + cognom1 + cognom2;
		String data = dia + "/" + mes + "/" + any;
		
		System.out.println("El meu nom �s " + nomcompl);
		System.out.println("Vaig n�ixer el " + data);
		System.out.println(falsa);
		
		double numero = 4.3243;
		
		int a = 9;
		float b = 32;
		String c = "string example";
		int i = (int)numero;
		
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(array);
		
	    for (int j = 0; j < array.length / 2; j++) {
	    	int temp = array[j];
	    	array[j] = array[array.length - 1 - j];
	    	array[array.length - 1 - j] = temp;
	    }
	    
	    // Print out the new array to check that is has been inverted
	    for (int k=0; k<array.length; k++)
	    {
	      System.out.println(array[k]);
	    }
		
	}

}
