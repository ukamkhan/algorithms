package common;

import java.util.HashMap;
import java.util.Set;

public class AlgorithmContainer {
	
	/** 
	 * Determine if given string is a Palindrome
	 * 
	 * @param given
	 * @return true if yes, else false
	 */
	public static Boolean isPalindrome(String given){
		if(given == null){
			return null;
		}
		if(given.length() == 0){
			return null;
		}
		
		int beg = 0;
		int end = given.length() - 1;
		
		boolean isPalindrome = false;
		
		while(end > beg){
			if(given.charAt(beg) == given.charAt(end)){
				isPalindrome = true;
				beg++;
				end--;
			} else {
				return new Boolean(false);
			}
		}
			
		return new Boolean(isPalindrome) ;
	}
	
	/**
	 * Get first non repeating character
	 * 
	 * @param arr given string
	 * @return first non repeating character
	 */
	public static char getNonRepIndexOrChar(String arr){
		
 		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 		// create signature
 		for(char c: arr.toCharArray()){
 			if(!map.containsKey(c)){
 				map.put(c, new Integer(1));
 			} 
 			else {
 				int count = map.get(c);
 				map.put(c, count + 1);
 			}
 		}
		Character nonrep = null;
		Set<Character> keys = map.keySet();
		// but we want the index in the original array or string . 
		for(Character key: keys){
			int count = map.get(key);
			if( count == 1) {
				nonrep = key;
				break;
			}
		}
		
		return nonrep;
	}


}
