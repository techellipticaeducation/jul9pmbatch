package constructordemo;

public class ConstructorDemo {
	public static void main(String[] args) {
		A a1 = new A(8);
		System.out.println(a1.j);
		a1.B();
		a1.B();
		a1.B();
		a1.B();
		
		A a2 = new A(8);
		
	}
}


class A{
	// Every class has a by default contructor
	// Contructor always same as class name

	// default contructor - non paramertized constructor 
	// if we create any parameterized constructor , class lose its default conctructor

	
	// When we create object - Constructor getting called
	// method - anytime and as many time 
	
	int j; // instance 
	
	// Constructor Overloading
	
	A(int i){
		this(i,10);
	}
	
	A(int i, int j){
		j = i;
	}
	

	A(String x){
		
	}

	// When we have same method name but different parameters in terms of number and type - Method overloading
	// Compile Time Polymorphism

	// A with no param
	void A() {
		
		System.out.println("code");
	}
	
	// A with int param
	void A(int i) {
		System.out.println("code");
	}

	// A with String param
	void A(String i) {
		B();
	}


	void B() {
		A();
	}

	// method always has a return type 
}
