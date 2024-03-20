package com.array;

public class Firstpalindrome {
	public class Main {
	    public static void main(String[] args) {
	        String[] words = {"abc", "bcd", "aba", "cfg", "madam"};
	        String firstPalindrome = findFirstPalindrome(words);
	        System.out.println("First palindrome string: " + firstPalindrome);
	    }

	    public static String findFirstPalindrome(String[] words) {
	        for (String word : words) {
	            if (isPalindrome(word)) {
	                return word;
	            }
	        }
	        return null;
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	}

}
