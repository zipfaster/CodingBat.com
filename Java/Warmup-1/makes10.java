/*
makes10.java
https://codingbat.com/prob/p182873

Given 2 ints, a and b, 
return true if one if them is 10 or if their sum is 10.

Output:
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/

public boolean makes10(int a, int b) {
  return (a == 10 || b == 10) || ((a+b)==10);
}

/*
All Correct:
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
makes10(10, 1) → true
makes10(10, 10) → true
makes10(8, 2) → true
makes10(8, 3) → false
makes10(10, 42) → true
makes10(12, -2) → true
*/
