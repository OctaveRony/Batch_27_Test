package learning;

public class Varriables {
	static String name = "Octave";
	int number = 30;
	
	
	
	
	
	public static void main(String[] args) {
		Varriables.small();
		Varriables obj = new Varriables();
		obj.big();
		
	}
		public static void small() {
		System.out.println(name);
		
	}
	
		public void big() {
			System.out.println(name);
			System.out.println(number);
		}
}
