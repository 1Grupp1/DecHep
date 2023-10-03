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
		try{
		if (hepDecBoolean) {
			System.out.println("Please choose which contest you want to check your score against, Heptathlon or Decathlon:");
			System.out.println();
			System.out.println("Press 1 for: Heptathlon");
			System.out.println("Press 2 for: Decathlon");

			decOrHep = Integer.parseInt(sc.nextLine());
		}


				if (decOrHep == 1 || decOrHep == 2) {

					hepDecBoolean = false;
					// break;
				}
				else {System.out.println("Invalid input, try again.");
					System.out.println("");
					decOrHep();

				}


			}catch(Exception e){
				System.out.println("Invalid input, try again.");
				System.out.println("");
				decOrHep();

			}
		}


	public void inputSelection() {
		System.out.println();
		System.out.println("Select discipline:");
		System.out.println();


		try {


			if (decOrHep == 1) {
				System.out.println("   *Heptathlon*");
				System.out.println();
				printDisciplinesHeptathlon();

				discipline = Integer.parseInt(sc.nextLine());

				disciplineSelected = discipline;
				chosenDisciplineHeptathlon();
				makeSelection();
			}
			if (decOrHep == 2) {
				System.out.println("   *Decathlon*");
				System.out.println();
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

		  System.out.println(decHep);

	}

	public static void chosenDisciplineDecathlon2() {
		String[] decHep2 = {"Deca 100M", "Deca 400M", "Deca 110M Hurdles", "Deca 1500M", "Deca Long Jump", "Dec High Jump", "Dec Pole Vault"
				, "Dec Discus Throw", "Deca Javelin Throw", "Deca Shot Put"};
		decHep = decHep2[discipline - 1];

		 System.out.println(decHep);

	}


	// Check input of discipline.
	public void makeSelection() {


		switch (disciplineSelected) {
			case 1:
				System.out.println("You have selected Heptathlon 200M, input your result in seconds.");
				System.out.println("Valid results is between 18 sek and 42.08 sek.");
				hep200M.calculateResult(inputResult.enterResult());
				break;
			case 2:
				System.out.println("You have selected Heptathlon 800M, input your result in seconds.");
				System.out.println("Valid results is between 100 sek and 250.79 sek.");
				hep800M.calculateResult(inputResult.enterResult());
				break;
			case 3:
				System.out.println("You have selected Heptathlon 100M Hurdles, input your result in seconds.");
				System.out.println("Valid results is between 11 sek and 26.4 sek.");
				hep100MHurdles.calculateResult(inputResult.enterResult());
				break;
			case 4:
				System.out.println("You have selected Heptathlon High Jump, input your result in centimeter.");
				System.out.println("Valid results is between 75.7 cm and 260 cm.");
				hepHighJump.calculateResult(inputResult.enterResult());
				break;
			case 5:
				System.out.println("You have selected Heptathlon Long Jump, input your result in centimeter.");
				System.out.println("Valid results is between 214 cm and 1000 cm.");
				hepLongJump.calculateResult(inputResult.enterResult());
				break;
			case 6:
				System.out.println("You have selected Heptathlon Shot Put, input your result in meter.");
				System.out.println("Valid results is between 1.53 m and 25 m.");
				hepShotPut.calculateResult(inputResult.enterResult());
				break;
			case 7:
				System.out.println("You have selected Heptathlon Javelin Throw, input your result in meter.");
				System.out.println("Valid results is between 3.9 m and 90 m.");
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
				System.out.println("You have selected Decathlon 100M, input your result in seconds.");
				System.out.println("Valid results is between 9 sek and 17.8 sek.");
				deca100M.calculateResult(inputResult.enterResult());
				break;
			case 2:
				System.out.println("You have selected Decathlon 400M, input your result in seconds.");
				System.out.println("Valid results is between 42.5 sek and 81 sek.");
				deca400M.calculateResult(inputResult.enterResult());
				break;
			case 3:
				System.out.println("You have selected Decathlon 110M Hurdles, input your result in seconds.");
				System.out.println("Valid results is between 12 sek and 28 sek.");
				deca110MHurdles.calculateResult(inputResult.enterResult());
				break;
			case 4:
				System.out.println("You have selected Decathlon 1500M, input your result in seconds.");
				System.out.println("Valid results is between 180 sek and 474 sek.");
				deca1500M.calculateResult(inputResult.enterResult());
				break;
			case 5:
				System.out.println("You have selected Decathlon Long Jump, input your result in centimeter.");
				System.out.println("Valid results is between 225 cm and 1000 cm.");
				decaLongJump.calculateResult(inputResult.enterResult());
				break;
			case 6:
				System.out.println("You have selected Decathlon High Jump, input your result in centimeter.");
				System.out.println("Valid results is between 76.2 cm and 260 cm.");
				highJump.calculateResult(inputResult.enterResult());
				break;
			case 7:
				System.out.println("You have selected Decathlon Pole Vault, input your result in centimeter.");
				System.out.println("Valid results is between 103 cm and 700 cm.");
				poleVault.calculateResult(inputResult.enterResult());
				break;
			case 8:
				System.out.println("You have selected Decathlon Discus Throw, input your result in meter.");
				System.out.println("Valid results is between 4.1 m and 85 m.");
				discusThrow.calculateResult(inputResult.enterResult());
				break;
			case 9:
				System.out.println("You have selected Decathlon Javelin Throw, input your result in meter.");
				System.out.println("Valid results is between 7.2 m and 90 m.");
				decaJavelinThrow.calculateResult(inputResult.enterResult());
				break;
			case 10:
				System.out.println("You have selected Decathlon Shot Put, input your result in meter.");
				System.out.println("Valid results is between 1.53 m and 25 m.");
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


	public void printDisciplinesHeptathlon() {
		System.out.println("1. 200 meters");
		System.out.println("2. 800 meters");
		System.out.println("3. 100 meters hurdles");
		System.out.println("4. High Jump");
		System.out.println("5. Long Jump");
		System.out.println("6. Shot Put");
		System.out.println("7. Javelin Throw");

	}

	public void printDisciplinesDecathlon() {

		System.out.println("1. 100 meters");
		System.out.println("2. 400 meters");
		System.out.println("3. 110 meters hurdles");
		System.out.println("4. 1500 meters");
		System.out.println("5. Long Jump");
		System.out.println("6. High Jump");
		System.out.println("7. Pole Vault");
		System.out.println("8. Discus Throw");
		System.out.println("9. Javelin Throw");
		System.out.println("10 Shot Put");
	}


}
