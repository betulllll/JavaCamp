package javacamp;

public class RecapDemo1 {
//Find the largest number
	public static void main(String[] args) {
		int number1=20, number2=25, number3=2;
		
        int max= number1;
        if(number2>max)
        {
        	max=number2;
        }
        if(number3>max)
        {
        	max=number3;	
        }
        System.out.println("Max number is "+max);
	}

}
