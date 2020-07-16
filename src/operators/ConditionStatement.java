package operators;

public class ConditionStatement {
	public static void main(String[] args) {
		int age = 30;


		//  Ternary operator

		String ageGroup = age<18 ? "Child" : ((age>=18 && age <=30)?"adult":"uncle");

		// < 18 = child
		// > 18 and  < 30 = adult
		// > 30 and <45 = uncle
		// > 45 = old


		if(age < 18) {
			ageGroup = "Child";
		}else if(age >=18 && age <= 30) {
			ageGroup = "Adult";
		}else if(age >= 30 && age <=45) {
			ageGroup = "uncle";
		}else {
			ageGroup = "old";
		}

		System.out.println("For "+age+ " , age Group is " + ageGroup);

		//		switch case

		//	country = "INDIA" , IND, india, India

		// java 1.7 - in switch , string values as input 
		
		String coun = "";
		String countryName = "AFG";
		switch(countryName) {
		case "INDIA":
		case "India":
		case "IND":
		case "india":
			coun  = "Country is India";
			break;
		case "PAK":
		case "PAKISTAN":
		case "Pak":
			coun  = "Country is Pakistan";
			break;
		default: 
			coun = "Country not mention";
			break;
		}

		System.out.println(coun);

	}
}
