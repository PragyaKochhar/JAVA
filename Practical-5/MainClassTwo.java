import java.util.Scanner;
class MainClassTwo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		int N;
		System.out.println("Enter value if N: ");
		N = scan.nextInt();

		Vehicle v;
		switch(N){
			case 2:
				v = new Bike();
				break;
			case 4:
				v = new Car();
				break;
			default:
				v = new Vehicle();
		}
		v.display();
	}
}