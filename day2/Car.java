package week1.day2;

public class Car {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarName();
		int regN = obj.getRegNumber(7878);
		System.out.println(regN);
		String colour = obj.getColour("Blue");
		System.out.println(colour);
		boolean carPunctured = obj.isCarPunctured(true);
		System.out.println(carPunctured);	
	int sum = obj.add3Numbers(4, 6, 7);
	System.out.println(sum);
	int subtract = obj.sub2Numbers(98, 8);
	System.out.println(subtract);
float multiply = obj.mul3Numbers(7.5f,8.6f,8.7f);
		System.out.println(multiply);
		int divide = obj.div2Numbers(78, 2);
		System.out.println(divide);		
	}
public void printCarName() {
	System.out.println("Swift");
}
public int getRegNumber(int regN) {
	return regN;
}
public String getColour(String colour) {
		return colour;
}
public boolean isCarPunctured(boolean puncture) {
	return puncture;
}
public int add3Numbers(int num1, int num2,int num3) {
	int sum = num1+num2+num3;
	return sum;
}
private int sub2Numbers(int s1,int s2) {
	return s1 - s2;
}
 float mul3Numbers(float m1,float m2,float m3) {
        return m1*m2*m3;
}
public int div2Numbers(int d1, int d2) {
		return d1/d2;
}

}
