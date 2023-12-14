/*
startOz.java
https://codingbat.com/prob/p199720

Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' 
and include the second only if it is 'z', so "ozymandias" yields "oz".

Output:
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/

public String startOz(String str) {
  //str has at least 2 characters & first character is 'o' and second one is 'z'
  if(str.length() >= 2 && str.substring(0, 1).equals("o") && str.substring(1, 2).equals("z"))
    return "oz";
  //if the first character is 'o'
  else if(str.length() >= 1 && str.substring(0, 1).equals("o"))
    return "o";
  //if the second character is 'z'
  else if(str.length() >= 2 && str.substring(1, 2).equals("z"))
    return "z";
  //return an empty string if none of the conditions are met
  else
    return "";
}

/*
All Correct:
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
startOz("oz") → "oz"
startOz("ounce") → "o"
startOz("o") → "o"
startOz("abc") → ""
startOz("") → ""
startOz("zoo") → ""
startOz("aztec") → "z"
startOz("zzzz") → "z"
startOz("oznic") → "oz"
*/
