package com.company;


import java.util.Arrays;

public class Task8 {

  public static void main(String[] args) {
    // Перевірити чи стрічка є поліндромом.
    String testString1 =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras in nisi bibendum, rutrum felis non, mattis erat";
    String testString2 = "amma";
    String testString3 = "ama";
    String testString4 = "aa";
    String testString5 = "a";
    System.out.println(testString1 + "==> " + isPalindromes(testString1));
    System.out.println(testString2 + "==> " + isPalindromes(testString2));
    System.out.println(testString3 + "==> " + isPalindromes(testString3));
    System.out.println(testString4 + "==> " + isPalindromes(testString4));
    System.out.println(testString5 + "==> " + isPalindromes(testString5));
  }

  public static boolean isPalindrome(String s) {

    if ((s != null) && (s.length() != 0)) {
      StringBuilder inputString = new StringBuilder();
      inputString.append(s);
      if (s.equals(inputString.reverse().toString())) {
        return true;
      }
    }
    return false;
  }

  public static boolean isPalindromes(String s) {
    if (s.length() == 1) {
      return true;
    } else if (s.length() % 2 == 0) {
      char[] s1 = s.substring(0, s.length() / 2).toCharArray();
      char[] s2 = reverse(s.substring(s.length() / 2).toCharArray());

      return Arrays.equals(s1, s2);
    } else {
      char[] s1 = s.substring(0, s.length() / 2 + 1).toCharArray();
      char[] s2 = reverse(s.substring(s.length() / 2).toCharArray());

      return Arrays.equals(s1, s2);
    }
  }

  private static char[] reverse(char[] array) {
    char[] reversed = new char[array.length];

    int i = array.length - 1;
    int j = 0;

    while (i >= 0) {
      reversed[j] = array[i];
      i--;
      j++;
    }

    return reversed;
  }
}
