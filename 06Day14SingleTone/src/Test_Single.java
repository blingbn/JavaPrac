import com.bank.Bank;

public class Test_Single {

	public static void main(String[] args) {
		Bank bank = Bank.getBank(); //싱글톤 객체 얻기
		System.out.println(bank);
		
		Bank bank1 = Bank.getBank();//싱글톤 객체 얻기
		System.out.println(bank1);
		
		bank.setName("국민은행");
		System.out.println(bank1.getName());
		
		Bank bank2 = Bank.getBank();//싱글톤 객체 얻기
		System.out.println(bank2.getName());
	}

}
