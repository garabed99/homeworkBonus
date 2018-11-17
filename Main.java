package homeworkBonus;

public class Main {
	
	public static int factorial (int num) {
		return num == 1 ? 1 : num * factorial(num-1);
		
	}

	public static void main(String[] args) {		
		People Person1 = new People("Garabed", "Baghsarian");
		System.out.println(Person1.get());
		
		Building Empire_State = new Building(80, 4);
		System.out.println(Empire_State.all_apartments());
		
		University AUA = new University("AUA", 4);
		System.out.println(AUA.commitment());
	
		System.out.println(factorial(5));
	}
	
}
