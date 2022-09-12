#problem link:https://practice.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1


### Time Complexity O(N*log(N))
### Space Complexity O(1)

class Solution:
    def findMinSum(self, A,B,N):
        
        #Sort arrays
        A.sort()
        B.sort()
        
        sum = 0
        
        for i in range(N):
            sum = sum + abs(A[i] - B[i])
            
        
        return sum
