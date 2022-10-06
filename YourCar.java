package week1.day1;
import week1.day2.Car;

public class YourCar {
	public static void main(String[] args) {
	Car obj = new Car();
	obj.printCarName();
	int regNumber = obj.getRegNumber(8989);
	System.out.println(regNumber);
	String colour = obj.getColour("Black");
	System.out.println(colour);
	boolean carPunctured = obj.isCarPunctured(true);
	System.out.println(carPunctured);
	
	int add3Numbers = obj.add3Numbers(89, 98, 80);
	System.out.println(add3Numbers);
	//obj.sub2Numbers(9,0); Not Visible 
	//obj.mul3Numbers(7.1f, 2.3f, 0.1f); Not Visible
	int div2Numbers = obj.div2Numbers(98, 8);
	System.out.println(div2Numbers);
	
	
		
	}

}
