
import java.util.Calendar;
import java.util.Random;

import com.xxx.Student;

public class TestStuent {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.name);
		Random r = new Random();
		
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH)+1; //month는 +1 해야함
		System.out.println(month);
	}

}
