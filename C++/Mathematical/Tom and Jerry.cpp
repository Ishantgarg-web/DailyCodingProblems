//Problem Link : https://practice.geeksforgeeks.org/problems/tom-and-jerry1325/1

/*
Time Complexity: O(1)
Space Complexity: O(1)
*/

/*
Approach:
If N is even(N%2==0) then Toms wins
If N is Odd(N%2!=0) then Jerry wins
*/

class Solution {
    public:
        int numsGame(int N) {
            return (N%2==0?1:0) ;
        }
};
