/*
extraEnd.java
https://codingbat.com/prob/p108853

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
The string length will be at least 2.

Output:
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
*/

public String extraEnd(String str) {
  return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
}

/*
All Correct:
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
extraEnd("Candy") → "dydydy"
extraEnd("Code") → "dedede"
*/
