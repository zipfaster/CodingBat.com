/*
close10.java
https://codingbat.com/prob/p172021

Given 2 int values, return whichever value is nearest to the value 10, 
or return 0 in the event of a tie. 
Note that Math.abs(n) returns the absolute value of a number.

Output:
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/

public int close10(int a, int b) {
  if(Math.abs(a-10) < Math.abs(b-10))
    return a;
  else if(Math.abs(b-10) < Math.abs(a-10))
    return b;
  else
    return 0;
}

/*
All Correct:
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
close10(7, 13) → 0
close10(9, 13) → 9
close10(13, 8) → 8
close10(10, 12) → 10
close10(11, 10) → 10
close10(5, 21) → 5
close10(0, 20) → 0
close10(10, 10) → 0
*/
