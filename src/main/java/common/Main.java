package common;

import decathlon.*;

public class Main {

	public static void main(String[] args) {
		boolean choice = true;
		while (choice) {
			SelectDiscipline selectDiscipline = new SelectDiscipline();
			SelectDiscipline.decOrHep();

			InputName inputName = new InputName();
			inputName.addCompetitor();


			selectDiscipline.inputSelection();

		}
		choice = false;
	}
}
