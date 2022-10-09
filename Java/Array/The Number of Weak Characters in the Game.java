// problem Link: https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/

/****

Approach: sort the array in decreasing order of attacks and 
in increasing order of defence.

Finally, check if value of defence is less than or not of current_max_defense value

 */


/***

Time Complexity: O(N logN)
Space Complexity: O(1)

 */


class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        int max=0,count=0;
        Arrays.sort(arr, (a,b) -> (b[0]==a[0])?a[1]-b[1]:b[0]-a[0]);
        for (int i=0;i<arr.length;i++){
            if(arr[i][1]<max){
                count++;
            }
            max=(int)Math.max(max,arr[i][1]);
        }
        return count;
    }
}