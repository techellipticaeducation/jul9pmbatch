package abstraction;

public class AbstractionDemo {
	public static void main(String[] args) {

	}
}

abstract class A{
	public abstract void test1();
}

abstract class B{
	public abstract  void test1();
	
	public void test2() {
		System.out.println("test1");
	}
	
}


//  fully abstarct 

interface H{
	public void test5();
}

interface K{
	public void test6();
}


class C  implements H,K{

	@Override
	public void test6() {
		System.out.println("his own implementation");
	}

	@Override
	public void test5() {
		System.out.println("logic");
	}
	
}

// abstraction concept


// partial abstraction - abstract method  + non method
// we cannot create object of abstract class
// we have to extends it
// if any of the method is abstract then we have to make class abstract




