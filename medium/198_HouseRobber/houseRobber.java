class Solution {
    public int rob(int[] nums) {
       int memo[] = new int[ nums.length];
        Arrays.fill(memo,-1);
         return robForm(nums,0,memo); 
    }
     private int robForm(int nums[], int start, int [] memo){
         if(start>= nums.length){
             return 0;
         }
          if(memo[start]!=-1){
             return memo[start];

          }
           int maxAmount=Math.max(nums[start]+robForm(nums,start+2,memo), robForm(nums,start+1,memo));
           memo[start]=maxAmount;
            return maxAmount;
     }

}