package ex1_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		
		//자바에서 프로그램이 실행되는 도중 예외(에러)가 발생하면 그 시점에서 프로그램이 
		//강제로 종료된다. 이것은 올바른 판단이지만, 때로는 예상가능한 오류가 있거나
		//오류 발생시 이를 무시하고 이후의 작업을 진행해야 하는 경우가 있다.
		//예외처리를 통해 프로그램의 비정상적인 종료를 줄여보자!!!
		
		//try{
		//	오류코드
		//}catch(Exception e){
		//	try에서 오류코드가 발견되면 호출되는 영역
		//}
		
		int result = 0;
		char[] arr = new char[3];
		
		try {
			result = 10 / 0;
			arr[2] = 'A';
			
		}catch(Exception e) {
			//try영역에서 오류가 발생하면 catch영역으로 이동하여
			//코드를 수행한 뒤 빠져나간다
			//System.out.println("에러발생");
			e.printStackTrace();
		}
		
		System.out.println(result);
		
	}//main
}


























