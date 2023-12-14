/*
intMax.java
https://codingbat.com/prob/p101887

Given three int values, a b c, return the largest.

Output:
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
*/

public int intMax(int a, int b, int c) {
  //compare the first pair of integers with the second and store the max in temp
  int temp = Math.max(a, b);
  //if max from first pair is greater than the max from second pair, 
  //then return max from first pair, 
  //otherwise return max from second pair
  return (temp > Math.max(b, c)) ? temp : Math.max(b, c);
}

/*
All Correct:
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
intMax(9, 3, 3) → 9
intMax(3, 9, 3) → 9
intMax(3, 3, 9) → 9
intMax(8, 2, 3) → 8
intMax(-3, -1, -2) → -1
intMax(6, 2, 5) → 6
intMax(5, 6, 2) → 6
intMax(5, 2, 6) → 6
*/
