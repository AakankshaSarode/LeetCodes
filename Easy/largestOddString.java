class Solution {
    public String largestOddNumber(String num) {
         String str="";
       for( int i=num.length()-1;i>=0;i--){
         if(num.charAt(i)%2 !=0){
             String s1=num.substring(0,i+1);
              return s1;
         }
       }  
       return str;
    }
}