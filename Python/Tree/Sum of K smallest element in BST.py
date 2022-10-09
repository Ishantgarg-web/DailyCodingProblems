#Problem link:https://practice.geeksforgeeks.org/problems/sum-of-k-smallest-elements-in-bst3029/1

### Time Complexity O(k)
### Space Complexity O(1)

#Inorder traversal of the BST 
#Gives the values in ascending order
def order(root, s):
    if not root:
        return
    order(root.left, s)
    s.append(root.key)
    order(root.right, s)
    
    
    
def summ(root, k):
    s=[]
    order(root, s)
    return sum(s[:k])
