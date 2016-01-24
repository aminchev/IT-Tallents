package DistrictCourt;

public class Obvinqem extends Grajdanin {

	private Advokat[] advokati;
	
	public Obvinqem(String fullname, String addresGrajdanin, int age, Advokat[] advokati) {
		super(fullname, addresGrajdanin, age);
		setAdvokati(advokati);
	}

	
	
	public Advokat[] getAdvokati() {
		return this.advokati;
	}

	public void setAdvokati(Advokat[] advokati) {
		if(advokati != null){
			this.advokati = advokati;
		}
	}

}
