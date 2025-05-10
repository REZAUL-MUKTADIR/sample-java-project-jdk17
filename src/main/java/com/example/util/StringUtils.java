package com.example.util;

public class StringUtils {
    public static boolean isBlank(String input) {
        return input == null || input.isBlank();
    }
    
    public static String repeat(String str, int count) {
        return str.repeat(count);
    }
    
    public static String stripIndent(String text) {
        return text.stripIndent();
    }
}