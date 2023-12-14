/*
frontBack.java
https://codingbat.com/prob/p123384

Given a string, return a new string where the first 
and last chars have been exchanged.

Output:
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

public String frontBack(String str) {
  if(str.length() <=1)
    return str;
  char front = str.charAt(0);
  char end = str.charAt(str.length() - 1);
  
  return end + str.substring(1, str.length() - 1) + front;
}

/*
All Correct:
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
frontBack("abc") → "cba"
frontBack("") → ""
frontBack("Chocolate") → "ehocolatC"
frontBack("aavJ") → "Java"
frontBack("hello") → "oellh"
*/
