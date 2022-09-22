/*https://leetcode.com/problems/reverse-words-in-a-string-iii/ */

/*Approach: 
An integer i keeps record index of reversed words ;
An integer j is used to traverse over a string s;
If we found space(" ") in s then reverse the string from (i)th index to (j)th index;
Update (i)th index every time after reverse;
At last reverse the last word ;
*/


class Solution {
public:
    string reverseWords(string s) {
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            if(s[j]==' ')
            {
                reverse(s.begin()+i,s.begin()+j);
                i=j+1;
            }
        }
        
        reverse(s.begin()+i,s.end());
        return s;
    }
};