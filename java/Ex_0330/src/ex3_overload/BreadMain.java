package ex3_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		//빵을 만들었습니다   <----- method 1을 호출해서 나온 결과
		//------------------
		
		//빵을 만들었습니다 <----- method 2를 호출해서 나온 결과
		//빵을 만들었습니다
		//요청하신 2개의 빵을 만들었습니다
		//------------------
		
		//크림빵을 만들었습니다  <---- method 3을 호출해서 나온 결과
		//크림빵을 만들었습니다
		//요청하신 2개의 크림빵을 만들었습니다
		Bread bread = new Bread();
		bread.makeBread();
		
		System.out.println("-------------");
		
		bread.makeBread(3);
		
		System.out.println("--------------");
		
		bread.makeBread(2, "피자빵");
	}//main
}










