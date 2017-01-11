package prapul;

import java.util.Scanner;

class AndroidSession7_Assignment3 {
	public static void main(String args[]) {
		String string, sub;
		int i, c, length;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print all it's substrings");
		string = in.nextLine();
		length = string.length();
		if (length > 0) {
			System.out.println("Sustrings found...");
			System.out.println("Substrings of \"" + string + "\" are :-");
			for (c = 0; c < length; c++) {
				for (i = 1; i <= length - c; i++) {
					sub = string.substring(c, c + i);
					System.out.println(sub);
				}
			}
		} else {
			System.out.println("Sustring not found");
		}
		in.close();
	}
}
