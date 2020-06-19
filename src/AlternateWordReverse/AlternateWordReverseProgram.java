package AlternateWordReverse;

import java.util.ArrayList;
import java.util.List;

public class AlternateWordReverseProgram {

	public static void main(String[] args) {
		String sSentence = "Welcome to Java World saurabh gupta";
		System.out.println(sSentence);
		List<String> words = splitWords(sSentence);
		for (int i = 0; i < words.size(); i++) {
			if (i % 2 != 0) {
				words.set(i, reverse(words.get(i)));
			}
		}

		for (String string : words) {
			System.out.print(string + " ");
		}

	}

	static int getLength(String str) {
		str = str + '\0';
		char[] cstr = str.toCharArray();
		int i = 0;

		while (cstr[i] != 0) {
			i++;
		}

		return i;
	}

	public static List<String> splitWords(String str) {
		str = str + '\0';
		char[] cstr = str.toCharArray();
		ArrayList<String> words = new ArrayList<>();
		for (int j = 0, i = 0; j < getLength(str) + 1; j++) {
			if (cstr[j] == ' ' || cstr[j] == '\0') {
				words.add("");
				while (i < j) {
					int iElement = words.size() - 1;
					words.set(iElement, words.get(iElement) + cstr[i]);
					i++;
				}
				i = j + 1;

			}
		}
		return words;
	}

	public static String reverse(String str) {
		char[] cstr = str.toCharArray();
		ArrayList<String> revStr = new ArrayList<>();
		revStr.add("");
		for (int i = getLength(str) - 1; i >= 0; i--) {
			revStr.set(0, revStr.get(0) + cstr[i]);
		}
		str = revStr.get(0);

		return str;
	}

}
