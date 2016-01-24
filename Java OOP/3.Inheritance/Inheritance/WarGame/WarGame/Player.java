package WarGame;

public class Player {
	private String name;
	Card[] cards = new Card[26]; //трябва да е private и да се извиква със setter
	
	//getter for name
	String getName(){
		return this.name;
	}
	//setter for name
	void setName(String name){
		if(name != null && !name.equals("")){
			this.name = name;
		}
	}
	
	//getter for cards
	Card[] getCards(){
		return this.cards;
	}
	//setter for cards
	void setCards(Card[] cards){
		if(cards.length>0){
			this.cards = cards;
		}
		
	}
	
	Player(String name, Card[] cards){
		setName(name);
		this.cards = cards;
	}
}
