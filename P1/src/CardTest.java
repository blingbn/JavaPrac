class Card { 
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}






public class CardTest {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("C1은 "+c1.kind + " "+c1.number+ " " +"크기는 "+c1.width + "높이는 " + c1.height);
		System.out.println("C2는 "+c2.kind + " "+c2.number+ " " +"크기는 "+c2.width + "높이는 " + c2.height);
		
		c1.width = 80;
		c1.height = 100;
		
		System.out.println(c2.width);

		System.out.println(c2.height); // width와 height는 class변수이므로 어느 한곳에서 바꿔도 주소가 같기때문에 다 바
		
		
	}

}
