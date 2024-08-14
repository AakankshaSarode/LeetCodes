class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums); 
       int start=0;
        int end=nums[nums.length-1]-nums[0];
         while(start<end){
            int midDist=start+(end-start)/2;
            int pairsCount=countPairsDist(nums,midDist);
             if(pairsCount<k){
                 start=midDist+1;

             }else{
                 end=midDist;

             }
         }
          return start;
    }
     private int countPairsDist( int[] nums,int target){
         int count=0;
          int left=0;
           for( int right=1;right<nums.length;right++){
             while(nums[right]-nums[left]> target){
                left++;
             }
              count+=right-left;

           }
            return count;
     }
}