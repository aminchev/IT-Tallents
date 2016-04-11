package BankTask;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Deposit shortDeposit = new Deposit(3, 3);
		shortDeposit.setNameProduct("Short Deposit");
		
		Deposit longDeposit = new Deposit(5, 12);
		longDeposit.setNameProduct("Long Deposit");
		
		Credit homeCredit = new Credit(6, 6);
		homeCredit.setNameProduct("Home Credir");
		
		Credit consumerCredit = new Credit(10, 12);
		consumerCredit.setNameProduct("Consumer Credit");
		
		Bank ourBank = new Bank("BNB", 1000000);
		List<BankProduct> bankList = new ArrayList<>(10);
		
		ourBank.setListWithBankProducts(bankList);
		

		Client ivan = new Client("Ivan", 4371, 2000);
		Client georgi = new Client("Georgi", 2000, 3000);
		Client spas = new Client("Spas", 3200, 1000);
		Client dean = new Client("Dean", 5342, 3000);
		Client ani = new Client("Ani", 400, 1241);
		Client katq = new Client("Katq", 3323, 2312);
		Client ceco = new Client("Ceco", 400, 2420);
		Client misho = new Client("Misho", 5000, 3000);
		Client mitko = new Client("Mitko", 4000, 2090);
		Client dido = new Client("Dido", 1400, 2500);
		
		Client[] array = {ivan, georgi, spas, dean, ani, katq, ceco, misho, mitko, dido};
		for(Client curClient: array){
			curClient.setBank(ourBank);
			double percent = (Math.random()*(1-0.8)) + 0.8;
			if(percent<0.9){
				curClient.makeDeposit(curClient.getCashMoney()*percent, shortDeposit);
			}
			if(percent>=0.9){
				curClient.makeDeposit(curClient.getCashMoney()*percent, longDeposit);
			}
			
			// Credit getting on random
			double random = Math.random();
			if(random<0.5){
				curClient.getCredit(3000, homeCredit);
			}
			if(random>=0.5){
				curClient.getCredit(400, consumerCredit);
			}
		}
		
		System.out.println("Money is bank:"+ourBank.getMoneyInBank());
		System.out.println("Bank rezerv:" + ourBank.getBankRezerv());
		
		for(Client curClient: array){
//			System.out.println(curClient.getName());
//			System.out.println(curClient.getCashMoney());
			System.out.println(curClient);
			
		}
		
		for(BankProduct product: bankList){
//			System.out.println(product.getClass().getName());
//			System.out.println(product.getNameProduct());
//			System.out.println(product.getYearPercent());
			System.out.println(product);
		}
	}
}
