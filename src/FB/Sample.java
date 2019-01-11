package FB;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(3);
		num.add(5);
		num.add(2, 6);
		
		System.out.println(num);
	
	ArrayList<Integer> number = new ArrayList<Integer>(num);
	
	ArrayList<Integer> num1 = new ArrayList<Integer>();
	num1.add(1);
	num1.add(2);
	num1.add(3);
	num1.add(9);
	System.out.println(num1);
	number.addAll(num1);
	number.retainAll(num1);
	//Collections.reverse(number);
	System.out.println(number);

//	ArrayList<Integer> number1 = new ArrayList<Integer>(number);
//	
//	ArrayList<Integer> num2 = new ArrayList<Integer>();
//	num2.add(11);
//	num2.add(12);
//	System.out.println(num2);
//	
//	number1.addAll(num2);
//	System.out.println(number1);
	
//	number1.retainAll(num2);
//	System.out.println(number1);
}


	
}
