package DistrictCourt;

public class Advokat extends Jurist{

	public Advokat(String nameJurist, Dlujnost dlujnost, int staj, int brojDela) {
		super(nameJurist, dlujnost, staj, brojDela);
		
	}

	@Override
	void askQuestionToCitizens(Grajdanin grajanin) {
		System.out.println("Advokat ask question!");
		
	}

	@Override
	void makeNotesWithAnswers() {
		System.out.println("Advokat make notes!");
		
	}

}
