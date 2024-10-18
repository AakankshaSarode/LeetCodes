class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((x,y)->y[0]-x[0]);
         if(a>0)pq.offer( new int[]{a,'a'});
         if(b>0)pq.offer(new int[]{b,'b'});
          if(c>0)pq.offer(new int[]{c,'c'});

           StringBuilder  result= new StringBuilder();
            while(!pq.isEmpty()){
                 int[] first= pq.poll();
                  if(result.length()>=2 &&result.charAt(result.length()-1)==first[1] && result.charAt(result.length()-2)==first[1]){
                     if(pq.isEmpty() ) break;
                      int [] second=pq.poll();
                       result.append((char)second[1]);
                       second[0]--;
                        if(second[0]>0 )pq.offer(second);
                         pq.offer(first);
                         
                  }else{
                     result.append((char)first[1]);
                      first[0]--;
                       if(first[0]>0) pq.offer(first);
                       }
            }
             return result.toString();
            }
}