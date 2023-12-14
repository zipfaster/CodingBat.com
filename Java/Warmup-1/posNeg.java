/*
posNeg.java
https://codingbat.com/prob/p159227

Given 2 int values, return true if one is negative and one is positive. 
Except if the parameter "negative" is true, then return true only if both are negative.

Output:
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
*/

public boolean posNeg(int a, int b, boolean negative) {
  if(negative)
    //if the parameter "negative" is true, return true if both are negative.
    return (a<0 && b<0);
  else 
   //return true if one is negative and one is positive.
   return ((a<0 && b>0) || (a>0 && b<0));
}

/*
All Correct:
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
posNeg(-4, -5, false) → false
posNeg(-4, 5, false) → true
posNeg(-4, 5, true) → false
posNeg(1, 1, false) → false	
posNeg(-1, -1, false) → false
posNeg(1, -1, true) → false
posNeg(-1, 1, true) → false
posNeg(1, 1, true) → false
posNeg(-1, -1, true) → true
posNeg(5, -5, false) → true
posNeg(-6, 6, false) → true
posNeg(-5, -6, false) → false
posNeg(-2, -1, false) → false
posNeg(1, 2, false) → false
posNeg(-5, 6, true) → false
posNeg(-5, -5, true) → true
*/
