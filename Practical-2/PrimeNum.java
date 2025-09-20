import java.util.Scanner;
public class PrimeNum{
	public static void main(String[] args){
        	Scanner scan = new Scanner(System.in);
        	System.out.println("Pragya Kochhar, 24csu155");
        	int num;
        	System.out.println("Enter a number: ");
        	num = scan.nextInt();
        	if(num < 2){
            		System.out.println("Number is not prime.");
        	} 
		else {
            		boolean isPrime = true;
            		for(int i = 2; i <= num/2; i++){
                		if(num % i == 0){
                    			isPrime = false;
                    			break;
                		}
            		}

            		if(isPrime){
                		System.out.println("Number is prime");
            		} 
			else {
                		System.out.println("Number is not prime");
            		}
        	}
    	}
}