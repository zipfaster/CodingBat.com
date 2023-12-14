/*
middleTwo.java
https://codingbat.com/prob/p137729

Given a string of even length, return a string made of the middle two chars, 
so the string "string" yields "ri". The string length will be at least 2.

Output:
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/

public String middleTwo(String str) {
  return str.substring(str.length()/2-1,str.length()/2+1);
}

/*
All Correct:
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
middleTwo("ab") → "ab"
middleTwo("0123456789") → "45"	
*/
