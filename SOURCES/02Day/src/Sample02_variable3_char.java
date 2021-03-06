
public class Sample02_variable3_char {

	public static void main(String[] args) {
		
		
		char c = 'A'; //문자타입을 선언과 동시에 초기화 후 사용
		char c2 = '홍';
		char c3 = '\uD64D';
		System.out.println(c+" "+c2+" "+c3);
		
		
		//escape문자
		System.out.println("aaa\tbbb"); //tab 기능 4칸 띄어쓰기
		System.out.println("aaa\nbbb"); //계행 다음줄
		System.out.println("aaa\'bbb"); // 작은따옴표 '
		System.out.println("aaa\"bbb"); // 큰따옴표 "
		System.out.println("aaa\\bbb"); // \역슬래쉬
		
		System.out.println(c+"\t"+c2); //중간에 탭 들어감
		
		
		
		System.out.println(); //빨리 치려면 sysou + ctrl + spacebar
		
		
		
		
	}

}
