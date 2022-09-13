#Problem link:https://practice.geeksforgeeks.org/problems/smallest-number-with-sum-of-digits-as-n-and-divisible-by-10n4032/1

#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution:
	def digitsNum(self, N):
	    
      #to store the final number
	    s=""
	    
      #for a number to be divisible
      #by 10^N, it needs at least N zeroes
      #at the end of the number, to be
      #the smallest it needs exactly N
	    for i in range(N):
	        s = s + "0"
        
        while N > 0:
            temp = 0
          
            #We insert 9 at the start of number
            #until the sum doesn't exceed N
            if N > 9:
                s = "9" + s
                temp = 9
            #if any remainder left, add it
            #at the beginning of the number to
            #make it the smallest
            else:
                s = str(N) + s
                temp = N

            N = N - temp
            
        return s
