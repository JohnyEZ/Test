import java.util.Scanner;

public class Hernandez_p2 {

	public static void main(String[] args) {
		double bmi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want metric or imperial system? (Input metric or imperial) ");
		String mode = sc.nextLine().toLowerCase().strip();
		if (mode.equals("metric")) {
			System.out.println("Input your height in centimeters: ");
			double centimeters = sc.nextDouble();
			System.out.println("Input your weight in kilograms: ");
			Double kilograms = sc.nextDouble();
			bmi = calculateBmiMetric(centimeters, kilograms);
		}
		else if (mode.equals("imperial")) {
			System.out.println("Input the feet part of your height: ");
			int feet = sc.nextInt();
			System.out.println("Input the inch part of your height: ");
			int inches = sc.nextInt();
			System.out.println("Input your weight in pounds: ");
			Double pounds = sc.nextDouble();
			bmi = calculateBmiImperial(feet, inches, pounds);
		}
		else {
			sc.close();
			return;
		}
		System.out.println("BMI Categories:\n" +
				"Underweight = <18.5\n" +
				"Normal weight = 18.5-24.9\n" +
				"Overweight = 25-29.9\n" +
				"Obese = 30+");
		System.out.println("\nYour BMI is: " + bmi);
		sc.close();
	}

	private static double calculateBmiMetric(double cm, double kg) {
		return kg/Math.pow(cm/100, 2);
	}

	private static double calculateBmiImperial(int feet, int inches, double pounds) {
		return 703 * pounds / Math.pow(feet * 12 + inches, 2);
	}
}
