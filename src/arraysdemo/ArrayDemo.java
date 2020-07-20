package arraysdemo;

public class ArrayDemo {
public static void main(String[] args) {
	int i = 10;
	int[] j = {20,10,30,50};  // early init
	byte[] t = {10,20,30};
	String[]  l = {"a","c"};
	
	int[] k = new int[3]; // declear
	// when we create array we need to give size of that array
	k[0] = 10;
	k[1] = 20;
	k[2] = 30;
//	k[3] = 40; 
//	System.out.println(k[2]);
	
//	System.out.println(j.length);
	
	//  normal for loop
	for(int m = 0; m < j.length ;m++) {
		System.out.println(j[m]);
	}
	
	// foreach
	for( int n  :  j) {
		System.out.println(n);
	}
	
	
}
}
