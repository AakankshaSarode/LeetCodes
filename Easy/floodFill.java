class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
         return image;
          dfs(sr,sc,image,image[sr][sc],color);
          return image;
    }
     static void dfs( int sr, int sc,int image[][],int color, int newColor){
         if(sr<0 || sc<0 || sr>=image.length ||sc>=image[0].length || image[sr][sc]!=color){
        return;
         }
 
          image[sr][sc]=newColor;

          dfs(sr+1,sc,image,color,newColor);
          
          dfs(sr-1,sc,image,color,newColor);
          
          dfs(sr,sc+1,image,color,newColor);
          
          dfs(sr,sc-1,image,color,newColor);
     }
}
