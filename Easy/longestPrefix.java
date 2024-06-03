class Solution {
    static String commonPrefixUtil(String s1, String s2){
         String result="";
         int n1=s1.length(),
         n2=s2.length();
          for( int i=0,j=0;i<=n1-1 && j<=n2-1;i++,j++){
              if(s1.charAt(i)!=s2.charAt(j)){
                 break;
              }
               result+=s1.charAt(i);
                
          }
           return result;
    }
    public String longestCommonPrefix(String[] strs) {
         int n= strs.length;
          String Prefix=strs[0];
           for( int i=1;i<=n-1;i++){
             Prefix=commonPrefixUtil(Prefix,strs[i]);

           }
            return(Prefix);
    }
}