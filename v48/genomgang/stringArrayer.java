package genomgang;

public class stringArrayer {

	public static void main(String[] args) {

		String[] namn = { "Bert", "Gudrun", "Olle", "Britta-Lena" };
		
		for (int i = 0; i < 40; ) {
			for (int j = 0; j < namn.length; j++) {
				i = i+1;
				System.out.println(i + ", " + namn[j]);
			}
		}
	}

}
