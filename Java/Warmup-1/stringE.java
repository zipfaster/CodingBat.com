/*
stringE.java
https://codingbat.com/prob/p173784

Return true if the given string contains between 1 and 3 'e' chars.

Output:
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

public boolean stringE(String str) {
  int count = 0;
  for(int i=0; i<str.length(); i++){
    //count the amount of "e" in the string
    if(str.charAt(i) == 'e')
      count++;
  }
  //if count "e" in the range of 1 through 3, return true
  return (count >= 1 && count <= 3);
}

/*
All Correct:
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
stringE("Hll") → false
stringE("e") → true
stringE("") → false
*/
