package javacamp;

public class Switch {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Perfect: You passed");
			break;
		case 'B':
			System.out.println("Nice: You passed");
			break;
		case 'C':
			System.out.println("Good: You passed");
			break;
		case 'D':
			System.out.println("Not bad: You passed");
			break;
		case 'F':
			System.out.println("Sorry: You failed");
			break;
		default:
			System.out.println("Wrong value");
		}

	}

}
