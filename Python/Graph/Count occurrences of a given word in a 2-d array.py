#Problem link:https://practice.geeksforgeeks.org/problems/count-occurences-of-a-given-word-in-a-2-d-array/1

#Time Complexity: O(R*C*2^(2*len)) where len is the length of the target string
#Space Compleity: O(1)
class Solution:
    
    def dfs(self,array,target,i,j,idx):
        count = 0
        #if the elements has the correct boundaries
        #and equals the character from the target string
        if(i>=0 and j>=0 and i<len(array) and j<len(array[0]) and array[i][j] == target[idx]):
            #if character found in target
            #add a star to mark it 
            array[i][j] = '*'
    
            if(idx == len(target)-1):
                count = 1
            else: #go in each possible direction
                  #North, South, East, West
                  #to look for the next character
                  #from the target string
                count += Solution().dfs(array,target,i+1,j,idx+1)
                count += Solution().dfs(array,target,i-1,j,idx+1)
                count += Solution().dfs(array,target,i,j+1,idx+1)
                count += Solution().dfs(array,target,i,j-1,idx+1)
            
            #After the recursion is done
            #put the character back in the matrix
            array[i][j] = target[idx]
        return count
    
    
    def findOccurrence(self,mat,target):
        
        occurences=0
        n = len(mat)
        m = len(mat[0])
        for i in range(n):
            for j in range(m):
                #looking for occurences starting
                #from each position
                occurences += Solution().dfs(mat,target,i,j,0)       
        
        return occurences
