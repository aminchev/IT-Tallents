package WarGame;

public class Teste {
	static final Card[] cards = new Card[52]; 
//	static{
//		cards = new Card[52];  �������� ���������������� ���� - �� �� �� ������ �� �� �� ������
//	}						   �������� �� ������ cards	
//	Teste(Card[] cards){
//		this.cards = cards;
//	}

	 static final void fillTeste(){
		int index = 0;
		for(int i = 1; i<=13; i++){
			for(int j = 1; j<=4; j++){
				String cardPower = "";
				String cardSuit = "";
				switch(i){
				case 1:
					cardPower="2";
					break;
				case 2:
					cardPower="3";
					break;
				case 3:
					cardPower="4";
					break;
				case 4:
					cardPower="5";
					break;
				case 5:
					cardPower="6";
					break;
				case 6:
					cardPower="7";
					break;
				case 7:
					cardPower="8";
					break;
				case 8:
					cardPower="9";
					break;
				case 9:
					cardPower="10";
					break;
				case 10:
					cardPower="J";
					break;
				case 11:
					cardPower="Q";
					break;
				case 12:
					cardPower="K";
					break;
				case 13:
					cardPower="A";
					break;
				}
				switch(j){
				case 1:
					cardSuit = "Clubs";
					break;
				case 2:
					cardSuit = "Diamonds";
					break;
				case 3:
					cardSuit = "Hearts";
					break;
				case 4:
					cardSuit = "Spades";
					break;
				}
				cards[index] = new Card(cardPower, cardSuit);
				index++;
			}
		}
	}
	
	static void shuffleTeste(){
		for(int i = 1; i<500; i++){
			int indexOfFirstCard = (int) (Math.random() * 52);
			int indexOfSecondCard = (int) (Math.random() * 52);
			Card temp = cards[indexOfFirstCard];
			cards[indexOfFirstCard] = cards[indexOfSecondCard];
			cards[indexOfSecondCard] = temp;
		}
	}
	
	Card[] makeHalfTeste(int start, int end){
		Card[] halfTeste = new Card[end-start];
		int counter = 0;
		for(int i = start; i<end; i++){
			halfTeste[counter] = cards[i];
			counter++;
		}
		return halfTeste;
	}
	
	
}
