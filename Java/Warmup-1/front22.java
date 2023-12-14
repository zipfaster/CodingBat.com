/*
front22.java
https://codingbat.com/prob/p183592
 
Given a string, take the first 2 chars and 
return the string with the 2 chars added at both the front and back, 
so "kitten" yields"kikittenki". 
If the string length is less than 2, use whatever chars are there.

Output:
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
*/

public String front22(String str) {
  String twoChar = "";
  if(str.length() < 2)
    twoChar = str;
  else
    twoChar = str.substring(0,2);
    
  return twoChar + str + twoChar;
}

/*
All Correct:
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
front22("ab") → "ababab"
front22("a") → "aaa"
front22("") → ""
front22("Logic") → "LoLogicLo"
*/
