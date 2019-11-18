package assignment;

public class MethodLibrary {

	public static void main(String[] args) {
		System.out.printf("%.3f%n", fahrenheitToKelvin(100));
		System.out.printf("%.3f%n", kelvinToCelsius( 0));
		System.out.printf("%.3f%n", velocityConversion(90));
		System.out.printf("%.3f%n", kineticEnergy(2, 2));
		System.out.printf("%.3f%n", potentialEnergy(2, 5));
		System.out.printf("%.3f%n", delta(1, 5, 9));
		System.out.println(smallLetters("PaParaZZi"));
		System.out.println(pr0grammering("Jag vill bli godkänd i programmering! <3"));
		System.out.printf("%.3f%n", svtTime(10, 2));
		System.out.printf("%.3f%n", work(50, 10));
		System.out.printf("%.3f%n", velocityToHeight(9.82));
		System.out.printf("%.3f%n", sphereVolumeToRadius(20));
		System.out.printf("%.3f%n", areaOfCube(4));
		System.out.printf("%.3f%n", areaOfCircle(4));
	}

	/**
	 * Converts °F to °K
	 * @param fahrenheit
	 * @return kelvin 
	 */
	public static double fahrenheitToKelvin(double fahrenheit) {
		double kelvin = ((fahrenheit+459.67)*5/9);
		return kelvin;
	}
	
	/**
	 * Converts °K to °C
	 * @param kelvin
	 * @return celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		return celsius;
	}
	
	/**
	 * Converts km/h to m/s
	 * @param velocityKmH
	 * @return
	 */
	public static double velocityConversion(double velocityKmH) {
		double velocityMs = (velocityKmH / 3.6);
		return velocityMs;
	}
	
	/**
	 * Solves the formula for kinetic energy
	 * @param mass
	 * @param velocity
	 * @return kineticEnergy
	 */
	public static double kineticEnergy(double mass, double velocity) {
			double kineticEnergy = ((mass*Math.pow(velocity, 2)) / 2);
			return kineticEnergy;
	}
	
	/**
	 * Solves the formula for potential energy
	 * @param mass
	 * @param height
	 * @return potentialEnergy
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = (mass*9.82*height);
		return potentialEnergy;
	}
	
	/**
	 * Calculates the average of three variables
	 * @param first
	 * @param second
	 * @param last
	 * @return delta
	 */
	public static double delta(double first, double second, double last) {
		double delta = ((first+second+last) / (3));
		return delta;
	}
	
	/**
	 * Converts a String into all lowercase
	 * @param word
	 * @return
	 */
	public static String smallLetters(String word) {
		String smallLetters = word.toLowerCase();
		return smallLetters;
	}
	
	/**
	 * Converts String into all uppercase and replaces 'o' with '0'
	 * @param word
	 * @return
	 */
	public static String pr0grammering(String word) {
		String pr0grammering = word.replace('o', '0').toUpperCase();
		return pr0grammering;
	}
	
	/**
	 * Calculates distance / velocity = time 
	 * @param distance
	 * @param velocity
	 * @return time 
	 */
	public static double svtTime(double distance, double velocity) {
		double time = (distance / velocity);
		return time;
	}
	
	/**
	 * Calculates force * distance = work
	 * @param force
	 * @param distance
	 * @return work
	 */
	public static double work(double force, double distance) {
		double work = (force * distance);
		return work;
	}
	
	/**
	 * Converts velocity to height 
	 * @param velocity
	 * @return height
	 */
	public static double velocityToHeight(double velocity) {
		double height = velocity /2;
		return height;
	}
	
	/**
	 * Calculates the radius of a spheres volume 
	 * @param Volume
	 * @return radius 
	 */
	public static double sphereVolumeToRadius(double Volume) {
		double radius = (Math.pow((Volume / ((4.0 / 3.0) * Math.PI)), (1.0 /3.0)));	
		return radius;
	}
	
	/**
	 * Calculates the area of a cubes
	 * @param side
	 * @return area
	 */
	public static double areaOfCube(double side) {
		double area = (Math.pow(side, 2));
		return area;
	}
	
	/**
	 * Calculates the area of a circle
	 * @param radius
	 * @return area
	 */
	public static double areaOfCircle(double radius) {
		double area = (Math.PI * Math.pow(radius, 2));
		return area;
	}
}
