package week.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int i=0;
		int j=0;
		int l=arr.length;
		     for (i=0;i<l;i++) {
		    	 for (j=i+1;j<l;j++) {
		    		 		    	if(arr[i]==arr[j])	 {
		    		System.out.println(arr[i]);
		      		 
		    		 		    	}
		    	 }
		     }

	}

}
