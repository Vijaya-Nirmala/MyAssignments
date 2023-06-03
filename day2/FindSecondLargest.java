package week.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int l= data.length;
		for(int i=0;i<l;i++) {
			if (i==l-2) {
		System.out.println(data[i]);
		
	}
		}
}
}
