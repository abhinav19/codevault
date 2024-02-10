package com.vault;

/**
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once. 
 * Example 1: 
 * Input: s = "anagram", t = "nagaram" 
 * Output: true
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		char charS[] = s.toCharArray();
		char charT[] = t.toCharArray();

		int flag = 0;
		if (charS.length == charT.length) {
			for (int i = 0; i < charS.length; i++) {
				for (int j = 0; j < charT.length; j++) { // Complexity n^2
					if (charS[i] == charT[j]) {
						flag++;
					}
					if (flag == charS.length)
						return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]) {
		System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
	}

}
