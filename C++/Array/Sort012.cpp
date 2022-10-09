// Problem link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

/*
Approach: 
------------------
Initialize three variable:
1. Low : Use for 0
2. mid : Use for 1
3. High: Use for 2
------------------
Initally, Low and mid points to 0th index and High points to (N-1)th index.
If arr[mid]==0 then swap(arr[mid],arr[low]) and increment low and mid by 1 index.
If arr[mid]==1 then increment mid by 1 index.
If arr[mid]==2 then swap(arr[mid],arr[high]) and 
decrement high by one index.
*/


/*
Time Complexity: O(N)
Space Complexity: O(1)
*/


{
    public:
    void sort012(int arr[], int n)
    {
        // code here
        int low=0, mid=0, high=n-1 ;
        while(mid<=high){
            switch(arr[mid]){
                case 0: 
                    swap(arr[mid++],arr[low++]) ;
                    break ;
                case 1: 
                    mid++ ;
                    break ;
                case 2 :
                    swap(arr[mid],arr[high--]) ;
                    break ;
            }
        }
    }
    
};