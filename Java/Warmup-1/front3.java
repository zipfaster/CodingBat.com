/*
front3.java
https://codingbat.com/prob/p136351

Given a string, we'll say that the front is the first 3 chars of the string. 
If the string length is less than 3, the front is whatever is there. 
Return a new string which is 3 copies of the front.

Output:
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/

public String front3(String str) {
  String front;
  if (str.length() >= 3) {
    //save the first three characters
    front = str.substring(0, 3);
  }
  else {
    //the string length is less than 3, front is whatever is there
    front = str;
  }
  //Return a new string which is 3 copies of the front
  return front + front + front;
}

/*
All Correct:
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
front3("abcXYZ") → "abcabcabc"
front3("ab") → "ababab"
front3("a") → "aaa"
front3("") → ""
*/
