package loops;

public class JumpStatementCondition {
	public static void main(String[] args) {
		
		
		// searching  5 , when it will find 5 , then loop will close
		// when it found 5 , it will skip it
		
		
//		break cannot be used outside of a loop or a switch
//		continue cannot be used outside of a loop
		
		
		for(int i = 0; i < 10 ;i++) {
			if(i ==5) {
				break;
			}
			sayhello(i);
		}
		
		System.out.println("hey bro. you are out of loop");
		
	}

	public static void sayhello(int value) {
		System.out.println(value  + " saying hello");
	}

}
