package com.nic;

public class NormalizeNum {
	public static String normalizeInput(String input) {
	    // Parse the input as an integer and then convert it back to a string
	    int normalizedValue = Integer.parseInt(input);
	    return String.valueOf(normalizedValue);
	}

	public static void main(String[] args) {
	    String input1 = "100";
	    String input2 = "100";

	    // Normalize inputs
	    System.out.println("Normalized: " + normalizeInput(input1)); // Output: 1
	    System.out.println("Normalized: " + normalizeInput(input2)); // Output: 1
	}
}
