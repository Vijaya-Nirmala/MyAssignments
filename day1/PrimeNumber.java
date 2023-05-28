package week.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int i;
		int x =13;
		int flag = 0;
		for (i=2;i<=7;i++) {
		 if (x%i==0) {
			 flag = 0;}
		 else {
			 flag =1 ;
			 }
		 break;
		}
		if (flag==0) {
			
		System.out.println("The number" + x + " is not a prime number");
		}
				else {
			System.out.println("The number "  + x + " is prime number");
		
		}
	}
		

	}


