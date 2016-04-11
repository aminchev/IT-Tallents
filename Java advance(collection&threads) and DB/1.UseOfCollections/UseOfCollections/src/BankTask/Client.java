package BankTask;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private String address;
	private double cashMoney;
	private double salary;
	private List<Deposit> deposits;
	private List<Credit> credits;
	private Bank bank;
	
	public Client(String name, double cashMoney, double salary) {
		this.name = name;
		this.cashMoney = cashMoney;
		this.salary = salary;
	}
	
	
	
	void makeDeposit(double money, Deposit deposit){
		if(this.getCashMoney()>0 && this.getCashMoney()>=money && deposit!= null ){
			if(this.deposits == null){
				this.deposits = new ArrayList<Deposit>();
			}
			this.setCashMoney(this.getCashMoney()-money);
			this.getBank().setMoneyInBank(this.getBank().getMoneyInBank() + money);
			this.getBank().setBankRezerv(this.getBank().getBankRezerv()+money*0.9);
			this.deposits.add(deposit);
			this.bank.addDeposit(deposit);
			
		}	
	}
	
	void getCredit(double money, Credit credit){
		double sumOfMounthVnoski = 0;
		if(this.credits == null){
			this.credits = new ArrayList<Credit>();
		}
		for(int i = 0; i<this.credits.size(); i++){
			sumOfMounthVnoski = sumOfMounthVnoski+this.credits.get(i).getMounthVnoska();
		}
		if(sumOfMounthVnoski<=this.getSalary()*0.5){
			if(this.getBank().getMoneyInBank()-money > this.getBank().getBankRezerv()){
				this.setCashMoney(this.getCashMoney()+money);
				this.getBank().setMoneyInBank(this.getBank().getMoneyInBank()-money);
				this.credits.add(credit);
				this.bank.addCredit(credit);
			}
		}
	}

	void payCreditsPayment(){
		for(int i = 0; i<credits.size(); i++){
			credits.get(i).setNalichnost(credits.get(i).getNalichnost() - credits.get(i).getMounthVnoska());
			this.setCashMoney(this.getCashMoney() - credits.get(i).getMounthVnoska());
			this.getBank().setMoneyInBank(this.getBank().getMoneyInBank()+ credits.get(i).getMounthVnoska());
		}
	}
	
	public double getCashMoney() {
		return cashMoney;
	}

	public void setCashMoney(double cashMoney) {
		if(cashMoney>0){
			this.cashMoney = cashMoney;
		}
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		if(bank != null){
			this.bank = bank;
		}
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + ", cashMoney=" + cashMoney + ", salary=" + salary
				+ ", deposits=" + deposits + ", credits=" + credits + ", bank=" + bank + "]";
	} 
	
	
	
	
}
