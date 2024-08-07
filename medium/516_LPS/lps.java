class Solution {
    static int lcs( String s1, String s2){
        int n=s1.length();
         int m=s2.length();
           int [] prev=new int[n+1];
            int[] curr= new int[m+1];
             for( int i=1;i<=n;i++){
                for( int j=1;j<=m;j++){
                     if(s1.charAt(i-1)==s2.charAt(j-1))
                     curr[j]=1+prev[j-1];
                     else
                      curr[j]= Math.max(prev[j],curr[j-1]);
                }
                 prev=curr.clone();

             }
              return prev[m];
    }
   public int longestPalindromeSubseq(String s) {
        String reversed= new StringBuilder(s).reverse().toString();
         return lcs(s,reversed);
        
   }
}