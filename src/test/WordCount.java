package test;

import java.util.HashSet;

class WordCount {
	int countString(String text, boolean word) {
		int count = 0;
		String ary[] = text.split(" ");
		
		if(word == true) {
			HashSet<String> hash = new HashSet<>();
			for(String temp : ary)
				hash.add(temp);
			count = hash.size();
		}
		else
			count = ary.length;
		return count;
	}
}
