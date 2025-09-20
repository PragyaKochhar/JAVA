import java.util.Scanner;
public class IndexArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		int n;
		System.out.println("Enter number of elements of array: ");
		n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element at index "+i+" : ");
			arr[i] = scan.nextInt();
		}
		int element;
		System.out.println("Enter the element to be searched: ");
		element = scan.nextInt();

		System.out.println("The elements of the array are: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"  ");
		}

		int index = -1;
		for(int i=0;i<n;i++){
			if (arr[i] == element){
				index = i;
				break;
			}
		}
		
		if (index != -1) {
            		System.out.println("\nThe element is found at index " + index);
        	} 
		else {
            		System.out.println("\nThe element is not found");
            		System.out.println("-1");
        	}
	}
}