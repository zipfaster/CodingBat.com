/*
startHi.java
https://codingbat.com/prob/p191022

Given a string, return true if the string starts with "hi" and false otherwise.

Output:
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
*/

public boolean startHi(String str) {
  return (str.startsWith("hi")) ? true : false;
}

/*
All Correct:
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
startHi("he") → false
startHi("h") → false
startHi("") → false
startHi("ho hi") → false
startHi("hi ho") → true
*/
