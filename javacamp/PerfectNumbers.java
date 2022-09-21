package javacamp;

public class PerfectNumbers {

	public static void main(String[] args) {

		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) 
				total += i;
		}
		if (total == number)
			System.out.println("It's a perfect number");
		else
			System.out.println("It's NOT a prfect number");
	}
}