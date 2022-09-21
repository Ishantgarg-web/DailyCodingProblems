// problem Link: https://practice.geeksforgeeks.org/problems/license-key-formatting/1


/****
 * Approach: First convert string to uppercase
 * and then replace all "-" to ""
 * then find no_of_groups_formed -> if it is less than 1 return formatted string
 * else add new group to it with '-' character.
 */

/****
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

class Solution{
    static String ReFormatString(String s, int k){
        // code here
        if(s.charAt(0)=='-' && s.length()==1){
            return "";
        }
        String ans=s.toUpperCase();
        ans=ans.replaceAll("-","");
        int n=ans.length();
        int no_of_gps_formed=n/k;
        if(no_of_gps_formed<1){
            return ans;
        }
        int x=n%k;
       String res="";
       res=ans.substring(0,x);
       
        for (int i=x;i<=n-k;i+=k)
        {
            if(i!=0)
                res=res+"-";
            res=res+ans.substring(i,i+k);
        }
        return res;
    }
}
