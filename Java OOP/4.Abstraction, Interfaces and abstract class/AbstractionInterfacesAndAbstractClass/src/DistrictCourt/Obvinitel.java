package DistrictCourt;

public class Obvinitel extends Grajdanin {

	private Advokat[] advokati;
	

	public Obvinitel(String fullname, String addresGrajdanin, int age) {
		super(fullname, addresGrajdanin, age);
		
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
