package genomgang;

public class arrayer2 {

	public static void main(String[] args) {
		
		double[] numbers = new double[20];
		double[] numbers2 = {2.718, 3.14, 4.6692, 9.82};
		
		String[] namn = {"Svant", "linrom", "Marksism", "Antenn14", "Patrik", "Kan man säga", "att du är galen", "i svamp?"};
		int antalA = 0;
		
		for (int i = 0; i < namn.length; i++) {
			
			
			for (int j = 0; j < namn[i].length(); j++) {
				if(namn[i].contains("a")) {
					antalA++;
				}
			}
			
		}
		System.out.println("Antalen A är " + antalA);

	}

}
