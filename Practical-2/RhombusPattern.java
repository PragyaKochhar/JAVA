import java.util.Scanner;
public class RhombusPattern {
	public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
		System.out.println("Pragya Kochhar, 24csu155");
        	char choice;

        	do {
            		System.out.print("Enter the number of rows: ");
            		int r = scan.nextInt();
			System.out.println("Rhombus: ");
            		for (int i = 1; i <= r; i++) {
                		for (int j = i; j < r; j++) {
                    			System.out.print(" ");
                		}
                		for (int j = 1; j <= (2 * i - 1); j++) {
                    			System.out.print("*");
               			}
                		System.out.println();
            		}
            		for (int i = r - 1; i >= 1; i--) {
                		for (int j = r; j > i; j--) {
                    			System.out.print(" ");
                		}
                		for (int j = 1; j <= (2 * i - 1); j++) {
                   			System.out.print("*");
                		}
                		System.out.println();
            		}


			System.out.println("Left triangle: ");
			for(int i =0; i<r;i++){
              			for(int j=0;j<i+1;j++){
                     			System.out.print("*");
               			}
        			System.out.println();
        		}

			System.out.println("Right triangle: ");
			for(int i =0; i<r;i++){
              			for(int j=0;j<r-i-1;j++){
                        		System.out.print(" ");
               			}
				for(int j=0;j<i+1;j++){
                        		System.out.print("*");
               			}
				System.out.println();
        		}
			

			System.out.println("Pyramid");
			for (int i = 1; i <= r; i++) {
            			for (int j = 1; j <= r - i; j++) {
                			System.out.print(" ");
            			}
            			for (int k = 1; k <= (2 * i - 1); k++) {
                			System.out.print("*");
            			}
            			System.out.println(); 
        		}


            		System.out.print("Do you want to try again? (Y/N): ");
            			choice = scan.next().charAt(0);

        		} 
			while (choice != 'N' && choice != 'n');
        		System.out.println("Program exited");
    	}
}