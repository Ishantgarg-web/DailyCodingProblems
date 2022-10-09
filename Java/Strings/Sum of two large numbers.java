// problem Link: https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1



/****
* Approach:
* Traverse both strings from the end, one by one add digits and keep track of carry.
****/


/****
* Time Complexity: O(|X|)+O(|Y|)
* Space Complexity: O(1)
****/


class Solution {
    String findSum(String X, String Y) {
        // code here
        while(X.length()<Y.length()){
            X="0"+X;
        }
        while(Y.length()<X.length()){
            Y="0"+Y;
        }
        String ans="";
        int n=X.length()-1,sum=0,carry=0;
        while(n>=0){
            //System.out.println("n = "+n);
            int t1=X.charAt(n)-'0';
            int t2=Y.charAt(n)-'0';
            sum=(t1+t2+carry)%10;
            carry=(t1+t2+carry)/10;
            ans=sum+ans;
            n-=1;
        }
        if(carry!=0){
            ans=carry+ans;
        }
        int i=0;
        String fans="";
        while(i<ans.length()){
            if(ans.charAt(i)=='0'){
                i++;
            }else{
                break;
            }
        }
        fans=ans.substring(i);
        return (fans.length()==0?"0":fans);
    }
}
