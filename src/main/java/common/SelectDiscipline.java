package common;

import java.util.Scanner;

import decathlon.Deca100M;
import decathlon.Deca1500M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import decathlon.DecaDiscusThrow;
import decathlon.DecaHighJump;
import decathlon.DecaJavelinThrow;
import decathlon.DecaLongJump;
import decathlon.DecaShotPut;
import decathlon.DecaPoleVault;
import excel.ExcelMaker;
import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHightJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;

public class SelectDiscipline {

	private static int decOrHep;

	private static int discipline;

	private static String decHep;


	public static int getDiscipline() {
		return discipline;
	}

	public static String getDisciplineSelection() {

		return decHep;
	}

	int disciplineSelected;
	InputResult inputResult = new InputResult();
	ExcelMaker excelMaker = new ExcelMaker();
	static Scanner sc = new Scanner(System.in);
	Deca100M deca100M = new Deca100M();
	Deca400M deca400M = new Deca400M();
	Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
	Deca1500M deca1500M = new Deca1500M();
	DecaLongJump decaLongJump = new DecaLongJump();
	DecaHighJump highJump = new DecaHighJump();
	DecaDiscusThrow discusThrow = new DecaDiscusThrow();
	DecaShotPut decaShotPut = new DecaShotPut();
	DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
	DecaPoleVault poleVault = new DecaPoleVault();

	Hep200M hep200M = new Hep200M();
	Hep800M hep800M = new Hep800M();
	Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
	HeptHightJump hepHighJump = new HeptHightJump();
	HeptLongJump hepLongJump = new HeptLongJump();
	HeptShotPut hepShotPut = new HeptShotPut();
	HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();


	//Receive input	of selection of discipline.
	static boolean hepDecBoolean = true;

	public static void decOrHep() {
		if (hepDecBoolean) {
			System.out.println("Please choose heptathlon or decathlon:");
			System.out.println("press 1 for: Heptathlon");
			System.out.println("press 2 for: Decathlon");

			decOrHep = Integer.parseInt(sc.nextLine());
		}

		switch (decOrHep) {
			case 1:
			case 2:
				hepDecBoolean = false;
				break;

			default:
				System.out.println("Invalid input, try again.");
				System.out.println("");
				decOrHep();
				break;
		}

	}


	public void inputSelection() {
		System.out.println("Select discipline.");


		try {


			if (decOrHep == 1) {
				System.out.println("Heplathlon");
				printDisciplinesHeptathlon();

				discipline = Integer.parseInt(sc.nextLine());

				disciplineSelected = discipline;
				chosenDisciplineHeptathlon();
				makeSelection();
			}
			if (decOrHep == 2) {
				System.out.println("Dechlation");
				printDisciplinesDecathlon();
				discipline = Integer.parseInt(sc.nextLine());
				disciplineSelected = discipline;
				chosenDisciplineDecathlon2();
				makeSelection2();
			}

		} catch (Exception e) {
			System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
		}

	}

	public static void chosenDisciplineHeptathlon() {
		String[] decHep2 = {"Hep 200M", "Hep 800M", "Hep 100M Hurdles", "Hep High Jump", "HepLongJump", "Hep Shot Put", "Hep Javelin Throw"};
		decHep = decHep2[discipline - 1];

		//  System.out.println(decHep);

	}

	public static void chosenDisciplineDecathlon2() {
		String[] decHep2 = {"Deca 100M", "Deca 400M", "Deca 110M Hurdles", "Deca 1500M", "Deca Long Jump", "Dec High Jump", "Dec Pole Vault"
				, "Dec Discus Throw", "Deca Javelin Throw", "Deca Shot Put"};
		decHep = decHep2[discipline - 1];

		// System.out.println(decHep);

	}


