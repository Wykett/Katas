package com.wykett.katas;

import java.util.ArrayList;
import java.util.List;

public class BackspacesInStringKata {
	public String cleanString(String s) {

		StringBuilder resultStrBuilder = new StringBuilder();
		List<Character> resultAsList = new ArrayList<Character>();
		int charAdded = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != '#') {
				resultStrBuilder.append(s.charAt(i));
				resultAsList.add(s.charAt(i));
				charAdded++;
			} else {
				if (!resultAsList.isEmpty()) {
					resultAsList.remove(charAdded - 1);
					charAdded--;
				}
			}
		}
		String result = "";
		for (int i = 0; i < charAdded; i++) {
			result += resultAsList.get(i);
		}
		return result;
	}
}