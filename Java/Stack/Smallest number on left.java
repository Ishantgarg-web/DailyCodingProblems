import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Problem Link: https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1


/***
 * Approach:
 * - need to find smaller element on left side
 * first element of array have no element on left side -> -1
 * and for other elements, we iterate through array
 * and if any smaller element found out, this element can be ans for furthur element
 * So, to track these all, I use Stack here.
 */


/***
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */


class Solution{
    static List<Integer> leftSmaller(int n, int arr[])
    {
        //code here
        List<Integer> ans=new ArrayList<>();
        ans.add(-1);
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        for (int i=1;i<n;i++)
        {
            if(st.isEmpty())
            {
                ans.add(-1);
            }
            else
            {
                while(st.isEmpty()==false && st.peek()>=arr[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    ans.add(-1);
                }
                else
                {
                    ans.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}