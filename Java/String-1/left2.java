/*
left2.java
https://codingbat.com/prob/p197720

Given a string, return a "rotated left 2" version 
where the first 2 chars are moved to the end. 
The string length will be at least 2.

Output:
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
*/

public String left2(String str) {
  return str.substring(2, str.length()) + str.substring(0,2);
}

/*
All Correct:
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
left2("code") → "deco"
left2("cat") → "tca"
left2("12345") → "34512"
left2("Chocolate") → "ocolateCh"
left2("bricks") → "icksbr"
*/
