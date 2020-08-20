package package2;

import package1.Test2;

public class Test3 {
public static void main(String[] args) {
	Test2 test = new Test2();
//	test.publicmethod();
	System.out.println(test.i);
}
}


// Encapsulation - access modifiers

// It provide you access to method 
//or varibale or classes


// public - any one can see this
// default - only in same package classes can see this
// private - only same class can see this

// public < default < private


// method
// variables - instace and static
// class - public and default 
// (you cannot make class private or protected)