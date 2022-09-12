#problem link:https://practice.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1


### Time Complexity O(N*log(N))
### Space Complexity O(1)

class Solution:
    def findMinSum(self, A,B,N):
        
        #Sort arrays in ascending order
        A.sort()
        B.sort()
        
        #initializing sum
        sum = 0
        
        #Adding the absolute difference to the sum
        #Arrays are sorted in ascending order 
        #and that impplies we get the minimum 
        #possible sum by comparing elements 
        #located on the same position
        for i in range(N):
            sum = sum + abs(A[i] - B[i])
            
        
        return sum
