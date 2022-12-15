//Problem Link : https://practice.geeksforgeeks.org/problems/balanced-string1627/1

/*
Time Complexity : O(N) 
Space Complexity : O(1)
*/

/*
Approach :
    1. When N>=26
        a. Repeat N/26 times 26 alphabets in your ans
        b. Now fill remaining length of your ans (N - N/26) now goto step 2
           beause now remaining length is smaller than N.
    2. When N<26
        a. If N is even then 
            append first N/2 and last N/2 alpabets in ans.
        b. If N is odd then
            calculate SumOfDigit of N and 
                If sod is even then 
                    append first (N%26 + 1)/2 and last (N%26 - 1)/2 alphabets in ans
                If sod is odd then 
                    append first (N%26 - 1)/2 and last (N%26 + 1)/2 alphabets in ans
*/
class Solution {
  public:
  
    int SOD(int N){             // Calculate SumOfDigits
        int sum=0 ;
        while(N>0){
            sum += N%10 ;
            N /= 10 ;
        }
        return sum ;
    }

    string BalancedString(int N) {

        string ans = "" ;                                   //Empty string to store ans
        string allCh = "abcdefghijklmnopqrstuvwxyz" ;       //string of all alphabets
        
        int allChTimes = N/26 ;                             //Calculate repeating time of 26 alphabets
        int r = N%26 ;                                      //Calculate the remaining length after repeating alphabets
        
        while(allChTimes--){                                //Run only when N>26
            ans.append(allCh) ;                             //Append aplhabets(repeating 26 alphabets)
        }
        
        // Now fill remaining length
        if(N%2==0){                                         //If N is even 
            int a = 97 ;
            for(int i=0;i<r/2;i++){                         
                ans = ans + char(a);                        //Concatenate first (N%26)/2 aplhabets
                a++ ;
            }
            a = 123-r/2 ;
            for(int i=26-r/2;i<26;i++){                     
                ans = ans + char(a) ;                       //Concatenate last (N%26)/2 aplhabets
                a++ ;
            }
        }
        
        else{                                               //If N is odd
            
            int sod = SOD(N) ;                              //Calculate SumOfDigits
            
            if(sod%2 ==0){                                  //If SumOfDigits is even
                int a = 97 ;
                for(int i=0;i<(r+1)/2;i++){
                    ans = ans + char(a) ;                   //Concatenate first (N%26 + 1)/2 aplhabets
                    a++ ;
                }
                a = 123 - (r+1)/2 + 1;
                for(int i=26-(r-1)/2;i<26;i++){
                    ans = ans + char(a) ;                   //Concatenate last (N%26 - 1)/2 aplhabets
                    a++ ;
                }
            }
            else{                                           //If SumOfDigits is odd
                int a = 97 ;
                for(int i=0;i<(r-1)/2;i++){
                    ans = ans + char(a) ;                   //Concatenate first (N%26 - 1)/2 aplhabets
                    a++ ;
                }
                a = 123 - (r+1)/2 ;
                for(int i=26-(r+1)/2;i<26;i++){
                    ans = ans + char(a) ;                   //Concatenate last (N%26 + 1)/2 aplhabets
                    a++ ;
                }
            }
        }
        return ans;                                         //return ans 
    }
};