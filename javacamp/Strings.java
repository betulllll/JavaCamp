package javacamp;

public class Strings {

	public static void main(String[] args) {

		String message = "Today the weather is very nice.";
		System.out.println(message);
/*
		System.out.println("The number of characters: " + message.length());
		System.out.println("Fifth character: " + message.charAt(4));
		System.out.println(message.concat(" Yeah!"));
		System.out.println(message);

		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));

		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);

		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('a'));
		*/
		
		System.out.println(message.replace(' ', '-'));
		System.out.println(message);
		String newMessage=message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(2));
		System.out.println(message.substring(0, 5));
		
		
		for(String word: message.split(" "))
		{
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message.trim());
	}

}
