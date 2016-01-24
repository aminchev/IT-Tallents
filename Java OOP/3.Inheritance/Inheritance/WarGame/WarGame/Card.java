package WarGame;

public class Card {
	private String cardPower;
	private String cardSuit;
	
	//getter for cardPower
	String getCardPower(){
		return this.cardPower;
	}
	//setter for cardPower
	void setCardPower(String cardPower){
		if(cardPower != null && !cardPower.equals("")){
			this.cardPower = cardPower;
		}
	}
	
	//getter for cardSuit
	String getCardSuit(){
		return this.cardSuit;
	}
	//setter for cardSuit
	void setCardSuit(String cardSuit){
		if(cardSuit != null && (cardSuit.equals("Clubs") || cardSuit.equals("Diamonds") ||
				cardSuit.equals("Hearts") || cardSuit.equals("Spades"))){
			this.cardSuit = cardSuit;
		}
	}
	
	Card(String cardPower, String cardSuit){
		setCardPower(cardPower);
		setCardSuit(cardSuit);
	}
	
	int powerOfCardWithValue(Card card){
		int power = 0;
		switch(card.getCardPower()){
		case "2":
			power = 1;
			return power;
		case "3":
			power = 2;
			return power;
		case "4":
			power = 3;
			return power;
		case "5":
			power = 4;
			return power;
		case "6":
			power = 5;
			return power;
		case "7":
			power = 6;
			return power;
		case "8":
			power = 7;
			return power;
		case "9":
			power = 8;
			return power;
		case "10":
			power = 9;
			return power;
		case "J":
			power = 10;
			return power;
		case "Q":
			power = 11;
			return power;
		case "K":
			power = 12;
			return power;
		case "A":
			power = 13;
			return power;
		}
		return power;
	}
	
}
