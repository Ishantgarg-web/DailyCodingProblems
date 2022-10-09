// problem Link: https://practice.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1

/***
 * Approach: we need to find minimum number of elements from array
 * such that their sum is greater sum of all other elements from array.
 * 
 * STEP 1: to find minimum number of elements, we need to get maximum elements,
 * so I sort the array
 * 
 * STEP 2: then take three variables-sum, temp1 and count
 * temp1 stores sum of largest elements of array
 * sum stores sum(all other elements of array)
 * count store number of elements that fulfilled this coniditon.
 */


/****
 * Time Complexity: O(N log N)
 * Space Complexity: O(1)
 */




import java.util.Arrays;

class Solution { 
    int minSubset(int[] Arr,int N) { 
        Arrays.sort(Arr);
        long sum=0;
        for (int i=0;i<N;i++){
            sum+=Arr[i];
        }
        sum=sum-Arr[N-1];
        long temp1=Arr[N-1];
        int count=1;
        int i=N-2;
        while(i>=0 && temp1<=sum)
        {
            temp1+=Arr[i];
            sum-=Arr[i];
            count++;
            i--;
        }
        return count;
    }
}