package challenge;
//Description:
//Write a function that receives a number and an array of integers.
//See if the difference between a pair of numbers of that array equals to that number
 
//For example: { difference: 5, array: [1,5,9], result: false }{ difference: 5, array: [8,6,3], result: true }
 

public class Difference {
	
	public static void main (String args[]) {
		var difference = -10;
		int[] numbers = {50, 20, -30};
		System.out.println(testCase(numbers, difference));
	}
	
	public static boolean testCase(int numbers[], int difference) {
		difference = Math.abs(difference);
		for (int i=0; i<numbers.length-1; i++) {
			for (int y=i+1; y<numbers.length; y++) {
				if (Math.abs(numbers[i]-numbers[y])==difference) {
					return true;
				}
			}
		}
		return false;
	}
}
//Complexity: O(N2);
