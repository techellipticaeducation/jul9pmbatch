package test;

public class Test {
	public static void main(String[] args) {
		A1 a = new A1();
		a.test1();
		a = null;
		
	}
}

class A1{
	int i;
	
	public void test1() {
		System.out.println("test");
	}
	
}

