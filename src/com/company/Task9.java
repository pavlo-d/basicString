package com.company;


public class Task9 {

  public static void main(String[] args) {
    // Знайти всі слова промарковані хештегами в тексті, вивести на екран кожне слово і скільки
    // разів воно зустрічається. Наприклад для "This is #hashtag." -> "hashtag - 1".
    String testStr =
        "#Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras in nisi bibendum, rutrum felis non, mattis erat #a #aa #aaa #a #aa #d";

    String inputStr = testStr.toLowerCase();
    // get words from string
    String inputStr1 = inputStr.replaceAll("^[^#]", "");
    String[] words = inputStr.split("^#|(\\W+)");
    int hashIterator = 0;
    String[] hashTags = new String[0];
    int countHashtags = 0;

    for (int i = 0; i < words.length; i++) {
      char ch = words[i].charAt(0);
      if (ch == '#') {
        countHashtags = 1;
        for (int j = i + 1; j < words.length; j++) {
          if (words[i].equals(words[j])) {
            words[j] = "";
            countHashtags++;
          }
          ;
        }
        System.out.println(words[i] + " ==> " + countHashtags);
      }
    }
  }
}
