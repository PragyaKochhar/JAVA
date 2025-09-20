import java.util.Scanner;
class sumDigits{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		System.out.println("Enter 3-digit number: ");
		int number = scan.nextInt();
		int digit;
		int sum = 0;
		if(number >= 100 && number <= 999){

			while (number>0){
			digit = number % 10;
			number = number / 10;
			sum = sum + digit;

			}
			System.out.println("The sum of digits is: "+sum);
 		}	

		else{
			System.out.println("Invalid input");
		}
	}
}