package DistrictCourt;

public class NakazateknoDelo extends Delo {

	private final SudebenZasedatel[] sudebeniZasedateli = new SudebenZasedatel[13];
	
	public NakazateknoDelo(Sadiq sadiq, SudebenZasedatel[] sudebeniZasedateli, Obvinqem obvinqem, Obvinitel obvinitel,
			Svidetel[] svideteli) {
		super(sadiq, sudebeniZasedateli, obvinqem, obvinitel, svideteli);
		
	}

	@Override
	void provedi() {
		this.encreaseNumberOfDela();
		
		
		
		
		this.askSvideli();
		boolean isGuilt = this.isGuilt();
		int zatvor = this.prisuda();
	}

}
