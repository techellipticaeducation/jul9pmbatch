package finalpac;

public class FinalKeywordDemo {
	
	// use to create constant
	static final double pi = 3.14d;
	
	//The blank final field initialized is mandatory
	public static void main(String[] args) {
		FinalKeywordDemo h = new FinalKeywordDemo();
		h.test1(40);
	}
	
	public void test1(final int k) {
		//k = 40;
	}
	
	// we can define param as final but we cannot change it in logic
	// String also implemented as Constant
	// all object , everything u can define as final
}


// Inheritance