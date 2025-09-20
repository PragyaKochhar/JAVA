import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
        	System.out.print("Enter a 3 digit number: ");
        	int num = sc.nextInt();
        	if (num < 100 || num > 999) {
            		System.out.println("Invalid input.");
       		}
		else{
            		int lastDigit = num % 10;        
            		int middleDigit = (num / 10) % 10; 
            		int firstDigit = num / 100;       
            		int reversed = lastDigit * 100 + middleDigit * 10 + firstDigit;
            		System.out.println("Reversed Number: " + reversed);
        	}
    	}
}