/*
sumDouble.java
https://codingbat.com/prob/p154485

Given two int values, return their sum. Unless the two values are the same, then return double their sum.

Output:
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/

public int sumDouble(int a, int b) {
  if(a == b)
    //the two values are the same, return double their sum
    return (a+b)*2;
  else
    return (a+b);
}

/*
All Correct:
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
sumDouble(-1, 0) → -1
sumDouble(3, 3) → 12
sumDouble(0, 0) → 0
sumDouble(0, 1) → 1
sumDouble(3, 4) → 7
*/
