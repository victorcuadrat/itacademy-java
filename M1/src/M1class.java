
public class M1class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom = "Victor";
		String cognom1 = "Cuadrat";
		String cognom2 = "Muñoz";

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
		
		for ( int i = 1; i <= div; i++) {
			System.out.println(i);
			
			trespas = trespas + quatre;
			
			System.out.println(trespas);
		}
	}

}
