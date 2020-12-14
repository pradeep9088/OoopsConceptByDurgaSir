package InterfaceDemo;

public class mainClass {

	public static void main(String[] args) {
		InterfaceImplementation imp= new InterfaceImplementation();
		System.out.println("The sum is :"+imp.add(10, 20));
		System.out.println("The multiplication for two number is :"+imp.multiply(10, 20));
	}

}
