// problem Link: https://practice.geeksforgeeks.org/problems/ball-coloring3450/1

/***
 * 
 * Approach 1: RED ball can be touched atmost 2 positions to BLUE ball
 * So, choices are:
 * 0-touched position: only 2 ways for n balls (RRRR..., BBBBB.....)
 * 1-touched position: RRRRB,BBBBR -> (n-1)*2 ways
 * 2-touced position: RBR, BRB -> (n-1)*(n-2) ways
 * 
 * 
 * Approach 2: see pattern between input and ouput
 */


/***
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */


class Solution {
    static long noOfWays(long n){
        // code here
        return n*(n-1)+2;
    }
}
