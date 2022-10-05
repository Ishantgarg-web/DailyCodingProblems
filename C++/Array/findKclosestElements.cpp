//Problem Link : https://leetcode.com/problems/find-k-closest-elements/

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
vector<int> findClosestElements(vector<int>& A, int k, int x) {
        int l = 0, r = A.size() - k;
        while (l < r) {
            int middle = (left + right) / 2;
            if (x - A[middle] > A[middle + k] - x)
            {
                l = middle + 1;
            }
            else
            {
                r = middle;
            }
        }
        return vector<int>(A.begin() + l, A.begin() + l + k);
    }
