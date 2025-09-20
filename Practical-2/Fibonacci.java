import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		int n;
		System.out.println("Enter number of elements: ");
		n = scan.nextInt();
		int first=0;
		int second=1;
		
		for(int i=1;i<=n;i++){
			System.out.print(first+" ");
            		int third=first+second;
            		first=second;
            		second=third;
			
		}
	}
}