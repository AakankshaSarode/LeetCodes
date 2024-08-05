class Solution {
    public String kthDistinct(String[] arr, int k) {
       
         for( int i=0;i<arr.length;i++){
              int j;
               boolean isDistinct=true;
               for(  j=0;j<arr.length;j++){
                if(i!=j && arr[i].equals(arr[j])){
                     isDistinct=false;
                      break;
                }
         }
          if(isDistinct){
             k--;
              if(k==0){
                 return arr[i];
              }
          }
    }
     return "";
    }

}