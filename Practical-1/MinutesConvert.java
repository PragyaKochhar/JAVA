import java.util.Scanner;
public class MinutesConvert{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		System.out.println("Enter minutes: ");
    		int mins = scan.nextInt();
   		float hrs  = mins/60;
    		System.out.println("Hours: "+ hrs);
    		float days = mins/1440;
    		System.out.println("Days:"+ days);
    		double yrs = mins/525600;
    		System.out.println("Years:"+ yrs);
	}
}