/*
everyNth.java
https://codingbat.com/prob/p196441

Given a non-empty string and an int N, return the string made starting with char 0, 
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. 
N is 1 or more.

Output:
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
*/

public String everyNth(String str, int n) {
  String everyNth = "";
  //Iterate over the characters in the string with a step of n
  for(int i=0; i<str.length(); i += n){
    //Append the character at index i to the string
    everyNth += str.charAt(i);
  }
  return everyNth;
}

/*
All Correct:
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
everyNth("Chocolate", 3) → "Cca"
everyNth("Chocolates", 3) → "Ccas"
everyNth("Chocolates", 4) → "Coe"
everyNth("Chocolates", 100) → "C"
*/
