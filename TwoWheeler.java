package week1.day2;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 45678902345634567l;
	boolean isPunctured = false;
	String bikeName = "Yamaha";
	double runningKM = 50.45;
public static void main(String[] args) {
		TwoWheeler bike = new TwoWheeler();
		int noOfWheels2 = bike.noOfWheels;
		System.out.println(noOfWheels2);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);
		
	}
	

}
