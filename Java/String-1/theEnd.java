/*
theEnd.java
https://codingbat.com/prob/p162477

Given a string, return a string length 1 from its front, 
unless front is false, in which case return a string length 1 from its back. 
The string will be non-empty.

Output:
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
*/

public String theEnd(String str, boolean front) {
  return (front) ? str.substring(0,1) : str.substring(str.length()-1);
}

/*
All Correct:
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
theEnd("oh", false) → "h"
theEnd("x", true) → "x"
theEnd("x", false) → "x"
theEnd("java", true) → "j"
theEnd("chocolate", false) → "e"
theEnd("1234", true) → "1"
theEnd("code", false) → "e"
*/
