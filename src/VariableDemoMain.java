
public class VariableDemoMain {

	public static void main(String[] args) {
		
		VariableDemo obj = new VariableDemo();
		System.out.println(obj.name = "This is instance Variable");
		obj.display();
		
		//calling static variable
		System.out.println(VariableDemo.college);

	}

}
