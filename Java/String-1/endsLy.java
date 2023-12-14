/*
endsLy.java
https://codingbat.com/prob/p103895

Given a string, return true if it ends in "ly".

Output:
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/

public boolean endsLy(String str) {
  return (str.length() >= 2 && str.substring(str.length()-2).equals("ly"));
}

/*
All Correct:
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
endsLy("oddl") → false
endsLy("olydd") → false
endsLy("ly") → true
endsLy("") → false
endsLy("falsey") → false
endsLy("evenly") → true
*/
