package Inheritance;

public class Child_Class extends Parent_Class{

	String color = "Red";
	public static void main(String[] args) {
		
		System.out.println("Inheritance Concept: ");
		
		Child_Class c = new Child_Class();
		System.out.println(c.color);
		c.gear();
		c.breaks();
		
		System.out.println("\nObject creation with Parent properties: ");
		
		Parent_Class p = new Child_Class();
		System.out.println(p.color);
	}

}
