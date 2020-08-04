package com.company;


public class Task6 {

  public static void main(String[] args) {
    // Написати програму підрахунку голосних і приголосних букв в стрічці.
    String testStr =
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.";

    int vcount = 0;
    int ccount = 0;
    testStr = testStr.toLowerCase();
    for (int i = 0; i < testStr.length(); i++) {
      char ch = testStr.charAt(i);
      if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
        vcount++;
      } else if ((ch >= 'a') && (ch <= 'z')) {
        ccount++;
      }
    }
    System.out.println("Number of Vowels: " + vcount);
    System.out.println("Number of Consonants: " + ccount);
  }
}
