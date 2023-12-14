/*
firstHalf.java
https://codingbat.com/prob/p172267

Given a string of even length, 
return the first half. So the string "WooHoo" yields "Woo".

Output:
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
*/

public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}

/*
All Correct:
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
firstHalf("ab") → "a"
firstHalf("") → ""
firstHalf("0123456789") → "01234"
firstHalf("kitten") → "kit"
*/
