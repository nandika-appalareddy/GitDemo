package Interview;
import java.util.ArrayList;

public class Print_Uinque {

	public static void main(String[] args) {
		
		int[] arr = {9,3,6,9,3,6,7,8,7,8,7,8,5,6,9,4,9,9,9,9,9,9};
		int unique=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) 
		{
			int count = 1;
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);
				for(int j=i+1; j<arr.length; j++) 
				{
					if(arr[i] == arr[j]) 
					{
						count++;
					}
				}
				System.out.println(arr[i] + " " + count);
			}
		}
	}

}