	// Check input of discipline.
	public void makeSelection() {


		switch (disciplineSelected) {
			case 1:
				System.out.println("You have selected Hep 200M, input your result in seconds");
				hep200M.calculateResult(inputResult.enterResult());
				break;
			case 2:
				System.out.println("You have selected Hep 800M, input your result in seconds");
				hep800M.calculateResult(inputResult.enterResult());
				break;
			case 3:
				System.out.println("You have selected Hep 100M Hurdles, input your result in seconds");
				hep100MHurdles.calculateResult(inputResult.enterResult());
				break;
			case 4:
				System.out.println("You have selected Hep High Jump, input your result in centimeter");
				hepHighJump.calculateResult(inputResult.enterResult());
				break;
			case 5:
				System.out.println("You have selected Hep Long Jump, input your result in centimeter");
				hepLongJump.calculateResult(inputResult.enterResult());
				break;
			case 6:
				System.out.println("You have selected Hep Shot Put, input your result in meter");
				hepShotPut.calculateResult(inputResult.enterResult());
				break;
			case 7:
				System.out.println("You have selected Hep Javelin Throw, input your result in meter");
				hepJavelinThrow.calculateResult(inputResult.enterResult());
				break;

			default:
				System.out.println("Invalid input, try again.");
				System.out.println("");
				inputSelection();
				break;
		}

		excelMaker.excelMaker();

	}

	public void makeSelection2() {

		switch (disciplineSelected) {

			case 1:
				System.out.println("You have selected Deca 100M, input your result in seconds");
				deca100M.calculateResult(inputResult.enterResult());
				break;
			case 2:
				System.out.println("You have selected Deca 400M, input your result in seconds");
				deca400M.calculateResult(inputResult.enterResult());
				break;
			case 3:
				System.out.println("You have selected Deca 110M Hurdles, input your result in seconds");
				deca110MHurdles.calculateResult(inputResult.enterResult());
				break;
			case 4:
				System.out.println("You have selected Deca 1500M, input your result in seconds");
				deca1500M.calculateResult(inputResult.enterResult());
				break;
			case 5:
				System.out.println("You have selected Deca Long Jump, input your result in centimeter");
				decaLongJump.calculateResult(inputResult.enterResult());
				break;
			case 6:
				System.out.println("You have selected Deca High Jump, input your result in centimeter");
				highJump.calculateResult(inputResult.enterResult());
				break;
			case 7:
				System.out.println("You have selected Deca Pole Vault, input your result in centimeter");
				poleVault.calculateResult(inputResult.enterResult());
				break;
			case 8:
				System.out.println("You have selected Deca Discus Throw, input your result in meter");
				discusThrow.calculateResult(inputResult.enterResult());
				break;
			case 9:
				System.out.println("You have selected Deca Javelin Throw, input your result in meter");
				decaJavelinThrow.calculateResult(inputResult.enterResult());
				break;
			case 10:
				System.out.println("You have selected Deca Shot Put, input your result in meter");
				decaShotPut.calculateResult(inputResult.enterResult());
				break;
			default:
				System.out.println("Invalid input, try again.");
				System.out.println("");
				inputSelection();
				break;
		}
		excelMaker.excelMaker();

	}

	// Needs more stuff.
	public void printDisciplinesHeptathlon() {
		System.out.println("1. Heptathlon 200 meters.");
		System.out.println("2. Heptathlon 800 meters.");
		System.out.println("3. Heptathlon 100 meters hurdles.");
		System.out.println("4. Heptathlon High Jump.");
		System.out.println("5. Heptathlon Long Jump.");
		System.out.println("6. Heptathlon Shot Put.");
		System.out.println("7. Heptathlon Javelin Throw.");

	}

	public void printDisciplinesDecathlon() {

		System.out.println("1. Decathlon 100 meters.");
		System.out.println("2. Decathlon 400 meters.");
		System.out.println("3. Decathlon 110 meters hurdles.");
		System.out.println("4. Decathlon 1500 meters.");
		System.out.println("5. Decathlon Long Jump.");
		System.out.println("6. Decathlon High Jump.");
		System.out.println("7. Decathlon Pole Vault.");
		System.out.println("8. Decathlon Discus Throw.");
		System.out.println("9. Decathlon Javelin Throw.");
		System.out.println("10. Decathlon Shot Put.");
	}


}