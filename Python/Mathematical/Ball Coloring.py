#Problem link:https://practice.geeksforgeeks.org/problems/ball-coloring3450/1

#Time Complexity: O(1)
#Space Complexity: O(1)

class Solution:
    def noOfWays (self, n):
        
        #Pattern between input and output
        #lead me to this formula
        return n*(n-1) + 2
