
public class Ex10_1 {

	public static void main(String[] args) {


		//이름만 저장하는 것으로 제한됨
		Object[] arr = {"홍길동","이순신","유관순",100};
		for(Object obj : arr) {
			if(obj instanceof String) {
				String name=(String)obj;
			}System.out.println(name);
		}
			/*
			String name = (String)obj; //형변환해서 자식사용
			//100은 string으로 형변환에 안맞음
			System.out.println("이름 : " + name);
			*/
		}
	}

