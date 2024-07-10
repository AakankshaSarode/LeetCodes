class Solution {
    Integer [] memo;

   public int deleteAndEarn(int[] nums) {
      int max=0;
       for( int i :nums)
       max= Math.max( max,i);
        int map[]= new int[max+1];
         memo= new Integer[max+1];
          for( int i:nums)
           map[i]++;
            return sol(map,1);

   }
    public int sol( int [] map, int idx){
        if(idx>=map.length)return 0;
        if(memo[idx]!=null)
        return memo[idx];
        return memo[idx]=Math.max(sol(map,idx+1),sol(map,idx+2)+map[idx]*idx);
    }
}