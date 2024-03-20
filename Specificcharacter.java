package com.array;
import java.util.ArrayList;
import java.util.List;

public class Specificcharacter {

	public class Main {
	    public static void main(String[] args) {
	        String[] words = {"abc", "bcd", "aaaa", "cbc"};
	        char x = 'a';
	        int[] indices = findWordsContainingCharacter(words, x);
	        printIndices(indices);
	    }

	    public static int[] findWordsContainingCharacter(String[] words, char x) {
	        List<Integer> indicesList = new ArrayList<>();
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].indexOf(x) != -1) {
	                indicesList.add(i);
	            }
	        }
	        return convertListToArray(indicesList);
	    }

	    public static void printIndices(int[] indices) {
	        System.out.print("Output: [");
	        for (int i = 0; i < indices.length; i++) {
	            System.out.print(indices[i]);
	            if (i < indices.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }

	    public static int[] convertListToArray(List<Integer> list) {
	        int[] array = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            array[i] = list.get(i);
	        }
	        return array;
	    }
	}


}
