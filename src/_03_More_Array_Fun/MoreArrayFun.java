package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[] array= {"hello","Im awesome"};
		//printStrings(array);
		//reverseOrder(array);
		//odd(array);
		random(array);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	static void printStrings(String[] stringArray) {
		for(int i=0;i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
		
	}
	
	 //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	static void reverseOrder(String[] stringArray) {
		for(int i=stringArray.length-1;i>=0;i--) {
			System.out.println(stringArray[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	static void odd(String[] stringArray) {
		for(int i=0;i<stringArray.length;i++) {
			if(i%2==0) {
				System.out.println(stringArray[i]);
			}
			else {
				System.out.println("");
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	static void random(String[] stringArray) {
		for(int i=0;i<stringArray.length;i++) {
			Random r= new Random();
			int random= r.nextInt(stringArray.length);
			System.out.println(stringArray[random]);
		}
		
	}
	
}
