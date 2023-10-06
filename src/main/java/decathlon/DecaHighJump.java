package decathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class DecaHighJump {

	private int score;
	public int getScore() {
		return score;
	}
	private final double A = 0.8465;
	private final double B = 75;
	private final double C = 1.42;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in centimeters.
	public void calculateResult(double distance) {
		active=true;
		while (active) {

			try {
				// Acceptable values.
				if (distance < 76.2) {
					System.out.println("Value too low");
					distance = inputResult.enterResult();
				} else if (distance > 260) {
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
