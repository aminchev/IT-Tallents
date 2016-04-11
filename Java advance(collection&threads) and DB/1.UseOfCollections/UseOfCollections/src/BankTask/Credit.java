package BankTask;

public class Credit extends BankProduct {
	
	private double mounthVnoska;
	private double nalichnost;
	

	public Credit(double yearPercent, int period) {
		super(yearPercent, period);
		
	}


	public double getMounthVnoska() {
		return mounthVnoska;
	}


	public void setMounthVnoska(double mounthVnoska) {
		if(mounthVnoska>0){
			this.mounthVnoska = mounthVnoska;
		}
	}


	public double getNalichnost() {
		return nalichnost;
	}


	public void setNalichnost(double nalichnost) {
		this.nalichnost = nalichnost;
	}

}
