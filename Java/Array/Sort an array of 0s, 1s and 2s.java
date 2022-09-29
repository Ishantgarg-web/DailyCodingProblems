// problem link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

// Feedback link: https://forms.gle/vTZdatUtKFWCNr5v6


/****
 * Approach:
 * Method 1: Simply sort the array using pre-defined library
 * Method-2: Count no. of zeroes, ones and twos
 * and then put in array according to their count.
 */


/****
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */


class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int c1=0,c2=0,c3=0;
        for (int i=0;i<n;i++)
        {
            if(a[i]==0) c1++;
            else if(a[i]==1) c2++;
            else c3++;
        }
        int i=0;
        while(c1-->0) a[i++]=0;
        while(c2-->0) a[i++]=1;
        while(c3-->0) a[i++]=2;
    }
}
