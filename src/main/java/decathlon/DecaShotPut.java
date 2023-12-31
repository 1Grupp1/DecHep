package decathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class DecaShotPut {

	private int score;
	public int getScore() {
		return score;
	}
	private final double A = 51.39;
	private final double B = 1.5;
	private final double C = 1.05;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in meters.
	public void calculateResult(double distance) {
		active=true;
		while (active) {

			try {
				// Acceptable values.
				if (distance < 1.53) {
					System.out.println("Value too low");
					distance = inputResult.enterResult();
				} else if (distance > 25) {

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
}
