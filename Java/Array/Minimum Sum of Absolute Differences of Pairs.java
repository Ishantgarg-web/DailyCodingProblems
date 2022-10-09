import java.util.Arrays;

//  Problem Link:  https://practice.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1


/***
 * Time Complexity: O(N*log(N))
 * Space Complexity: O(1)
 */
class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
        long minSum=0;
        for (int i=0;i<N;i++)
        {
            minSum+=(long)Math.abs(A[i]-B[i]);
        }
        return minSum;
    }
}
