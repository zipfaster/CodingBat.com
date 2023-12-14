/*
diff21.java
https://codingbat.com/prob/p116624

Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21.

Output:
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/

public int diff21(int n) {
  if(n > 21)
    //n is over 21, so return double the absolute difference
    return 2*Math.abs(n-21);
  else
    return Math.abs(n-21);
}

/*
All Correct:
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
diff21(22) → 2
diff21(25) → 8
diff21(30) → 18
diff21(0) → 21
diff21(1) → 20
diff21(2) → 19
diff21(-1) → 22
diff21(-2) → 23
diff21(50) → 58
*/
