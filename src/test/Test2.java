package test;

public class Test2 {
public static void main(String[] args) {
	Student s1 = new Student();
	s1.speak();
	
	// object - instance
}
}

class Student{
	
	
	String name = "test";
	
	
	public void speak() {
		
		System.out.println(name);
		read();
	}
	
	public void read() {
		System.out.println(name);
		speak();
	}
	
}
