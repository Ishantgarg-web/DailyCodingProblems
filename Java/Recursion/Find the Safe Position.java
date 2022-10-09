import java.util.ArrayList;
import java.util.List;

// problem link: https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1



/***
 * Approach: The simple approach is to create a list and 
 * add all values from 1 to N to it. 
 * Create a recursive function that takes a list, 
 * start (position at which counting will start), 
 * and k ( number of people to be skipped) as an argument. 
 * If the size of the list is one i.e. only one person left 
 * then return this position. Otherwise, 
 * start counting the k person in a clockwise direction from 
 * starting position and remove the person at the kth position. 
 * Now the person at the kth position is removed 
 * and now counting will start from this position. 
 * This process continues till only one person is left.


 */


/***
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

class Solution {
    public static int fun(List<Integer> al,int k,int index)
    {
        if(al.size()==1){
            return al.get(0);
        }
        index=((index+k)%al.size());
        al.remove(index);
        return fun(al,k,index);
    }
    static int safePos(int n, int k) {
        // code here
        List<Integer> al=new ArrayList<>();
        for (int i=1;i<=n;i++){
            al.add(i);
        }
        return fun(al,k-1,0);
    }
};