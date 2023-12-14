/*
backAround.java
https://codingbat.com/prob/p161642

Given a string, take the last char and 
return a new string with the last char added at the front and back, 
so "cat" yields "tcatt". The original string will be length 1 or more.
 
Output:
backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
*/

public String backAround(String str) {
  char end = str.charAt(str.length() -1);
  return end + str + end;
}

/*
All Correct:
backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
backAround("abc") → "cabcc"
backAround("read") → "dreadd"
backAround("boo") → "obooo"
*/
