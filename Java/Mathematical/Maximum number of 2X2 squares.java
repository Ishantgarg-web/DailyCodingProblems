//Problem Link: https://practice.geeksforgeeks.org/problems/maximum-number-of-22-squares/1

/*****
 * Approach: no. of maximum squares that can come in base of triangle is x=(base/2)-1;
 * and the total squares come in triangle is (1+2+3...+x)=x*(x+1)/2
 */


/****
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */


class Solution
{
    public static long numberOfSquares(long base)
    {
        //code here
        long x=(base/2)-1;
        return x*(x+1)/2;
    }
}