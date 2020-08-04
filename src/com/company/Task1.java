package com.company;

public class Task1 {

  public static void main(String[] args) {
    // Вивести на екран символи-дублікати та вказати їх кількість (наприклад в "Java" є
    // 2 дублікати - "а")
    String testStr = "aaabbc123456 ttt w w ??  !@#$%^ !@#$% !@#$%";

    int[] duplicatesCounters = new int[256];
    for (int i = 0; i < duplicatesCounters.length; i++) {
      duplicatesCounters[i] = 0;
    }

    if ((testStr != null) && (testStr.length() != 0)) {
      for (int i = 0; i < testStr.length(); i++) {
        duplicatesCounters[testStr.charAt(i)] = duplicatesCounters[testStr.charAt(i)] + 1;
      }
    }
    for (int i = 0; i < duplicatesCounters.length; i++) {
      char ch = (char) i;
      if (duplicatesCounters[i] > 1) {
        System.out.println(ch + " " + duplicatesCounters[i]);
      }
    }
  }
}
