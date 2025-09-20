import java.util.Scanner;
class TempConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
    		System.out.println("Enter 1 to convert Celcius into Farenheit \nEnter 2 to convert Farenheit into Celcius");
    		int choice= scan.nextInt();
    		if(choice==1){
        		System.out.println("Enter temperature in celcius :");
        		float c = scan.nextFloat();
        		float f = ( c * 9/5) + 32;
        		System.out.println("Temperature in farenheit is: " + f);
		}
   		else if(choice ==2){
        		System.out.println("Enter temperature in farenheit:");
        		float f = scan.nextFloat();
        		float c = (f - 32) * 5/9;
        		System.out.println("Temperature in celcius is: " + c);
		}
      		else{
       			System.out.println("Invalid input");
		}
	}
}




