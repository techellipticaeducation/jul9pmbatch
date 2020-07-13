package operators;

public class OperatorDemo {
	public static void main(String[] args) {
	//	operators
	//	Arithmatic operators
//		1 - +,-,*/%
		
		int i = 10;
		int j = 7;
		
		int k1 = i+j; // 17
		int k2 = i-j; // 3
		int k3 = i*j; // 70
		double k4 = (float)i/(float)j; // 1.5
		int k5 = i%j; // 3
		
//		System.out.println(k1);
//		System.out.println(k2);
//		System.out.println(k3);
//		System.out.println(k4);
//		System.out.println(k5);
		
		
		
		// increment
		
		// a++ = post increment ,,     first value assign, then increase
		// ++a = pre increment         first increase , then assign
		
		// pre-increment is faster then post increment
		
		
		
		int a = 1;
		int b = ++a + a++ + ++a; 
		
	
		System.out.println(b);
		
		// 1
		
		
		a++; a+=1;
		a+=4; // a= a+4
		a--;
		a-=4;// a= a-4
		
		
		a*=4;
		a/=4;
		a%=4;
		
		
		
		// comparison 
//		> < >= <= != ==
		
	int i10 = 10;
	int i20 = 10;
	System.out.println(i10==i20);


	//AND = &
	
//	true true = true
//	true false = false
//	false true = false
//	false false = false
	
	
//	OR |
//	true true = true
//	true false = true
//	false true = true
//	false false = false
	
		// blind
//		& = bitwise AND 
//		| = bitwise OR
		
		// logical
//		&& = logical AND
//		|| = logical OR
		
				
	}
}
