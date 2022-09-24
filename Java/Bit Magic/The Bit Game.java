// Problem Link: https://practice.geeksforgeeks.org/problems/the-bit-game2313/1

/***
 * Approach: Finding number of ones in binary format of N.
 * if number of ones are odd -> it means always Player 1 wins
 * otherwise, Player 2 wins
 */


/***
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */



class Solution {
    public static int swapBitGame(long N) {
        // code here
        int x=0;
        while(N>0)
        {
            if(N%2==1){
                x++;
            }
            N=N/2;
        }
        return (x%2==1)?1:2;
    }
}