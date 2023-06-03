package week.day2;

public class Maths {
       public int addition(int num1, int num2)
       {
    	   return num1 +num2;
       }
       
       public int subtract(int num1, int num2){
    	   return num1-num2;
       }
       
       public int division(int num1, int num2) {
    	   return num1/num2;
       }
       
	public static void main(String[] args) {
		Maths operation = new Maths();
		int addition = operation.addition(30,10);
		System.out.println(addition);
		int subtract = operation.subtract(3,1);
		System.out.println(subtract);
		int division = operation.division(20,4);
		System.out.println(division);
	}

}
