package decathlon;

import common.*;

public class Deca1500M {

	private int score;
	private final double A = 0.03768;
	private final double B = 480;
	private final double C = 1.85;
	boolean active = true;

	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on time. All running events.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 180) {
					System.out.println("Value too low");
					runningTime = inputResult.enterResult();
				} else if (runningTime > 474) {
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


