import java.util.Scanner;
class Area {
    double length, breadth;

    Area(double l, double b) {
        length = l;
        breadth = b;
    }
    double returnArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pragya Kochhar, 24csu155");
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        Area rect = new Area(l, b);
        System.out.println("Area: " + rect.returnArea());
    }
}