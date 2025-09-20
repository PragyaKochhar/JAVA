import java.util.Scanner;
public class VowelConsonantCheck {
    	public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
        	System.out.print("Enter a single character: ");
        	String input = scan.nextLine();

        	if (input.length() != 1) {
            		System.out.println("Error: Please enter exactly one character.");
        	} 
		else {
            		char ch = input.charAt(0);

            	if (Character.isLetter(ch)) {
                	char lower = Character.toLowerCase(ch);

                	if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    		System.out.println("Vowel");
                	} 
			else {
                    		System.out.println("Consonant");
                	}
            	} 
		else {
                	System.out.println("Error: Input is not a letter.");
            	}
        	}

    	}
}