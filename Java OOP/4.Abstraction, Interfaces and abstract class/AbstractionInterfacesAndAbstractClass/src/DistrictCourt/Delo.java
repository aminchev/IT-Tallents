package DistrictCourt;

public abstract class Delo {
	private Sadiq sadiq;
	private SudebenZasedatel[] sudebniZasedateli;
	private Obvinqem obvinqem;
	private Obvinitel obvinitel;
	private Svidetel[] svideteli;
	
	
	public Delo(Sadiq sadiq, SudebenZasedatel[] sudebeniZasedateli,
			Obvinqem obvinqem, Obvinitel obvinitel, Svidetel[] svideteli) {
		setSadiq(sadiq);
		setSudebniZasedateli(sudebeniZasedateli);
		setObvinqem(obvinqem);
		setObvinitel(obvinitel);
		setSvideteli(svideteli);
	}
	
	abstract void provedi();
	
	public void encreaseNumberOfDela(){
		this.getSadiq().setBrojDela(this.getSadiq().getBrojDela()+1);
	}
	
	public void askSvideli(){
		int j = 0;
		while(this.getObvinqem().getAdvokati()[j] != null){
			int z = 0;
			while(this.getSvideteli()[z] != null){
				for(int i = 0; i<5; i++){
					this.getObvinqem().getAdvokati()[j].askQuestionToCitizens(this.getSvideteli()[z]);
				}
				z++;
			}
			j++;
		}
	}
	
	boolean isGuilt(){
		int countForGuilty=0;
		int countForGuiltLess = 0;
		int j = 0;
		while(this.getSudebniZasedateli()[j] != null){
			double x = Math.random();
				if(x<0.5){
					countForGuilty++;
				}
				else{
					countForGuiltLess++;
				}
				j++;
		}
		if(countForGuilty>countForGuiltLess){
			return true;
		}
		else{
			return false;
		}
	}
	
	int prisuda(){
		if(this.isGuilt() == true){
			double x = Math.random();
			if(x<0.3){
				return 3;
			}
			if(x>=0.3 && x<0.6){
				return 20;
			}
			else{
				return 40;
			}
		}
		else{
			return 0;
		}
	}


	public Sadiq getSadiq() {
		return this.sadiq;
	}
	public void setSadiq(Sadiq sadiq) {
		if(sadiq != null){
			this.sadiq = sadiq;
		}
	}


	public SudebenZasedatel[] getSudebniZasedateli() {
		return this.sudebniZasedateli;
	}
	public void setSudebniZasedateli(SudebenZasedatel[] sudebniZasedateli) {
		if(sudebniZasedateli != null){
			this.sudebniZasedateli = sudebniZasedateli;
		}
	}


	public Obvinqem getObvinqem() {
		return this.obvinqem;
	}
	public void setObvinqem(Obvinqem obvinqem) {
		if(obvinqem != null){
			this.obvinqem = obvinqem;
		}
	}


	public Obvinitel getObvinitel() {
		return this.obvinitel;
	}
	public void setObvinitel(Obvinitel obvinitel) {
		if(obvinitel != null){
			this.obvinitel = obvinitel;
		}
	}


	public Svidetel[] getSvideteli() {
		return this.svideteli;
	}
	public void setSvideteli(Svidetel[] svideteli) {
		if(svideteli != null){
			this.svideteli = svideteli;
		}
	}
}
