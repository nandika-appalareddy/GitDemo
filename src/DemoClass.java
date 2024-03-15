
public class DemoClass {

	String data;
	static String Name;
	
	public static void methods(String name) {
		
		Name = name;
	}
	
	public static void main(String[] args) {

		DemoClass dc = new DemoClass();
		dc.methods("Avinash");
		DemoClass.methods("Narendra");
		
		System.out.println(Name);
		
	}

}
