#Problem link:https://practice.geeksforgeeks.org/problems/bst-to-max-heap/1

#Time Complexity: O(N)
#Space Complexity: O(N)
class Solution:
        
    def convertToMaxHeapUtil(self, root):
        arr = []
        i = 0
        
        #inOrder traversal
        #to get the values sorted
        def ino(node):
            if not node:
                return
            
            ino(node.left)
            arr.append(node.data)
            ino(node.right)
            
        ino(root)#call the inorder traversal
        
        #preOrder traversal
        #to put the list values
        #inplace of tree values
        def dfs(node):
            nonlocal i
            if not node:
                return
            
            dfs(node.left)
            dfs(node.right)
            node.data=arr[i]
            i+=1
            
        dfs(root)#call the preorder traversal
