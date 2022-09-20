//  Problem Link:  https://practice.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1

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