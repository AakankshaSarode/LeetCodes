class Solution {
    public int minGroups(int[][] intervals) {
         int n=intervals.length;
          int[] start=new int[n];
           int[] end= new int[n];
            for( int i=0;i<n;i++){
                start[i]= intervals[i][0];
                 end[i]=intervals[i][1];

            }
             Arrays.sort(start);
              Arrays.sort(end);

               int end_ptr=0, group_count=0;
                for( int start_times :start){
                     if(start_times>end[end_ptr]){
                         end_ptr++;
                     }else{
                         group_count++;
                     }
                }
                 return group_count;
    }
}