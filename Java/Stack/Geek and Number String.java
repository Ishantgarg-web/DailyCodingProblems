import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// Problem Link: https://practice.geeksforgeeks.org/problems/904237fa926d79126d42c437802b04287ea9d1c8/1


/****
 * Approach:
 * First make an arraylist that stores all strings need to check if it is present
 * or not in original string
 * 
 * Step 2: Make a stack because here we want to check for 2 consecutive c
 * characters.
 * 
 * Step 3: First i check is stack size is greater than or equal to 2 then
 * I pop out topmost 2 characters and check if they are present in ArrayList
 * or not
 * 
 * Step 4: if they, it means remove both elements(that i already did)
 * or else put them again into stack.
 */


/****
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */


class Solution { 
    public int minLength(String s, int n) { 
    	// code here 
    	ArrayList<String> al=new ArrayList<>();
    	al.addAll(Arrays.asList("12","21","34","43","56","65","78","87","09","90"));
    	int i=0;
    	//int n=s.length();
    	if(n==1){
    	    return n;
    	}
    	Stack<Character> st=new Stack<>();
    	while(i<n)
    	{
    	    st.push(s.charAt(i));
    	    if(st.size()>=2)
    	    {
    	        char c1=st.peek();
    	        st.pop();
    	        char c2=st.peek();
    	        st.pop();
    	        String temp=""+c1+c2;
    	        if(al.contains(temp)==false)
    	        {
    	            st.push(c2);
    	            st.push(c1);
    	        }
    	    }
    	    i++;
    	}
    	return st.size();
    }
}