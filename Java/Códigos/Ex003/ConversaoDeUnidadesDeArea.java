import java.util.Scanner;

public class ConversaoDeUnidadesDeArea {

	public static double metroPes(double metro) {
		double pes = metro*10.76;
		return pes;
	}
	
	public static double peCent(double pe) {
		double cent = pe*929.03;
		return cent;
	}

	public static double milhaAcres(double milha) {
		double acres = milha*640;
		return acres;
	}

	public static double acrePes(double acre) {
		double pes1 = acre*43.560;
		return pes1;
	}
	
		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double metro;
		double pe;
		double milha;
		double acre;
		
		System.out.println("---------------------------------");
		System.out.println("Metro Quadrado para P� Quadrado: ");
		metro = (entrada.nextDouble());
		double pes = metroPes(metro);
		System.out.println(pes + " p�s quadrados.");

		System.out.println("---------------------------------");
		System.out.println("P� Quadrado para Cent�metro Quadrado: ");
		pe = (entrada.nextDouble());
		double cent = peCent(pe);
		System.out.println(cent + " cent�metros quadrados.");

		System.out.println("---------------------------------");
		System.out.println("Milha Quadrado para Acre Quadrado: ");
		milha = (entrada.nextDouble());
		double acres = milhaAcres(milha);
		System.out.println(acres + " acres quadrados.");

		System.out.println("---------------------------------");
		System.out.println("Acre Quadrado para P� Quadrado: ");
		acre = (entrada.nextDouble());
		double pes1 = acrePes(acre);
		System.out.println(pes1 + " p�s quadrados.");
	}
}