package PartShop;

import java.util.Calendar;

public  class Automobil {
	private String marka;
	private String model;
	private int yearOfManifacture;
	
	
	public Automobil(String marka, String model, int yearOfManifacture) {
		setMarka(marka);
		setModel(model);
		setYearOfManifacture(yearOfManifacture);
	}
	
	
	
	public String getMarka() {
		return this.marka;
	}
	public void setMarka(String marka) {
		if(marka != null && !marka.equals("")){
			this.marka = marka;
		}
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		if(model != null && !model.equals("")){
			this.model = model;
		}
	}
	public int getYearOfManifacture() {
		return this.yearOfManifacture;
	}
	public void setYearOfManifacture(int yearOfManifacture) {
		if(yearOfManifacture>1900 && yearOfManifacture<Calendar.getInstance().get(Calendar.YEAR));
		this.yearOfManifacture = yearOfManifacture;
	}
	
}
