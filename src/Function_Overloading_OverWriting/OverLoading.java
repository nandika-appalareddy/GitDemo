package Function_Overloading_OverWriting;

public class OverLoading {

	//methosd with the same name but differe in
	//number of arguments or return type of the arguments.
	
	public void plus(int a, int b) {
		System.out.println(a+b);
	}
	
	public void plus(String a, String b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		OverLoading ov = new OverLoading();
		ov.plus(3, 6);
		ov.plus("Hi!", " Avinash");
	}

}
