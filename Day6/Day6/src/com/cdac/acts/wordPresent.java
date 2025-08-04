package com.cdac.acts; 

public class wordPresent {

    public static boolean isWordPresent(String text, String word) {
        if (text == null || word == null || word.isEmpty()) {
            return false;
        }

        char[] textChars = text.toCharArray();
        char[] wordChars = word.toCharArray();
        int textLength = textChars.length;
        int wordLength = wordChars.length;

        for (int i = 0; i <= textLength - wordLength; i++) {
            boolean found = true;
            for (int j = 0; j < wordLength; j++) {
                if (textChars[i + j] != wordChars[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                // Check for word boundaries (space before and after, or start/end of string)
                boolean prefixBoundary = (i == 0) || (i > 0 && textChars[i - 1] == ' ');
                boolean suffixBoundary = (i + wordLength == textLength) || (i + wordLength < textLength && textChars[i + wordLength] == ' ');

                if (prefixBoundary && suffixBoundary) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "This is a sample string to check if a word is present here.";
        String word1 = "sample";
        String word2 = "is";
        String word3 = "present";
        String word4 = "not";
        String word5 = "string to";
        String word6 = "This";
        String word7 = "here.";
        String word8 = "a "; // Should not be found as a whole word

        System.out.println("\"" + word1 + "\" present in \"" + str + "\": " + isWordPresent(str, word1)); // true
        System.out.println("\"" + word2 + "\" present in \"" + str + "\": " + isWordPresent(str, word2)); // true
        System.out.println("\"" + word3 + "\" present in \"" + str + "\": " + isWordPresent(str, word3)); // true
        System.out.println("\"" + word4 + "\" present in \"" + str + "\": " + isWordPresent(str, word4)); // false
        System.out.println("\"" + word5 + "\" present in \"" + str + "\": " + isWordPresent(str, word5)); // true
        System.out.println("\"" + word6 + "\" present in \"" + str + "\": " + isWordPresent(str, word6)); // true
        System.out.println("\"" + word7 + "\" present in \"" + str + "\": " + isWordPresent(str, word7)); // true
        System.out.println("\"" + word8 + "\" present in \"" + str + "\": " + isWordPresent(str, word8)); // false
    }
}