import java.awt.Color;

public class Ex04_7 {

	public enum Color{ RED, BLUE, GREEN }
	
	public static void main(String[] args) {
		// enum을 이용한 switch문
		
		Color c = Color.GREEN;
		
		switch(c){
		case RED : System.out.println("RED"); break;
		case BLUE : System.out.println("BLUE"); break;
		case GREEN : System.out.println("GREEN"); break;
		default : System.out.println("default"); break;
		}//end switch
		

	}

}
