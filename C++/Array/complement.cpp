// Problem Link : https://practice.geeksforgeeks.org/problems/complement3911/1

// TimeComplexity : O(n)
// SpaceComplexity : O(1)

/*
Approach :
    1. Convert the given string into -1(1 -> -1) and 1(0 -> +1) and store it in another array
    2. Now we use Kadane's Algo to find the maximum sum subarray in an array.
    3. Update the left index when currentSum is negative and
    4. the right index when currentSum is greate than maxSum.
    5. While updating right index, also update ans array with updated value of left and right indexes.
*/ 

class Solution{
public:
    vector<int> findRange(string str, int n) {
        // code here
        vector<int> ans ;       //store indexes(left, right)
        //0 -> +1
        //1 -> -1
        vector<int> arr(n) ;    //vector which stores -1 in place of 1 and 1 in place of 0
        
        bool flag = true ;      //used to check string with all 1
        for(int i=0;i<n;i++){
            if(str[i]=='0'){
                arr[i] = 1 ;    //0 -> 1 ... gain of 1
                flag = false ;  
            }
            else{
                arr[i]=-1 ;     //1 -> 0 ... loss of 1
            }
        }
        if (flag) {             // If string with no 0 then return -1 
            ans.resize(0) ;
            ans.push_back(-1) ;
            return ans ;        
        }
        
        int currentSum =0, maxSum =0, left=0, right=0 ;
        ans.resize(2) ;
        
        // Kadane Alogorithm
        for(int i=0;i<n;i++){
            currentSum += arr[i] ;
                
            if(currentSum>maxSum){      // When currentSum > maxSum then we update
                maxSum = currentSum ;   // maxSum 
                right = i ;             // right index
                ans[0] = left+1 ;       // store left index in ans
                ans[1] = right+1 ;      // store right index in ans
            }
            if(currentSum < 0){         // When currentSum < 0 then we left that subarray and update 
                currentSum =0 ;         // currentSum with 0 and 
                left = i+1 ;            // left index
            }
        }
        
        return ans ;
        
    }
};