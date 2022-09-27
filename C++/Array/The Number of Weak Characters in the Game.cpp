// problem Link: https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/

/*
Approach:
Sort the properties by the first element attack in descending order.
then we need to handle the second element only i.e defense.
Now Iterate through the back and use a variable (maxTillNow) to store the maximum defense we saw till now.
If at any point the current defense is smaller than the maxTillNow it means that we have a property with both attack and defense greater than the current property so we can increase our result else we just update our maxTillNow.
*/

/*
Time Complexity: O(NlogN)
Space Complexity: O(1)
*/


class Solution {
public:
    static bool compare(vector<int> &a,vector<int> &b){
        if(a[0]!=b[0])
            return a[0]>b[0];
        return a[1]<b[1];
    }
    int numberOfWeakCharacters(vector<vector<int>>& properties) {
        sort(properties.begin(),properties.end(),compare);
        int maxTillNow = INT_MIN;
        int result=0;
        for(auto p:properties){
            if(maxTillNow>p[1]) result++;
            else maxTillNow=p[1];
        }
        return resilt;
    }
};