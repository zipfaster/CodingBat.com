/*
withouEnd2.java
https://codingbat.com/prob/p174254

Given a string, return a version without both the first and last char of the string. 
The string may be any length, including 0.

Output:
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
*/

public String withouEnd2(String str) {
  return (str.length() > 1) ? (str.substring(1,str.length()-1)) : "";
}

/*
All Correct:
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
withouEnd2("a") → ""
withouEnd2("") → ""
withouEnd2("coldy") → "old"
withouEnd2("java code") → "ava cod"
*/
