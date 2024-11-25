package challenge;

import java.util.HashMap;
import java.util.Map;

//return the positions of 2 the elements that their sum results in the target value USING HASHMAP
public class Sum {
	public static void main (String args[]) {
		int target = 8;
		int[] numbers = {1, 2, 6, 10, 14};
		print(sum(target, numbers));
	}
	public static int[] sum(int target, int[] numbers) {
		Map<Integer, Integer> complements = new HashMap<>();
		for (int i=0; i<numbers.length; i++) {
			Integer complementIndex = complements.get(numbers[i]);
			if (complementIndex != null)
				return new int[] {i, complementIndex};
			complements.put(target - numbers[i], i);
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
