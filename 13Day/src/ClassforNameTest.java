import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassforNameTest {

	public static void main(String[] args)throws Exception {
		
		Class<?> c = Class.forName("java.lang.String");
		//메타데이터==> 리플렉션(reflection)
		Field[] fields = c.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("field:"+f.getName());
		}
		Method[] methods=c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("method:"+m.getName());
		}
		
		
	}

}
