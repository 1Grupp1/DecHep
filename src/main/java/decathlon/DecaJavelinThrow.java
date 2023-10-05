package decathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class DecaJavelinThrow {

	private int score;
	public int getScore() {
		return score;
	}
	private final double A = 10.14;
	private final double B = 7;
	private final double C = 1.08;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in meters.
	public void calculateResult(double distance) {

		while (active) {

			try {
				// Acceptable values.
				if (distance < 7.2) {
					System.out.println("Value too low");
					distance = inputResult.enterResult();
				} else if (distance > 90) {
					System.out.println("Value too high");
					distance = inputResult.enterResult();

				} else {

					score = calc.calculateField(A, B, C, distance);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is: " + score);

	}

}
