// problem Link: https://practice.geeksforgeeks.org/problems/game-with-nos3123/1



/****
* Approach:
* We just need to traverse the array from index 0 to n-1
* and change
* arr[i] = arr[i] xor arr[i+1]
****/


/****
* Time Complexity: O(N)
* Space Complexity: O(1)
****/


class Complete{
    
   
    // Function for finding maximum and value pair
    // 1011
    // 0001
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        int ans[]=new int[n];
        for (int i=0;i<n-1;i++)
        {
            ans[i]=arr[i]^arr[i+1];
        }
        ans[n-1]=arr[n-1];
        return ans;
    }
    
    
}
