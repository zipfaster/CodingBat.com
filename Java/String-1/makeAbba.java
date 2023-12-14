/*
makeAbba.java
https://codingbat.com/prob/p161056

Given two strings, a and b, 
return the result of putting them together in the order abba, 
e.g. "Hi" and "Bye" returns "HiByeByeHi".

Output:
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
*/

public String makeAbba(String a, String b) {
  return a + b + b + a;
}

/*
All Correct:
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
makeAbba("aaa", "bbb") → "aaabbbbbbaaa"
makeAbba("x", "y") → "xyyx"
makeAbba("x", "") → "xx"
makeAbba("", "y") → "yy"
makeAbba("Bo", "Ya") → "BoYaYaBo"
makeAbba("Ya", "Ya") → "YaYaYaYa"
*/
