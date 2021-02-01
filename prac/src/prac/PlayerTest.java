package prac;

abstract class Player{ // 추상클래스
	abstract void play(int pos); // 추상메서드
	abstract void stop();//추상메서드

}

//추상클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 play합니다.");}
	void stop() {System.out.println("재생을 멈춥니다.");}
}



public class PlayerTest {

	public static void main(String[] args) {
		//Player p = new Player();//추상클래스의 객체를 생성 할 수 없음
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}

}
