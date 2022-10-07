package week1.day1.classroom;

public class SumOfDigits {
public static void main(String[] args) {
	int num = 123;
	int sum=0;
	while (num>0) {
		int remainder =num%10;
		System.out.println("Remainder = "+remainder);
		sum = sum+remainder;
		System.out.println("Sum "+sum);
		num = num/10;
		System.out.println("Quotient "+ num);
	
		
	}System.out.println("FinalSum "+sum);
}
}
