package com.company;

public class Task1 {

  public static void main(String[] args) {
    // Вивести на екран символи-дублікати та вказати їх кількість (наприклад в "Java" є
    // 2 дублікати - "а")
    String testStr = "aaabbc123456 ttt w w";
    char[] alphabet = {
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
      't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    int[] alphabetCounter = new int[27];
    for (int i = 0; i < alphabetCounter.length; i++) {
      alphabetCounter[i] = 0;
    }

    if ((testStr != null) && (testStr.length() != 0)) {
      for (int i = 0; i < testStr.length(); i++) {
        for (int j = 0; j < alphabet.length; j++) {
          if (testStr.charAt(i) == alphabet[j]) {
            alphabetCounter[j]++;
          }
        }
      }
    }

    for (int i = 0; i < alphabetCounter.length; i++) {
      if (alphabetCounter[i] > 1) {
        System.out.println(alphabet[i] + " ==> " + alphabetCounter[i]);
      }
    }
  }
}
