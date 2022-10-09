// Problem Link: https://practice.geeksforgeeks.org/problems/composite-and-prime0359/1

/***
 * Approach: iterate from L to R (both inclusive) and check if a
 * number is prime or not, if it is then I increment count of prime
 * else increment count of composite.
 * and finally subtract them to return result
 */

/***
 * Time Complexity: O(n sqrt(n)) where n=R-L+1
 * Space Complexity: O(1)
 */


class Solution
{
    public static boolean isprime(int n)
    {
        if(n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i=5;i*i<=n;i+=6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    public int Count(int L, int R)
    {
        // code here
        int prime=0,comp=0;
        if(L==1 && R==1){
            return 0;
        }
        if(L==1){
            L=L+1;
        }
        for (int i=L;i<=R;i++)
        {
            if(isprime(i))
            {
               // System.out.println(i);
                prime++;
            }
            else
            {
                comp++;
            }
        }
        return (comp-prime);
    }
}
