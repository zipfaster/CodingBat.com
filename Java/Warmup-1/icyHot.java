/*
icyHot.java
https://codingbat.com/prob/p192082

Given two temperatures, return true if one is less than 0 
and the other is greater than 100.

Output:
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
*/

public boolean icyHot(int temp1, int temp2) {
  //condition (temp1 > 100 && temp2 <0) satisfies the problem where: icyHot(120, -1) → true
  return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 <0);
}

/*
All Correct:
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
icyHot(-1, 100) → false
icyHot(-2, -2) → false
icyHot(120, 120) → false	
*/
