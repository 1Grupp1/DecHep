package common;

import java.util.Scanner;
public class InputName {


	static String name;

	static boolean thisbool=true;

	public static String getName() {
		return name;
	}

	public static void addCompetitor(int numberOfKeys) {

		while (thisbool){
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < numberOfKeys; i++) {
				String compName;
				boolean validName = false;

				do {
					System.out.print("Enter the name for competitor " + (i + 1) + ": ");
					compName = sc.nextLine();

					if (isValidName(compName)) {

						validName = true;
					}else {
						System.out.println("Invalid name. Only use letters when putting in the competitor's name.");
					}

				}while (!validName);
				SelectDiscipline.addKey(compName);
				name=compName;

			}thisbool=false;
		}
		System.out.print("This is your competitors: ");

	}

	private static boolean isValidName(String name) {
		return name.matches(".*[a-öA-ö]");
	}


}