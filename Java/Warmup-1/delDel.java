/*
delDel.java
https://codingbat.com/prob/p100905

Given a string, if the string "del" appears starting at index 1, 
return a string where that "del" has been deleted. Otherwise, return the string unchanged.

Output:
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

public String delDel(String str) {
  if (str.length() >= 4 && str.substring(1, 4).equals("del"))
    return str.substring(0, 1) + str.substring(4);
  else
    return str;
}

/*
All Correct:
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
delDel("abcdel") → "abcdel"
delDel("add") → "add"
delDel("ad") → "ad"
delDel("a") → "a"
delDel("") → ""
delDel("del") → "del"
delDel("adel") → "a"
delDel("aadelbb") → "aadelbb"
*/
