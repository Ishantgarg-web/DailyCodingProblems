import java.util.Arrays;

// Problem Link: https://practice.geeksforgeeks.org/problems/fitting-the-array1514/1


/***
 * Approach: we have to rearrange elements such that all array arr elements
 * fits in brr array.
 * For this, I sort both arrays in ascending order and check them.
 */

/***
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */



class Solution{
    
   
    // Function for finding maximum and value pair
    public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i=0;i<n;i++)
        {
            if(arr[i]>brr[i])
            {
                return false;
            }
        }
        return true;
    }
    
}
