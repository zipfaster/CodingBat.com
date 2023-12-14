/*
hasTeen.java
https://codingbat.com/prob/p178986

We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 3 int values, return true if 1 or more of them are teen.

Output:
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/

public boolean hasTeen(int a, int b, int c) {
  return (a >=13 && a <=19) || (b >=13 && b <=19) || (c >=13 && c <=19);
}

/*
All Correct:
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
hasTeen(1, 20, 12) → false
hasTeen(19, 20, 12) → true
hasTeen(12, 20, 19) → true
hasTeen(12, 9, 20) → false
hasTeen(12, 18, 20) → true
hasTeen(14, 2, 20) → true
hasTeen(4, 2, 20) → false
hasTeen(11, 22, 22) → false
*/
