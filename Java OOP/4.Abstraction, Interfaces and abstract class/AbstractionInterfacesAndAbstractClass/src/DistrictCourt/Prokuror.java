package DistrictCourt;

public class Prokuror extends Jurist {

	public Prokuror(String nameJurist, Dlujnost dlujnost, int staj, int brojDela) {
		super(nameJurist, dlujnost, staj, brojDela);
		
	}

	@Override
	void askQuestionToCitizens(Grajdanin grajdanin) {
		System.out.println("Prokuror ask question!" );
		
	}

	@Override
	void makeNotesWithAnswers() {
		System.out.println("Prokuror make notes!");
		
	}

}
