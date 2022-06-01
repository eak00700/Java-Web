package ex3_animal;

public class AnimalMain {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		System.out.println( "°í¾çÀÌ" );
		System.out.println("´« : " + cat.getEye());
		System.out.println("´Ù¸® : " + cat.getLeg());
		System.out.println("Æ¯Â¡ : " + cat.balance);
		
		System.out.println("------------------------");
		
		Lion lion = new Lion();
		System.out.println("»çÀÚ");
		System.out.println("´« : " + lion.getEye());
		System.out.println("´Ù¸® : " + lion.getLeg());
		System.out.println("Æ¯Â¡ : " + lion.galgi);
		
		System.out.println("---------------------");
		
		Snake snake = new Snake();
		System.out.println("¹ì");
		System.out.println("´« : " + snake.getEye());
		System.out.println("´Ù¸® : " + snake.getLeg());
		System.out.println("Æ¯Â¡ : " + snake.sensor);
		
	}//main
}















