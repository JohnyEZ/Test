import java.util.Scanner;

public class Hernandez_p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a four-digit number: ");
		String initialDigits = sc.nextLine();
		System.out.println("Do you want to encrypt or to decrypt? ");
		String mode = sc.nextLine().toLowerCase();
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (int index: new int[] {2, 3, 0, 1}) {
			if (mode.equals("encrypt"))
				sb.append(encodeDigit(initialDigits.charAt(index)));
			else if (mode.equals("decrypt"))
				sb.append(decodeDigit(initialDigits.charAt(index)));
			else
				return;
		}
		System.out.println("Result: " + sb.toString());

	}

	private static char encodeDigit(char digit) {
		return (char)(((digit - '0' + 7) % 10) + '0');
	}

	private static char decodeDigit(char digit) {
		return (char)(((digit - '0' + 3) % 10) + '0');
	}
}
