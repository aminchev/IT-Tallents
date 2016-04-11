package BankTask;

import java.util.List;

public class Bank {
	private static final double KOEFICIENT_FOR_BANK_REZERV = 0.1;
	private String name;
	private String address;
	private double moneyInBank;
	private List<BankProduct> bankProducts;
	private double bankRezerv;
	
	
	public Bank(String name, double moneyInBank) {
		this.name = name;
		this.setMoneyInBank(moneyInBank);
	}

	void setListWithBankProducts(List<BankProduct> list){
		this.bankProducts = list;
	}
	
	void addDeposit(Deposit deposit){
		this.bankProducts.add(deposit);
	}
	
	void addCredit(Credit credit){
		this.bankProducts.add(credit);
	}
	
	void payLihvaForAllDeposits(){
		for(int i = 0; i<bankProducts.size(); i++){
			if(bankProducts.get(i) instanceof Deposit){
				Deposit temp = ((Deposit)(this.bankProducts.get(i)));
				temp.setNalichnost(temp.getNalichnost()+temp.getNalichnost()*temp.getYearPercent());
			}
		}
	}
	
	
	public double getMoneyInBank() {
		return moneyInBank;
	}

	public void setMoneyInBank(double moneyInBank) {
		if(moneyInBank>0){
			this.moneyInBank = moneyInBank;
		}
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getBankRezerv() {
		return bankRezerv;
	}

	public void setBankRezerv(double bankRezerv) {
		double sumInDeposits = 0;
		if(bankRezerv>0){
			for(int product = 0; product<bankProducts.size(); product++){
				if(bankProducts.get(product) instanceof Deposit){
					sumInDeposits = sumInDeposits+ ((Deposit)(bankProducts.get(product))).getNalichnost();
				}
			}
			if(bankRezerv>= sumInDeposits*KOEFICIENT_FOR_BANK_REZERV){
				this.bankRezerv = bankRezerv;
			}
		}
	}
	
	
	
}
