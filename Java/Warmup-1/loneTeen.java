/*
loneTeen.java
https://codingbat.com/prob/p165701

We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, but not both.

Output:
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/

public boolean loneTeen(int a, int b) {
  //they both teen
  if((a >=13 && a <=19) && (b >=13 && b <=19))
    return false;
  //ether one of them teen
  else if((a >=13 && a <=19) || (b >=13 && b <=19))
    return true;
  else
    //no one is teen
    return false;
}

/*
All Correct:
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
loneTeen(14, 20) → true
loneTeen(20, 15) → true
loneTeen(16, 17) → false
loneTeen(16, 9) → true
loneTeen(16, 18) → false
loneTeen(13, 19) → false
loneTeen(13, 20) → true
loneTeen(6, 18) → true
loneTeen(99, 13) → true
loneTeen(99, 99) → false
*/
