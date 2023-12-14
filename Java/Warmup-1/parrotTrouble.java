/*
parrotTrouble.java
https://codingbat.com/prob/p140449

We have a loud talking parrot. 
The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return true if we are in trouble.

Output:
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
*/

public boolean parrotTrouble(boolean talking, int hour) {
  return talking && (hour < 7 || hour > 20);
}

/*
All Correct:
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
parrotTrouble(true, 21) → true
parrotTrouble(false, 21) → false
parrotTrouble(false, 20) → false
parrotTrouble(true, 23) → true
parrotTrouble(false, 23) → false
parrotTrouble(true, 20) → false
parrotTrouble(false, 12) → false
*/
