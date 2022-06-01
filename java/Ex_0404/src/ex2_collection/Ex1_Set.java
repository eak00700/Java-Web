package ex2_collection;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//�÷���(collection) : java.util��Ű���� �������̽�
		//�迭�� ������ �����Ͽ� index������ ������ ���� ���� �ټ��� ��ü��
		//�ٷ�� ���� ����ϴ� ���α׷��� ���
		
		//Set, Map, List
		//HashSet< ���ʸ�Ÿ�� > : ���ʸ� Ÿ�� - ������ ���� Set��ü���� �����ϰ��� �ϴ�
		//�ڷ����� Ÿ���� �̸� �����صδ� ����. �ݵ�� Ŭ���� ���·θ� ���� ����
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("a");
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		
		//set���� �ߺ��� �����͸� �߰��� �� ����.
		hs1.add("a");
		hs1.add("b");
		
		//set�� ����Ǿ� �ִ� a��� �����͸� ����
		hs1.remove("a");
		
		//hs1.removeAll(hs1); --> hs1�� ��� index�� ����
		System.out.println( hs1 );
		
		System.out.println("------------------");
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		while(true) {
			
			int r = new Random().nextInt(45) + 1;
			hs2.add(r);
			
			if( hs2.size() == 6 ) {//size() : set��ü�� �� ����
				break;
			}
			
		}//while
		
		System.out.println(hs2);
		
		//Set -> �迭
		//new Integer[0] <-- �迭�� �� ������ 0���� ������ set�� add�ص� �� ������ŭ
		//�ڵ����� �迭�� index�� �����ȴ�
		Integer[] arr = hs2.toArray( new Integer[0] );
		for( int i = 0; i < arr.length; i++ ){
			System.out.print(arr[i] + " ");
		}
		
	}//main
}














