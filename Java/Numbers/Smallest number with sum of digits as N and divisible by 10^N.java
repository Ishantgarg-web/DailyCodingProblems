// Problem Link: https://practice.geeksforgeeks.org/problems/smallest-number-with-sum-of-digits-as-n-and-divisible-by-10n4032/1


/***
 * Approach: need to find smallest number= sumOfDigits(N) and divisble by (10^N)
 * 1. Any number that is divisible by N, should be have N zeroes.
 * 2. if any number that can be written with sumOfDigits,
 * while (N>9) N=N-9 and add "9"
 * and then, add that N. this will surely create a smallest number
 */

class Solution
{
    public String digitsNum(int N)
    {
        // Code here
        String s="";
        for (int i=0;i<N;i++){
            s=s+"0";
        }
        while(N>0){
            int temp=0;
            if(N>9){
                s="9"+s;
                temp=9;
            }else{
                s=N+s;
                temp=N;
            }
            N=N-temp;
        }
        return s;
    }
}