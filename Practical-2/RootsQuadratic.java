import java.util.Scanner;
public class RootsQuadratic{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		double a,b,c;
		System.out.println("Enter value of a: ");
		a = scan.nextDouble();
		System.out.println("Enter value of b: ");
		b = scan.nextDouble();
		System.out.println("Enter value of c: ");
		c = scan.nextDouble();
		double d = b*b - 4*a*c;
		if (d>0){
			System.out.println("The roots are real and distinct");
			double root1 = (-b + Math.sqrt(d))/(2*a);
			double root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("The two roots are: " + root1 + " and " + root2);
		}
		else if (d==0){
			System.out.println("The roots are real and equal");
			double root = (-b)/(2*a);
			System.out.println("The root is "+root);
		}
		else{
			double real = (-b)/(2*a);
            		double imaginary = Math.sqrt(-d)/(2*a);
            		System.out.println("The roots are complex");
            		System.out.println("First root is " + real + " + " + imaginary + "i");
           		System.out.println("Second root is " + real + " - " + imaginary + "i");
		}
	}
}