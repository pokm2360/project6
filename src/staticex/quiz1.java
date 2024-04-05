package staticex;

public class quiz1 {

	public static void main(String[] args) {
		Card card1 = new Card();
		System.out.println("카드1번: " + card1.cardNo); 
		Card card2 = new Card();
		System.out.println("카드2번: " + card2.cardNo); 
		Card card3 = new Card();
		System.out.println("카드3번: " + card3.cardNo); 
	}

}

class Card {
	static int count = 100;
	int cardNo;
	
	public Card () {
		count++;
		cardNo = count;
	}
	
	
}