package challenge;
//return the positions of 2 the elements that their sum results in the target value
public class Sum2 {
	public static void main (String args[]) {
		var target = 5;
		int[] numbers = {25, 20, 3, 25, 15, 30, 2};
		print((solution(numbers, target)));
	}
	
	public static int[] solution(int[] numbers, int target){
		for (int i=0; i<numbers.length-1; i++) {
			for (int y=i+1; y<numbers.length; y++) {
				if (numbers[i]+numbers[y]==target) {
					return new int[] {i,y};
				}
			}
		}
		return null;
	}
	public static void print(int[] numbers) {
		if (numbers==null)
			System.out.println("no solution");
		else
			for (int number : numbers)
				System.out.print(number + " ");
	}
}
//O(n2)
