import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// problem Link: https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1


/*****
 * Approach:
 * Take two things - distance array and PriorityQueue
 * distance array -> store distance of each node from the given source vertex
 * PriorityQueue -> store pair(dist,node) which ever find smallest till now.
 */

/***
 * Reference Link: https://www.youtube.com/watch?v=jbhuqIASjoM&t=644s
 */


/***
 * Time Complexity: O(v**2)
 * Space Complexity: O(v**2)
 */

class pair implements Comparable<pair>{
    int dist,node;
    pair(int d,int n){
        dist=d;
        node=n;
    }
    public int compareTo(pair o){
        return this.dist-o.dist;
    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int distance[]=new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[S]=0;
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,S));
        while(pq.isEmpty()==false)
        {
            pair p=pq.poll();
            int d=p.dist;
            int v=p.node;
            ArrayList<ArrayList<Integer>> al=new ArrayList<>();
            al=adj.get(v);
            for (int i=0;i<al.size();i++)
            {
                ArrayList<Integer> al1=al.get(i);
                if(d+al1.get(1)<distance[al1.get(0)]){
                    distance[al1.get(0)]=d+al1.get(1);
                    pq.add(new pair(d+al1.get(1),al1.get(0)));
                }
            }
        }
        return distance;
    }
}

