package oops;

public class HumanDemo {
public static void main(String[] args) {
	Human swp = new Human();
	swp.name = "Vaibhav";
	swp.age  = 30;
	swp.speak("Hello guys", "content1");
	
	
	Human swp1 = new Human();
	swp1.name ="Swapnika";
	swp1.speak("We are good.", "content2");
	
	
	// we can create as many object of a class
	
	// Memory management  - what is Heap? 
}
}



class Human{
	
	String name;  
	int age = 10;
	
	public void speak(String content, String content1) {
		System.out.println(name +age + " is saying " + content);
	}
}
