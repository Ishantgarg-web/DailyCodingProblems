//Problem Link: https://practice.geeksforgeeks.org/problems/fitting-the-array1514/1

/*
Time Complexity: O(N*log(N))
Space Complexity: O(1)
*/

/*
Approach: 
Count = No. of elemnt which satisfy the given condition
n = Size od an array

Step 1: Sort both the array.
Step 2: Check b[i]>=a[i] (Assign the minimum element of array A[] to the minimun element of array b[]) if it is true then increment count by 1. If this condition fail at any indeex then return false.
Step 3: Check count==n if true return 1, else return 0 ;
*/

class Solution{
public:    
    bool isFit(int arr[], int brr[], int n){
        int count =0 ;
        sort(arr,arr+n) ;
        sort(brr,brr+n) ;
        for(int i=0;i<n;i++) {
            if(brr[i]>=arr[i])
                count++ ;
            else 
                return 0 ;
        }
        if(count==n){
            return 1;
        }
        return 0;
    }
};