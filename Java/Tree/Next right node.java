// problem Link: https://practice.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1


/**
* Approach: Similar to Two sum approach, consider two Node pointers ptr1 and ptr2, one pointing at the start and another at the end of the linked list.
Now, traverse through the list and find the sum of the current element pointing at ptr1 and ptr2.

If it is equal to target:
â€‹Insert the data in the resultant pair container
If sum > target:
Move ptr2 to previous
Else
Move ptr1 to next.

***/

/***
* Time Complexity: O(N)
* Space Complexity: O(1)
**/



class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(head==null) return ans;
        Node ptr1=head,ptr2=head;
        while(ptr2.next!=null)
        {
            ptr2=ptr2.next;
        }
        while(ptr1.data<ptr2.data)
        {
            if(ptr1.data+ptr2.data==target)
            {
                ans.add(new ArrayList<Integer>(Arrays.asList(ptr1.data,ptr2.data)));
                ptr1=ptr1.next;
                ptr2=ptr2.prev;
            }
            else if(ptr1.data+ptr2.data>target)
            {
                ptr2=ptr2.prev;
            }
            else
            {
                ptr1=ptr1.next;
            }
        }
        return ans;
    }
}
        
