import java.util.ArrayList;

public class Core_JAVA_Basics {

	public static void main(String[] args) {

		//DataTypes
		int myNum=9;
		String website="Starting Selenium with Java";
		double dec=9.99;
		boolean myCard=true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		System.out.println("\n\n");
		//Arrays
		int[] arr = new int[5];
		arr[0]=7;
		arr[1]=9;
		arr[2]=18;
		arr[3]=27;
		arr[4]=36;
		
		String[] arrs = {"Avinash", "Narendra", "Hari"};
		
		//for loop
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(String s : arrs)			//for(int i=0; i<arrs.length;i++)
		{
			System.out.println(s);
		}
		System.out.println("\n\n");
		
		//if else //check if arr has atleast multiple of two
		for(int i : arr)
		{
			if(i%2==0) {
				System.out.println(i + "is divisible by 2");
				break;
			}
			else {
				System.out.println(i + "is not divisible by 2");
			}
		}
	
		System.out.println("\n\n");
		
		//ArrayList
		ArrayList<String> a = new ArrayList();
		a.add(0, "Gandhi");
		a.add("Sanju");
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("\n\n");

		//.contains method
		System.out.println(a.contains("2"));
		
	}

}
