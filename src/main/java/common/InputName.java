package common;

import java.util.Scanner;

public class InputName {
	String compName = "";

	private static String name;

	public static String getName() {

		return name;
	}

	//Add competitor
	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);

		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			name=compName;
			if (!compName.matches(".*[a-öA-ö]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {
				active = false;
			}

		}

		return compName;
	}
}
