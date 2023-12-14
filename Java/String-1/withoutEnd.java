/*
withoutEnd.java
https://codingbat.com/prob/p130896

Given a string, return a version without the first and last char, 
so "Hello" yields "ell". The string length will be at least 2.

Output:
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
*/

public String withoutEnd(String str) {
  if(str.length() < 2)
    return str;
  else
    return str.substring(1, str.length() - 1);
}

/*
All Correct:
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
withoutEnd("code") → "od"
withoutEnd("ab") → ""
withoutEnd("Chocolate!") → "hocolate"
withoutEnd("kitten") → "itte"
withoutEnd("woohoo") → "ooho"
*/
