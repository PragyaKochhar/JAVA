import java.util.Scanner;
public class EvenOddArray {
	public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
        	System.out.println("Pragya Kochhar, 24csu155");
        	System.out.print("Enter number of elements of array: ");
        	int n = scan.nextInt();
        	int arr[] = new int[n];
        	for (int i = 0; i < n; i++) {
            		System.out.print("Enter element at index " + i + " : ");
            		arr[i] = scan.nextInt();
        	}

        	int evenCount = 0, oddCount = 0;
        	for (int i = 0; i < n; i++) {
           		if (arr[i] % 2 == 0)
                		evenCount++;
            		else
                		oddCount++;
        	}

        	int[] evenArray = new int[evenCount];
        	int[] oddArray = new int[oddCount];
        	int eIndex = 0, oIndex = 0;
        	for (int i =0;i<n;i++) {
            		if (arr[i] % 2 == 0) {
                		evenArray[eIndex++] = arr[i];
            		} 
			else {
                		oddArray[oIndex++] = arr[i];
            		}
        	}
        	System.out.println("\nOriginal Array: ");
        	for (int i = 0; i < n; i++) {
            		System.out.print(arr[i] + "  ");
        	}
        	System.out.println("\nEven Array: ");
        	for (int i = 0; i < evenArray.length; i++) {
            		System.out.print(evenArray[i] + "  ");
        	}
        	System.out.println("\nOdd Array: ");
        	for (int i = 0; i < oddArray.length; i++) {
            		System.out.print(oddArray[i] + "  ");
        	}
        	System.out.println("\n\nLength of Original Array: " + arr.length);
        	System.out.println("Length of Even Array: " + evenArray.length);
        	System.out.println("Length of Odd Array: " + oddArray.length);
    	}
}
