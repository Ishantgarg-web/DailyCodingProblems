//  Problem Link:  https://practice.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1

/*
Approach: 
Step 1: Sorts the both vector individually
Step 2: Traverse a vector using for loop upto N
Step 3: Calculate the absolute value between the values present at index i
Step 4: Add calculated value to a variable
Step 5: When loops end return absolute sum 
*/

/*
Time Complexity: O(N*log(N))
Space Complexity: O(1)
 */


class Solution{
public:
    long long findMinSum(vector<int> &A,vector<int> &B,int N){
        sort(A.begin(),A.end()) ; 
        sort(B.begin(),B.end()) ;
        long long r ;
        for(int i=0;i<N;i++)
        {
           r+=(abs(A[i]-B[i])) ;
        }
        
        return abs(r) ;
    }
};
