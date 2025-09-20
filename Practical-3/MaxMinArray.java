import java.util.Scanner;
public class MaxMinArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		int n;
		System.out.println("Enter number of elements of array: ");
		n= scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element at index "+i+" : ");
			arr[i] = scan.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<n;i++){
			if (arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("The minimum element of the array is: "+min);
		System.out.println("The maximum element of the array is: "+max);
	}
}