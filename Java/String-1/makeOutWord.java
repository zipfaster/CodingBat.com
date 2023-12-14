/*
makeOutWord.java
https://codingbat.com/prob/p184030

Given an "out" string length 4, such as "<<>>", and a word, 
return a new string where the word is in the middle of the out string, 
e.g. "<<word>>". 
Note: use str.substring(i, j) to extract the String starting at index i 
and going up to but not including index j.

Output:
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
*/

public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2,4);
}

/*
All Correct:
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
makeOutWord("HHoo", "Hello") → "HHHellooo"
makeOutWord("abyz", "YAY") → "abYAYyz"
*/
