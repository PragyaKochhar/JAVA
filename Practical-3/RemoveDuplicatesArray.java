import java.util.Scanner;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Pragya Kochhar, 24csu155");
        int n = 5;
        int arr[] = new int[n];
	System.out.println("Enter 5 elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int uniqueCount = 0;
        int uniqueArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}