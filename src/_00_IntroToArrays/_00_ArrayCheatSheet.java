package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int smallestNum;
	static int largestNum;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] myArray= new String [5]; 
		//2. print the third element in the array
		System.out.println(myArray[2]);
		//3. set the third element to a different value
		myArray[2]="jessica";
		//4. print the third element again
		System.out.println(myArray[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i=0;i<myArray.length;i++) {
			myArray[i]="hello";
			System.out.println(myArray[i]);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
		//ia=int array
		int[] ia= new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i=0;i<ia.length;i++) {
			Random r= new Random();
			ia[i]=r.nextInt(1000);
			//System.out.println(ia[i]);
		}
		
		//9. without printing the entire array, print only the smallest number on the array
		smallestNum=ia[0];
		for(int i=0;i<ia.length;i++) {
			if(ia[i]<smallestNum) {
				smallestNum=ia[i];
			}
		}
		System.out.println(smallestNum);
		
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		largestNum=ia[0];
		for(int i=0;i<ia.length;i++) {
			if(ia[i]>largestNum) {
				largestNum=ia[i];
			}
		}
		System.out.println(largestNum);
		//12. print only the last element in the array
		System.out.println(ia[49]);
	}
}
