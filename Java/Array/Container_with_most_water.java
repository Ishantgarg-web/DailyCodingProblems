// problem Link: https://leetcode.com/problems/container-with-most-water/



/****
* Two Approaches are mentioned below --
****/


/****
* BRUTE FORCE --
* Time Complexity: O(N*N)
* Space Complexity: O(1)

* OPTIMAL -- (Two Pointer)
* Time Complexity: O(N)
* Space Complexity: O(1)
****/

public class Container_with_most_water {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println("Brute Force -- O(N^2) --");
        System.out.println(maxAreaBrute(height));
        System.out.println("Two Pointers -- O(N) --");
        System.out.println(maxAreaPointer(height));
    }
//    Two Pointers Approach
    public static int maxAreaPointer(int[] height) {
        int low=0,high=height.length-1;
        int max=0;
        while(low<=high) {
            int area=(high-low)*Math.min(height[low],height[high]);
            if(area>max)
                max=area;
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return max;
    }
//    Brute Force Approach
    public static int maxAreaBrute(int[] height) { //Passed 138/282 Test cases at GFG
        int pillars=height.length;
        int max=0;
        for(int s=0;s<pillars;s++) {
            for(int p=s+1;p<pillars;p++) {
                int area=(p-s)*Math.min(height[p],height[s]);
                if(area>max)
                    max=area;
            }
        }
        return max;
    }
}