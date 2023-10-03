package decathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class DecaDiscusThrow {

	private int score;
	private final double A = 12.91;
	private final double B = 4;
	private final double C = 1.1;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in meters.
	public void calculateResult(double distance) {

		while (active) {

			try {
				// Acceptable values.
				if (distance < 4.1) {
					System.out.println("Value too low");
					distance = inputResult.enterResult();
				} else if (distance > 76) {
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
		System.out.println("Your score is: " + score + " points");

	}
	public int getScore() {
		return score;
	}
}
