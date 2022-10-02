# Problem link:- https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0

##Time Complexity: O(N)
## Auxiliary Space: O(1)

def largest( arr, n):
    l=arr[0]

    for i in arr:

        if i > l:

            l= i

    return l