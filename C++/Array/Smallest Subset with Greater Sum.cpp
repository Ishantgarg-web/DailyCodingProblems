// problem Link: https://practice.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1

/*
Approach: 
Get the sum of whole vector then 
Sorts the vector in descending order then
traverse the vector and check 
if currentSum < restElementSum then
	currentSum+=Arr[i] 		//currSum Stores the sum of subset
	restElementSum -= Arr[i]		//restElement Stores the sum of other elements
	count++ 				//size of current subset
return count ;
*/

/* 
Time Complexity: O(N log N)
Space Complexity: O(1)
*/

class Solution{
    public:
    int minSubset(vector<int> &Arr, int N){
        sort(Arr.begin(),Arr.end(),greater<int>());
        long long sum =0;
        int count = 0;
        long long MaxSum = 0;
        for(int i =0;i<N;i++){
            sum +=Arr[i];
        }
        for(int i=0;i<N;i++){
            if(MaxSum<=sum){
                MaxSum+=Arr[i];
                sum-=Arr[i];
                count++;
            }
            else{
	break;
            }
        }
        return count;
    }
};