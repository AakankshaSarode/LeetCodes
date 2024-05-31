class Solution {
    public String removeOuterParentheses(String s) {
         String res="";
          int count=0;
           for( int c=0;c<s.length();c++){
              if(s.charAt(c)=='(' && count++ >0)
               res+=s.charAt(c);
                if(s.charAt(c) ==')' && count -- >1)
                 res+=s.charAt(c);
           }
            return res;
    }
}