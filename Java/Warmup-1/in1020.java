/*
in1020.java
https://codingbat.com/prob/p144535

Given 2 int values, 
return true if either of them is in the range 10..20 inclusive.

Output:
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/

public boolean in1020(int a, int b) {
  return (a >=10 && a <=20) || (b >=10 && b <=20);
}

/*
All Correct:
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
in1020(99, 10) → true
in1020(20, 20) → true
in1020(21, 21) → false
in1020(9, 9) → false
*/
