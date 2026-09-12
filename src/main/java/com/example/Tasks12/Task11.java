package com.example.Tasks12;

@FunctionalInterface
interface StringFormatter {
    String format(String input);
}

public class Task11 {

    static String applyFormat(String text, StringFormatter formatter) {
      return formatter.format(text);
    }

    public static void main(String[] args) {
        StringFormatter prefix = string -> ">>> " + string;
        StringFormatter toUpperCase = string -> string.toUpperCase();
        StringFormatter reverse = string ->  new StringBuilder(string).reverse().toString();

        System.out.println(prefix.format("Java"));
        System.out.println(toUpperCase.format("Java"));
        System.out.println(reverse.format("Java"));
    }
}
