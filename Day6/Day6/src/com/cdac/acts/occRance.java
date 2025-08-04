package com.cdac.acts; // Assuming you want to keep the same package

public class occRance {

    public static int countWordOccurrences(String text, String word) {
        if (text == null || word == null || word.isEmpty()) {
            return 0;
        }

        char[] textChars = text.toCharArray();
        char[] wordChars = word.toCharArray();
        int textLength = textChars.length;
        int wordLength = wordChars.length;
        int count = 0;

        for (int i = 0; i <= textLength - wordLength; i++) {
            boolean found = true;
            for (int j = 0; j < wordLength; j++) {
                if (textChars[i + j] != wordChars[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                // Check for word boundaries
                boolean prefixBoundary = (i == 0) || (i > 0 && textChars[i - 1] == ' ');
                boolean suffixBoundary = (i + wordLength == textLength) || (i + wordLength < textLength && textChars[i + wordLength] == ' ');

                if (prefixBoundary && suffixBoundary) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "This is a sample string. This string has the word this multiple times. this is it.";
        String word1 = "this";
        String word2 = "string";
        String word3 = "is";
        String word4 = "not";
        String word5 = "This";

        System.out.println("Occurrence of \"" + word1 + "\" in \"" + str + "\": " + countWordOccurrences(str, word1)); // Expected: 2 (case-sensitive)
        System.out.println("Occurrence of \"" + word2 + "\" in \"" + str + "\": " + countWordOccurrences(str, word2)); // Expected: 2
        System.out.println("Occurrence of \"" + word3 + "\" in \"" + str + "\": " + countWordOccurrences(str, word3)); // Expected: 2
        System.out.println("Occurrence of \"" + word4 + "\" in \"" + str + "\": " + countWordOccurrences(str, word4)); // Expected: 0
        System.out.println("Occurrence of \"" + word5 + "\" in \"" + str + "\": " + countWordOccurrences(str, word5)); // Expected: 2 (case-sensitive)
    }
}