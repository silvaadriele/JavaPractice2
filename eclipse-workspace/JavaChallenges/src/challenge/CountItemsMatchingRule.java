package challenge;

import java.util.HashMap;
import java.util.List;

// ruleKey == "type" and ruleValue == typei
// ruleKey == "color" and ruleValue == colori
//ruleKey == "name" and ruleValue == namei
//it should return how much match the value provided
public class CountItemsMatchingRule {
	public static void main (String args[]) {
		
		
		}
	final static HashMap<String, Integer> dict = new HashMap<String, Integer>(){{
		put ("type", 0);
		put ("color", 1);
		put ("name", 2);
	}};
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		int indexList = dict.get(ruleKey);
		for (List list: items) {
			if (list.get(indexList).equals(ruleValue))
				count++;
		}
		return count;
	}
}
//O(n)	
