package pack1;

import java.util.ArrayList;
import java.util.List;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> mobile = new ArrayList<>();
	
		
		mobile.add("Samsung");
		mobile.add("Apple");
		mobile.add("Motorola");
		mobile.add("Samsung");
		mobile.add("Xiaomi");
		mobile.add("LG");
		mobile.add("Blackberry");
		mobile.add("Lenovo");
		mobile.add("Samsung");
		
		
		System.out.println("Original: " + mobile);
		
		for (int i = 0; i < mobile.size()/2; i++) 
			if (mobile.get(i).equals("Samsung")) {
				mobile.set(i, "LALALA");
			}
		
		System.out.println("Replaced in first part: " + mobile);
		
}
}
	
