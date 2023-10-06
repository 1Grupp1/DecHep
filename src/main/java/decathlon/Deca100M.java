package decathlon;

import common.*;

public class Deca100M {
//test
	private int score;
	public int getScore() {
		return score;
	}
	private final double A = 25.4347;
	private final double B = 18;
	private final double C = 1.81;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {
		active=true;
		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 9) {
					System.out.println("Value too low");
					runningTime = inputResult.enterResult();
				} else if (runningTime > 17.9) {
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
		System.out.println("Your score is " + score + " points");

	}
}
