package common;

public class CalcTrackAndField {

	private int result;

	private static double score;


	public static int getScore() {
		return (int) score;
	}

	// Calculates height and distance for field discipline.
	public int calculateField(double A, double B, double C, double distance) {
		result = (int) (A * Math.pow((distance - B), C));
		score=result;
		return result;
	}

	// Calculates height and distance for track discipline.
	public int calculateTrack(double A, double B, double C, double distance) {
		result = (int) (A * Math.pow((B - distance), C));

		score=result;
		return result;
	}

}
