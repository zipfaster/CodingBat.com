/*
max1020.java
https://codingbat.com/prob/p177372

Given 2 positive int values, 
return the larger value that is in the range 10..20 inclusive, 
or return 0 if neither is in that range.

Output:
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
*/

public int max1020(int a, int b) {
  if((a>=10 && a<=20) && (b>=10 && b<=20))
    return Math.max(a,b);
  else if(a>=10 && a<=20)
    return a;
  else if(b>=10 && b<=20)
    return b;
  else
    return 0;
}

/*
All Correct:
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
max1020(9, 21) → 0
max1020(10, 21) → 10
max1020(21, 10) → 10
max1020(9, 11) → 11
max1020(23, 10) → 10
max1020(20, 10) → 20
max1020(7, 20) → 20
max1020(17, 16) → 17
*/
