package ex1_work;

public class PrintGraph {
	
	public void print( int[] arr ) {
		
		for( int i = 0; i < arr.length; i++ ) {
			
			System.out.print(i + "ÀÇ °¹¼ö : ");
			
			for(int j = 0; j < arr[i]; j++) {
				System.out.print('#');
			}//inner
			
			System.out.println(" " + arr[i]);
			
		}//for
		
	}
	
}
