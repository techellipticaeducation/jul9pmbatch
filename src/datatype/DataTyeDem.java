package datatype;

public class DataTyeDem {
	public static void main(String[] args) {
		// numerical Data Type
		// byte - 1 byte,     1 byte = 8 bits ,  1 bit = 0,1,  posible 2 power 8 =  
		//256 = 1 byte
		// 256 = 128(negative) + 127 (positive) 
		// -128 to 0 and 0 to 127 = -128 to 127 = byte
		
		
		// short - 2 byte  - 16 bits = 2 power 16 = -32XXX to +32XXX
		
		// int - 4 byte  - 32 bits , 2 power 32
		
		// long  - 8 byte - 64 bits , 2 power 64
		
		                   //                                                      2      2                                              
//		Number System
//      Decimal - 0,1,2,3,4,5,6,7,8,9
//		Binary - 0,1                                                      256     16       1
//      Octal - 0,1,2,3,4,5,6,7
//      Hexadecimal - 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F

//  34 [Decimal] = 3* 10 + 4*1 = 34 = 42 in octal , 22 in hexadecimal

		
	int i = 0X42;  // any integer start with 0 - octal number system
	// if 0X = it become hex decimal
	
	
//	System.out.println(i);
	
	// casting
	// -128 to 127
	byte b1  = (byte)260;
//	System.out.println(b1);
	
	
	// floating type = points
	// float 
	// double
	
	float f1 = 89.90f; // 4 byte
	double j = 67.56d; /// 8 byte
	
	// boolean
	
	boolean b2 = true;
	
	char v = 'A'; // Ascii - 65 - 1 byte = 256 
	int k1 = v;
	System.out.println(k1);
	
	int df = 67; // C
	char cj = (char)df;
	System.out.println(cj);
	
	
	
	// unicode  2 byte = 2power 16 = 65123
	
	
	
	}
}
