import java.util.Scanner;
public class SumArrays{
	public static int allSum(int arr[]){
		int sum = 0;
		for(int i=0;i<5;i++){
			sum += arr[i];
		}
		return sum;
		
	}

	public static int altSum(int arr[]){
		int sum = 0;
		for(int i=0;i<5;i+=2){
			sum += arr[i];
		}
		return sum;
	}


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		int n=5;
		int allSum =0;
		int altSum = 0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element at index "+i+" : ");
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter 1 to find sum of all elements.");
		System.out.println("Enter 2 to find sum of alternative elements.");
		System.out.println("Enter your choice: ");
		int choice;
		choice = scan.nextInt();

		switch (choice){
			case 1:
				System.out.println("Sum of all elements: "+allSum(arr));
				break;
			case 2: 
				System.out.println("Sum of alternative elements: "+altSum(arr));
				break;
			default:
				System.out.println("Invalid choice.");
		}
		
	}
}