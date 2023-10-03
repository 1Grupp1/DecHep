package decathlon;

import common.*;

public class Deca400M {

	private int score;
	private final double A = 1.53775;
	private final double B = 82;
	private final double C = 1.81;
	boolean active = true;

	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 42.5) {
					System.out.println("Value too low");
					runningTime = inputResult.enterResult();
				} else if (runningTime > 81) {
					System.out.println("Value too high");
					runningTime = inputResult.enterResult();
				} else {

					score = calc.calculateTrack(A, B, C, runningTime);
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
