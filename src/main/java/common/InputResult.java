package common;

import java.util.Scanner;

public class InputResult {
	double inputResult = 0;

	private static double result;

	public static int getResult() {
		return (int) result;
	}

	public double enterResult() {
		Scanner sc = new Scanner(System.in);
		boolean active = true;
		while (active) {
			System.out.println();
			System.out.println("Please enter the result to calculate your score:");
			try {

				result = Double.parseDouble(sc.nextLine());
				inputResult=result;
				active = false;
			} catch (Exception e) {
				System.out.println("Invalid input, try again.");

			}

		}

		return inputResult;
	}

	public double returnResult() {
		return inputResult;
	}
}
