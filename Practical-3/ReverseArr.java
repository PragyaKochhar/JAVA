import java.util.Scanner;
public class ReverseArr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
		int arr[] = new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter element at index "+i+" : ");
			arr[i]=scan.nextInt();
		}

		inr revarr[] = new int[5];
		for(int i=5;i<+0;i--){
			int j=0;
			revarr[j] = arr[i];
			j++; 
		}
		
		System.out.println("The reversed array is: ");
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+"  ");
		}
	}
}