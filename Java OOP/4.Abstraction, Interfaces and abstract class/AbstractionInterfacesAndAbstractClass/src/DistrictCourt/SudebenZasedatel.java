package DistrictCourt;

public class SudebenZasedatel extends Jurist {

	public SudebenZasedatel(String nameJurist, Dlujnost dlujnost, int staj, int brojDela) {
		super(nameJurist, dlujnost, staj, brojDela);
		
	}

	@Override
	void askQuestionToCitizens(Grajdanin grajdanin) {
		if(grajdanin instanceof Obvinitel)
		System.out.println("Sudeben zasedatel ask question!");
		
	}

	@Override
	void makeNotesWithAnswers() {
		System.out.println("Sudeben zasedatel make notes!");
		
	}

}
