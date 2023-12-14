/*
nonStart.java
https://codingbat.com/prob/p143825

Given 2 strings, return their concatenation, except omit the first char of each. 
The strings will be at least length 1.

Output:
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/

public String nonStart(String a, String b) {
  return a.substring(1, a.length()) + b.substring(1, b.length());
}

/*
All Correct:
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
nonStart("ab", "xy") → "by"
nonStart("ab", "x") → "b"
nonStart("x", "ac") → "c"
nonStart("a", "x") → ""
nonStart("kit", "kat") → "itat"
nonStart("mart", "dart") → "artart"
*/
