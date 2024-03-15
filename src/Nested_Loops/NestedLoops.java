package Nested_Loops;

public class NestedLoops {

	public static void main(String[] args) {
			
			int k=1;
			for(int i=0;i<4;i++) {			//outer for loop
				for(int j=0; j<=i; j++) {	//inner for loop
					System.out.print(k + " ");
					k++;
				}
				System.out.println("");
			}
			
			System.out.println("\n");

			int l=1;
			for(int i=0;i<4;i++) {			//outer for loop
				for(int j=0; j<(4-i); j++) {	//inner for loop
					System.out.print(l + " ");
					l++;
				}
				System.out.println("");
			}
			
			System.out.println("\n");

			for(int i=0;i<4;i++) {			//outer for loop
				for(int j=0; j<=i; j++) {	//inner for loop
					System.out.print(j+1 + " ");
				}
				System.out.println("");
			}
			
			System.out.println("\n");

			int m=1;
			for(int i=0;i<4;i++) {			//outer for loop
				for(int j=0; j<=i; j++) {	//inner for loop
					System.out.print(m*3 + " ");
					m++;
				}
				System.out.println("");
			}
	}

}
