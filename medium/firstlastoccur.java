class Solution {
    public static int first(int[] nums, int target){

    
     int s=0;
         int n=nums.length;
          int e=n-1;
           int res=-1;
           while(s<=e){
               int mid=s+(e-s)/2;
               if(nums[mid]==target){

                   res=mid;
                   e=mid-1;

               }
               else if( nums[mid]<target){
                      s=mid+1;
               }
               else{
               
                    e=mid-1;
               }
               }
               
        return res;
    }
     public static int last(int[] nums, int target){

     
     int s=0;
         int n=nums.length;
          int e=n-1;
           int res=-1;
           while(s<=e){
               int mid=s+(e-s)/2;
               if(nums[mid]==target){

                   res=mid;
                   s=mid+1;

               }
               else if( nums[mid]<target){
                      s=mid+1;
               }
               else{
               
                    e=mid-1;
               }
               }
               
        return res;
}
    
    public int[] searchRange(int[] nums, int target) {
       
      return new int[]{first(nums,target),last(nums,target)};
               }
}