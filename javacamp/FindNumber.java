package javacamp;

public class FindNumber {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

		int find = 9;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == find) {
				isThere = true;
				break;
			}
		}
		if(isThere)
			System.out.println("This number is in the array");
		else
			System.out.println("This number is NOT in the array");
		

	}

}
