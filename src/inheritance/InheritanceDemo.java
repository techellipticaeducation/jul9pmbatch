package inheritance;

public class InheritanceDemo {
	// void - no return type
	// static - 
	public static void main(String[] paymentFile) {
		// payment dataextract - txt 
		// 1 2 3,     0 1 2, size = 3 
		
		A a1 = new A();;
		int z  = 10;
		
		int k = 10;
		
		for(int i = 0 ; i < paymentFile.length ;i++) {
			System.out.println("Reading Payment file " + paymentFile[i]);
			System.out.println("Extarcting data from " + paymentFile[i]);
			System.out.println("creating txt fule from " + paymentFile[i]);
			System.out.println("===================");
		}
		
	}
}


// Method overriding
// when parent and child both have same signature method ,
// then child class method override parent parent


class A{
	public void run(int i) {
		int z = 20;
		System.out.println("30km/h");
	}
}

class B extends A{
	public void run(int i , int j) {
		System.out.println("40km/h");
	}
}