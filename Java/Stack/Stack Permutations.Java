// Problem Link: https://practice.geeksforgeeks.org/problems/stack-permutations/1

/****
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

class Solution {
    public static int isStackPermutation(int n, int[] A, int[] B) {
        // code here

        /**
         * Approach: add elements to stack till you
         * don't found matched element with B's array element
         * if it is found check for furhter elements
         * Base Condition: j<n && i<n && stack must be empty
         */
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        while(j<n)
        {
            if(i<n || st.isEmpty()){
                st.push(A[i]);
                i++;
            }
            while(st.isEmpty()==false && st.peek()==B[j]){
                st.pop();
                j++;
            }
            if(i==n) break;
        }
        return (st.isEmpty() && j==n)?1:0;
    }
}