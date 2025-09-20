import java.util.Scanner;
class PointClass {
   	public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
        	System.out.print("Enter x1 and y1: ");
        	double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
        	System.out.print("Enter x2 and y2: ");
        	double x2 = scan.nextDouble(), y2 = scan.nextDouble();
        	PointC p1 = new PointC(x1, y1);
        	PointC p2 = new PointC(x2, y2);
        	System.out.print("Point 1: ");
        	p1.display();
        	System.out.print("Point 2: ");
        	p2.display();
        	double dist = PointC.distance(p1, p2);
        	System.out.printf("Distance: %.2f\n", dist);
    	}
}