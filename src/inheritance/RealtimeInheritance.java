package inheritance;

public class RealtimeInheritance {
	public static void main(String[] args) {
		HDFC h1 = new HDFC();
		System.out.println(h1.interestRate());
	}
}




class Bank {
	public double interestRate() {
		return 0.0;
	}	
}


class HDFC extends Bank{
	public double interestRate() {
		return 6.0;
	}
}

class ICICI extends Bank{
	public double interestRate() {
		return 10.0;
	}
}


//  Method Overriding 
