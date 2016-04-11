package BankTask;

public abstract class BankProduct {
	private static final int MAX_PERIOD_FOR_BANK_PRODUCT = 60;
	private static final int MIN_PERIOD_FOR_BANK_PRODUCT = 1;
	private String nameProduct;
	private double yearPercent;
	private int period;
	
	public BankProduct(double yearPercent, int period) {
		this.yearPercent = yearPercent;
		this.setPeriod(period);
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public double getYearPercent() {
		return yearPercent;
	}

	public int getPeriod() {
		return period;
	}

	private void setPeriod(int period) {
		if(period>=MIN_PERIOD_FOR_BANK_PRODUCT && period<=MAX_PERIOD_FOR_BANK_PRODUCT){
			this.period = period;
		}
	}

	public void setNameProduct(String nameProduct) {
		if(nameProduct!= null){
			this.nameProduct = nameProduct;
		}
	}

	@Override
	public String toString() {
		return "BankProduct [nameProduct=" + nameProduct + ", yearPercent=" + yearPercent + ", period=" + period + "]";
	}
	
}
