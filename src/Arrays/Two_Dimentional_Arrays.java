package Arrays;

public class Two_Dimentional_Arrays {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		arr[0][0] = 9;
		arr[0][1] = 8;
		arr[0][2] = 7;
		arr[1][0] = 6;
		arr[1][1] = 5;
		arr[1][2] = 4;
		//arr[2][0] = 3;
		//arr[2][1] = 2;
		//arr[2][2] = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(arr.length);

	}

}
