package DistrictCourt;

public class Sadiq extends Jurist {

	
	
	
	public Sadiq(String nameJurist, Dlujnost dlujnost, int staj, int brojDela) {
			super(nameJurist, dlujnost, staj, brojDela);
	
	}
	

	
	@Override
	void askQuestionToCitizens(Grajdanin grajdanin) {
		System.out.println("Sudia ask question!");
		
	}

	@Override
	void makeNotesWithAnswers() {
		System.out.println("Sudia make notes!");
		
	}
	
}