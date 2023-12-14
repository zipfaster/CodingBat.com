/*
right2.java
https://codingbat.com/prob/p130781

Given a string, return a "rotated right 2" version 
where the last 2 chars are moved to the start. 
The string length will be at least 2.

Output:
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
*/

public String right2(String str) {
  return str.substring(str.length()-2) + str.substring(0, str.length()-2);
}

/*
All Correct:
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
right2("code") → "deco"
right2("cat") → "atc"
right2("12345") → "45123"	
*/
