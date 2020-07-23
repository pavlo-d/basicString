package com.company;

public class Task8 {

  public static void main(String[] args) {
    // Перевірити чи стрічка є поліндромом.
    String testString1 =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras in nisi bibendum, rutrum felis non, mattis erat.";
    String testString2 = "amma";
    String testString3 = "ama";
    String testString4 = "aa";
    String testString5 = "a";
    System.out.println(testString1 + "==> " + isPalindrome(testString1));
    System.out.println(testString2 + "==> " + isPalindrome(testString2));
    System.out.println(testString3 + "==> " + isPalindrome(testString3));
    System.out.println(testString4 + "==> " + isPalindrome(testString4));
    System.out.println(testString5 + "==> " + isPalindrome(testString5));
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
}
