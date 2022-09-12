#Problem Link: https://practice.geeksforgeeks.org/problems/stack-permutations/1

###  Time complexity: O(N)
###  Space complexity: O(N)

from typing import List
class Solution:
    def isStackPermutation(self, N : int, A : List[int], B : List[int]) -> int:
        
        # we will be appending elements from input array to stack until top of our stack
        # matches with first element of output array
        s = []
         
        j = 0
     
        for i in range(N):
     
            s.append(A[i])
             
            # if our stack isn't empty and top matches with output array
            # then we will keep popping out from stack until top matches with
            # output array
            while(len(s) > 0 and s[- 1] == B[j]):
                s.pop()
                 
                j += 1
             
         
        # if output array was a correct permutation of input array then
        # by now our stack should be empty
        if(len(s)  == 0):
            return 1
            
        return 0
