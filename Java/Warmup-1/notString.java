/*
notString.java
https://codingbat.com/prob/p191914

Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", 
return the string unchanged. Note: use .equals() to compare 2 strings.

Output:
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/

public String notString(String str) {
  if(str.startsWith("not"))
    //return the string unchanged
    return str;
  else
    //return a new string where "not " has been added to the front.
    return "not " + str;
}

/*
All Correct:
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
notString("bad") → "not bad"
notString("not") → "not"
notString("is not") → "not is not"
notString("no") → "not no"
*/
