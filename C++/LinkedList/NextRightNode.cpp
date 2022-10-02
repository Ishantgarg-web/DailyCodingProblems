//Problem Link : https://practice.geeksforgeeks.org/problems/next-right-node/1

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution
{
public:
    Node *nextRight(Node *root, int key)
    {
        // Base Case
        if (root == NULL)
            return 0;

        // Create an empty queue for level order tarversal
        queue<Node *> qn; // A queue to store node addresses
        queue<int> ql;    // Another queue to store node levels

        int level = 0; // Initialize level as 0

        // Enqueue Root and its level
        qn.push(root);
        ql.push(level);

        // A standard BFS loop
        while (qn.size())
        {
            // dequeue an node from qn and its level from ql
            Node *node = qn.front();
            level = ql.front();
            qn.pop();
            ql.pop();

            // If the dequeued node has the given key k
            if (node->data == key)
            {
                // If there are no more items in queue or given node is
                // the rightmost node of its level, then return NULL
                if (ql.size() == 0 || ql.front() != level)
                {
                    Node *ret = new Node(-1);
                    return ret;
                }

                // Otherwise return next node from queue of nodes
                return qn.front();
            }

            // Standard BFS steps: enqueue children of this node
            if (node->left != NULL)
            {
                qn.push(node->left);
                ql.push(level + 1);
            }
            if (node->right != NULL)
            {
                qn.push(node->right);
                ql.push(level + 1);
            }
        }

        // We reach here if given key x doesn't exist in tree
        Node *ret = new Node(-1);
        return ret;
    }
};
 