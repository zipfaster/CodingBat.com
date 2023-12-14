/*
endUp.java
https://codingbat.com/prob/p125268

Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. 
Note that str.toUpperCase() returns the uppercase version of a string.

Output:
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
*/

public String endUp(String str) {
  if(str.length() < 3)
    return str.toUpperCase();
  //first part of string without the last 3 characters + last 3 characters in the upper case
  return (str.substring(0, str.length() - 3)) + str.substring(str.length() - 3).toUpperCase();
}

/*
All Correct:
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
endUp("woo hoo") → "woo HOO"
endUp("xyz12") → "xyZ12"
endUp("x") → "X"
endUp("") → ""
*/
