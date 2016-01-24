package DistrictCourt;

public class RayonenSud {
	private String nameDistrict;
	private String addresDistrict;
	private Jurist[] jurists; 
	private Delo[] delo;
	
	public RayonenSud(String nameDistrict, String addresDistrict, Jurist[] jurists, Delo[] delo){
		setNameDistrict(nameDistrict);
		setAddresDistrict(addresDistrict);
		setJurists(jurists);
		setDelo(delo);
	}
	
	
	public String getNameDistrict() {
		return this.nameDistrict;
	}
	public void setNameDistrict(String nameDistrict) {
		if(nameDistrict != null && !nameDistrict.equals("")){
			this.nameDistrict = nameDistrict;
		}
	}
	
	public String getAddresDistrict() {
		return this.addresDistrict;
	}
	public void setAddresDistrict(String addresDistrict) {
		if(addresDistrict != null && !addresDistrict.equals("")){
			this.addresDistrict = addresDistrict;
		}
	}
	
	public Jurist[] getJurists() {
		return this.jurists;
	}
	public void setJurists(Jurist[] jurists) {
		if(jurists != null){
			this.jurists = jurists;
		}
	}
	
	public Delo[] getDelo() {
		return this.delo;
	}
	public void setDelo(Delo[] lawsuits) {
		if(lawsuits != null){
			this.delo = delo;
		}
	}
	
	
}
