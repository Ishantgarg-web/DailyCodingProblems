// problem Link: https://practice.geeksforgeeks.org/problems/count-occurences-of-a-given-word-in-a-2-d-array/1

/****
 * Approach: we are going through one by one each element of given 2d matrix.
 * if any element is matches with target string first character,
 * it means we run DFS for making target word with this starting character
 * of 2d array. and if word is possible then we increment count
 * 
 * Total function:
 * 1. isValid: confirms that particular index is inside in 2d array.
 * 2. isDFS: use DFS Approach to make word by using characters of 2d array.
 * 3. findOccurrence: check for starting character of target string and increment
 * count if is possible to make word.
 */


/****
 * Time Complexity: O(R*C*2*(2*len)), Where len is length of target String.
 * Space Complexity: O(1)
 */


class Solution
{
    static int dx[]={1,0,-1,0};
    static int dy[]={0,1,0,-1};
    static int count=0;
    public static boolean isValid(int n,int m,int i,int j){
        if(i<0 || j<0 || i>=n || j>=m){
            return false;
        }
        return true;
    }
    public static void isDFS(char mat[][],int i,int j,int n,int m,
    String target,int idx){
        if(idx==target.length()){
            count++;
            return;
        }
        for (int p=0;p<4;p++){
            int X=dx[p]+i;
            int Y=dy[p]+j;
            if(isValid(n,m,X,Y) && mat[X][Y]==target.charAt(idx)){
                char temp=mat[i][j];
                mat[i][j]='*';
                isDFS(mat,X,Y,n,m,target,idx+1);
                mat[i][j]=temp;
            }
        }
    }
    public int findOccurrence(char mat[][], String target)
    {
        // Write your code here
        //int count=0;
        count=0;
        int n=mat.length,m=mat[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(mat[i][j]==target.charAt(0)){
                    //boolean visited[][]=new boolean[n][m];
                    isDFS(mat,i,j,n,m,target,1);
                }
            }
        }
        return count;
    }
}
