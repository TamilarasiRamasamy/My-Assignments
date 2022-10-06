package week1.day2;

public class MyCar {
public static void main(String[] args) {
	Car obj = new Car();
	obj.printCarName();
	int regN = obj.getRegNumber(5656);
	System.out.println("Registration Number: "+regN);
	String colour = obj.getColour("Red");
	System.out.println("Car Colour = "+colour);
	boolean carPunctured = obj.isCarPunctured(false);
	System.out.println("Is Car Punctured: "+ carPunctured);
	int sum = obj.add3Numbers(10, 20, 30);
	System.out.println("Sum of 3 Numbers: "+sum);
	//obj.sub2Numbers(8,7); Not Visible
	float multiply = obj.mul3Numbers(7.1f, 2.3f, 0.1f);
	System.out.println("Multiplication of 3 Numbers:"+ multiply);
	int division = obj.div2Numbers(98, 8);
	System.out.println("Division of 2 Numbers: "+ division);
	
	
	
	
	
	
	
	
}
}
