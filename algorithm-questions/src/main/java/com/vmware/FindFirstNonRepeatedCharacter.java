package com.vmware;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by bangchuanliu on 6/9/16.
 */
public class FindFirstNonRepeatedCharacter {


	public Character findChar(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}

		HashSet<Character> repeatedChars = new HashSet<>();
		TreeSet<Character> nonRepeatedChars = new TreeSet<>();

		for (int i = 0; i < str.length(); i++) {
			if (repeatedChars.contains(str.charAt(i))) {
				continue;
			}

			if (nonRepeatedChars.contains(str.charAt(i))) {
				nonRepeatedChars.remove(str.charAt(i));
				repeatedChars.add(str.charAt(i));
			} else {
				nonRepeatedChars.add(str.charAt(i));
			}
		}

		return nonRepeatedChars.isEmpty()? null : nonRepeatedChars.iterator().next();
	}

	public static void main(String[] args) {
		FindFirstNonRepeatedCharacter instance = new FindFirstNonRepeatedCharacter();
		System.out.println(instance.findChar("abca"));
		System.out.println(instance.findChar("abc"));
		System.out.println(instance.findChar("aaa"));
		System.out.println(instance.findChar("aab"));
	}
}
