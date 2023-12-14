/*
in3050.java
https://codingbat.com/prob/p132134

Given 2 int values, return true if they are both in the range 30..40 inclusive, 
or they are both in the range 40..50 inclusive.

Output:
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
*/

public boolean in3050(int a, int b) {
  return ((a>=30 && a<=40) && (b>=30 && b<=40)) || ((a>=40 && a<=50) && (b>=40 && b<=50));
}

/*
All Correct:
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
in3050(40, 51) → false
in3050(39, 50) → false
in3050(50, 39) → false
in3050(40, 39) → true
in3050(49, 48) → true
in3050(50, 40) → true
in3050(50, 51) → false
in3050(35, 36) → true
in3050(35, 45) → false
*/
