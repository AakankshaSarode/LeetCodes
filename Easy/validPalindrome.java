class Solution {
    public boolean isPalindrome(String s) {
         if(s.isEmpty()){
             return true;

         }
         int begin=0;
          int end=s.length()-1;
           while(begin<=end){
            char currFirst=s.charAt(begin);
             char currLast=s.charAt(end);
             if(!Character.isLetterOrDigit(currFirst)){
                 begin++;
             }
              else if(!Character.isLetterOrDigit(currLast)){
                 end--;
              } else{
                    if(Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast)){
                 return false;
              }
   
                  begin++;
                   end--;
            }
           }
           return true;
    }
}