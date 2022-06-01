package ex1_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("신촌", "02-111-1111");
		Bank b2 = new Bank("홍대", "02-222-2222");
		Bank b3 = new Bank("서강대", "02-333-3333");
		
		//static변수나 메서드는 
		//객체생성 없이도 언제든 가져다가 사용 할 수 있다.
		Bank.interest = 0.1f;
		
		b1.wooriBank();
		b2.wooriBank();
		b3.wooriBank();
		
	}//main
}
