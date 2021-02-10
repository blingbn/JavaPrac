import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) {
		
		OracleService service = new OracleService(); //1.
		//서비스의 역할 : 드라이버로딩, 커넥션, 끊기
		
		/*
		Dept xx = new Dept(99, "영업", "서울");
		int num = service.insert(xx);
		System.out.println(num);
		*/
		/*
		service.delete(99);
		try {
			ArrayList<Dept> list = service.select();
			for(Dept dept : list) {
				System.out.println(dept);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		//update
		Dept xx2 = new Dept(13, "재경", "부산");
		try {
			service.update(xx2);
		}catch (RecordNotFoundException e1) { //num이 0일때 발생시켜야함.
			e1.printStackTrace();
		}
		
		
		
		
		/*
		try {// 역할 : dpet테이블의 전체 레코들을 메인으로 리턴하는 함수
			ArrayList<Dept> list = service.select();
			for(Dept dept : list) {
				System.out.println(dept);
			}
			System.out.println("====================");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		*/
		
	}

}
