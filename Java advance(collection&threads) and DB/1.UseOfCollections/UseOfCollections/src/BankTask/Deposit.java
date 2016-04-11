package BankTask;

public class Deposit extends BankProduct {

	private double mounthIzplatenaSuma;
	private double nalichnost;
	
	public Deposit(double yearPercent, int period) {
		super(yearPercent, period);
	
	}

	public double getMounthIzplatenaSuma() {
		return mounthIzplatenaSuma;
	}

	public void setMounthIzplatenaSuma(double mounthIzplatenaSuma) {
		if(mounthIzplatenaSuma>0){
			this.mounthIzplatenaSuma = mounthIzplatenaSuma;
		}
	}

	public double getNalichnost() {
		return nalichnost;
	}

	public void setNalichnost(double nalichnost) {
		if(nalichnost>0){
			this.nalichnost = nalichnost;
		}
	}

}
