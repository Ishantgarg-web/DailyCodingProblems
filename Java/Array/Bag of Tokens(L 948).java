// problem Link: https://leetcode.com/problems/bag-of-tokens/

/****
 * Approach: need to return maximum possible score
 * we gain score when our power is greater than tokens[i]
 * and can loose score if our power is less
 * 
 * first we sort array
 * and then iterate through tokens array, if our power is greater
 * than tokens[i], it means we can gain score by lossing ouw power.
 * 
 * but if our power is less than tokens[i], it means we can gain power by
 * tokens[i] that have more value.
 */


/****
 * Time Complexity: O(N logN), N=length of tokens array
 * Space Complexity: O(1)
 */


import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int res = 0, points = 0, i = 0, j = tokens.length - 1;
        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i++];
                res = Math.max(res, ++points);
            } else if (points > 0) {
                points--;
                power += tokens[j--];
            } else {
                break;
            }
        }
        return res;
    }
}