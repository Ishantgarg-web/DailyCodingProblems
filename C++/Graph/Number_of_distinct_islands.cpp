//Problem Link : https://practice.geeksforgeeks.org/problems/number-of-distinct-islands/1

/*
Time Complexity: O(N*M)
Space Complexity: O(N*M)
*/

/*
Approach:
1. Make a set of vectors to count the number of distinct islands
2. Loop over grid and for each unvisited cell call a dfs from that cell and passed the vector of pairs into dfs to store coordinate islands.
3. Inside Dfs:
   1. Mark the current cell as visited
   2. Push the modified cell into the vector
   3. Call the Dfs for neighbor cells.
4. Push the vector from dfs into the set.
5. After the loop end, return the size of the set.
*/

class Solution {
  public:
    void dfs(int r,int c,vector<vector<int>> &visited, vector<vector<int>> &grid, vector<pair<int,int>> &vec, int r0,int c0){
        visited[r][c] = 1;
        vec.push_back({r - r0, c - c0});

        int row[] = {-1,0,1,0};
        int col[] = {0,-1,0,1};
        for(int i = 0; i<4; i++){
            int nrow = r + row[i];
            int ncol = c + col[i];

            if(grid[nrow][ncol] == 1 && !visited[nrow][ncol]){
                dfs(nrow,ncol,visited,grid,vec,r0,c0);
            }
        }
    }

    int countDistinctIslands(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> visited(n,vector<int>(m,0));
        set<vector<pair<int,int>>> st;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    vector<pair<int,int>> vec;
                    dfs(i,j,visited,grid,vec,i,j);
                    st.insert(vec);
                }
            }
        }
        return st.size();
    }
};