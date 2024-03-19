import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List[] adjList= new List[numCourses];
         int [] indegree= new int[numCourses];
            for( int [] preq:prerequisites){
                 if(adjList[preq[1]]==null )adjList[preq[1]]=new ArrayList<Integer>();
                 adjList[preq[1]].add(preq[0]);
                  indegree[preq[0]]++;

            }
             Queue<Integer> queue= new LinkedList<>();
              for( int i=0;i<numCourses;i++){
                 if(indegree[i]==0 )queue.add(i);
              }
               int [] ans= new int[numCourses];
                int ptr=0;
                 while(!queue.isEmpty()){
                     int pooped= queue.remove();
                     ans[ptr++]=pooped;
                      if(adjList[pooped]==null)
                      continue;
                       for( var node: adjList[pooped])
                       {
                         if(--indegree[(Integer)node]==0) queue.add((Integer)node);

                       }
                 }
                 if(numCourses==ptr)
                  return ans;
                   else return new int[]{};
    }
}
