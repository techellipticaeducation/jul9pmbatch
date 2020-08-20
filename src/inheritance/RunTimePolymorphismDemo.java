package inheritance;

public class RunTimePolymorphismDemo {
	public static void main(String[] args) {

		Parent     ch     =      new      Child();

	
	
		ch.test1();
//		ch.test2();
	}
}

class Parent{
	public void test1() {
		System.out.println("Parent test1");
	}
	
	public void quesu1() {
		System.out.println("Parent quesu1");
	}
}

class Child extends Parent{
	public void test1() {
		System.out.println("Parent Child");
	}
	
	public void test2() {
		System.out.println("Parent quesu1");
	}
	
	public void quest2() {
		System.out.println("Parent quesu1");
	}
}
