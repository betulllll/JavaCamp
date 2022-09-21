package javacamp;

public class IsPrime {

	public static void main(String[] args) {
		int number = 27;
		// int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("It's NOT a prime number");
			return;
		}
		if (number < 1)
			System.out.println("Wrong number");
		for (int i = 2; i < (number - 1); i++) {
			if (number % i == 0)
				isPrime = false;
		}

		if (isPrime)
			System.out.println("It's a prime number");
		else
			System.out.println("It's NOT a prime number");

	}

}
