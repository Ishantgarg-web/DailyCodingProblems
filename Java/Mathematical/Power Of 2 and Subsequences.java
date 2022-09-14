import java.util.ArrayList;

// problem link: https://practice.geeksforgeeks.org/problems/power-of-2-and-subsequences0759/1

/****
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */


/*****
 * Approach: product of any two numbers(power of 2) is (2**a)*(2**b)=2**(a+b)
 * it means any subsequence that their numbers product is power of 2 for
 * that, we need onlu power of 2 numbers from given array
 * 
 * after that to find all possible subsequences -> simple Binomial formuala use
 * nc1+nc2+......ncn=2**(n)-1 
 */



class Solution{
    public static boolean ispower(long n){
        return (n != 0) && ((n & (n - 1)) == 0);
    }
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
        long count=0;
        for (int i=0;i<N;i++){
            if(ispower(A.get(i))){
                count++;
            }
        }
        long mod=(long)Math.pow(10,9)+7;
        return (long)(Math.pow(2, count)%mod -1 )%mod;
    }
}
