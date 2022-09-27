import java.util.PriorityQueue;

// problem Link: https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1


/***
 * Approach:
 * Minimum cost come when we merging elements first two most smaller elements
 * than larger than that and so on
 * 
 * So, that's why I use here PriorityQueue that gives me smallest element and 
 * update Queue in only O(log n) time.
 */

/***
 * Time Complexity: O(nlog n)
 * Space Complexity: O(n)
 * 
 */



class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for (int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        long ans=0;
        while(pq.size()>=2)
        {
            long x=pq.poll(),y=pq.poll();
            ans+=(x+y);
            pq.add(x+y);
        }
        return ans;
    }
}