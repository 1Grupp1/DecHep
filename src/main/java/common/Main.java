package common;

import decathlon.*;



public class Main {

	public static void main(String[] args) {

		boolean isRunning = true;


		SelectDiscipline selectDiscipline = new SelectDiscipline();
		SelectDiscipline.decOrHep();

		while (isRunning) {
			SelectDiscipline.runKeyValueApp();


			selectDiscipline.inputSelection();


		}
		isRunning = false;
	}
}
