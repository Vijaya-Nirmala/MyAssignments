package week.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int r;
		int fn =0;
		int sn =1;
		int sum=0;
		System.out.println(fn);
		System.out.println(sn);
		for(r=1;r<=6;r++)
		{
		sum = fn+ sn;
		System.out.println(sum);
			fn =sn ;
			sn= sum;
		
		
		}
		    
		
		
		
		
		
		
		

	}

}
