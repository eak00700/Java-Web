package ex2_collection;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//컬렉션(collection) : java.util패키지의 인터페이스
		//배열의 단점을 보완하여 index갯수가 정해져 있지 않은 다수의 객체를
		//다루기 위해 사용하는 프로그래밍 방식
		
		//Set, Map, List
		//HashSet< 제너릭타입 > : 제너릭 타입 - 앞으로 현재 Set객체에서 관리하고자 하는
		//자료형의 타입을 미리 지정해두는 구조. 반드시 클래스 형태로만 기입 가능
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		
		//set에는 중복된 데이터를 추가할 수 없다.
		hs1.add("a");
		hs1.add("b");
		
		//set에 저장되어 있는 a라는 데이터를 제거
		hs1.remove("a");
		
		//hs1.removeAll(hs1); --> hs1의 모든 index를 제거
		System.out.println( hs1 );
		
		System.out.println("------------------");
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		while(true) {
			
			int r = new Random().nextInt(45) + 1;
			hs2.add(r);
			
			if( hs2.size() == 6 ) {//size() : set객체의 방 갯수
				break;
			}
			
		}//while
		
		System.out.println(hs2);
		
		//Set -> 배열
		//new Integer[0] <-- 배열의 방 갯수를 0으로 잡으면 set이 add해둔 방 갯수만큼
		//자동으로 배열의 index가 생성된다
		Integer[] arr = hs2.toArray( new Integer[0] );
		for( int i = 0; i < arr.length; i++ ){
			System.out.print(arr[i] + " ");
		}
		
	}//main
}














