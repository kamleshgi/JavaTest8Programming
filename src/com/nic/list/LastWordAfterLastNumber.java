package com.nic.list;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastWordAfterLastNumber {

	public static void main(String[] args) {
		String str = "3four2seven1eight4nine";

        // Regex to match numbers followed by words
        Pattern pattern = Pattern.compile("\\d([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(str);

        String lastWord = "";

        // Iterate through all matches and store the last word found
        while (matcher.find()) {
            lastWord = matcher.group(1); // Capture the word after the number
        }

        System.out.println(lastWord); // Output: nine
    }

	}

