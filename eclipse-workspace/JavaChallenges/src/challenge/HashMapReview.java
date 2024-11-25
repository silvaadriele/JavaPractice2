package challenge;
import java.util.HashMap;

public class HashMapReview {
	public static void main (String args[]) {
		//first is the key and second is the value
		HashMap<Integer, String> cars = new HashMap<Integer, String>();
		//get method use the key as value and returns the key
		cars.get(1);
		cars.values(); //return a collection os strings
		cars.put(5, "civic");
		cars.put(2, "city");
		cars.put(4, "fit");
		cars.put(3, "jetta");
		cars.put(6, "hrv");
		
		System.out.println(cars);
		cars.remove(5);
		//cars.clear(); remove all the values/keys
		System.out.println(cars.get(2));
		for (String c: cars.values()) {
			System.out.println(c);
		}
		
	}
}
