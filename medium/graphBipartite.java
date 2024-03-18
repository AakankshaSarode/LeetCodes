 import java.util.*;
 
 class Solution {
    public boolean isBipartite(int[][] graph) {
     int n=graph.length;
      int col[]= new int[n];
       for( int i=0;i<n;i++){
         col[i]=-1;

       }   
        Queue<Integer>que= new LinkedList<>();
         for(int i=0;i<col.length;i++){
            if(col[i]==-1){
            que.add(i);
            col[i]=1;
            while(!que.isEmpty()){
                 int curr= que.remove();
                  int arr[]= graph[curr];
                   for( int j=0;j<arr.length;j++){
                    if(col[graph[curr][j]]==-1){
                         col[graph[curr][j]]=1-col[curr];
                          que.add(graph[curr][j]);

                    }
                     else if(col[graph[curr][j]]==col[curr]){
                         return false;
                     }
                   }
            }


            }
     
         }
                 return true;
    }
}