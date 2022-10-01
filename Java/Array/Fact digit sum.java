// problem Link: https://practice.geeksforgeeks.org/problems/fact-digit-sum4125/1



/****
* Approach: Use bigger digits first, then reverse the list.
****/


/****
* Time Complexity: O(X)
* Space Complexity: O(X)
****/


class Solution
{
    ArrayList<Integer> FactDigit(int n)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int arr[]={1,1,2,6,24,120,720,5040,40320,362880};
        int i=9;
        while(n!=0)
        {
            int x=n/arr[i];
            while(x-->0){
                ans.add(0,i);
            }
            n=n%arr[i];
            i--;
        }
        return ans;
    }
}