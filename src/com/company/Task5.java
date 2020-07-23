package com.company;

public class Task5 {

  public static void main(String[] args) {
    // Перевірити чи стрічка складається лише з чисел.

    String[] testStrings = {"aaabbc123456 ttt w w", "1234", "123.123", "123e+10"};

    String regexDigits = "[0-9]+";

    for (int i = 0; i < testStrings.length; i++) {

      System.out.println(testStrings[i] + " ==> " + testStrings[i].matches(regexDigits));
    }
  }
}
