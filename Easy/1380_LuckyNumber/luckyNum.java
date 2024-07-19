class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         int rows=matrix.length;
          int cols=matrix[0].length;
           int row_max_of_min=0;
            for(int [] row : matrix){
                 int row_min=Arrays.stream(row).min().getAsInt();
                 row_max_of_min=Math.max(row_max_of_min,row_min);

            }
             int col_min_of_max=Integer.MAX_VALUE;
             for( int col_ind=0; col_ind<cols;++col_ind){
                 int col_max=0;
                 for( int row_ind=0;row_ind<rows;++row_ind){
                     col_max=Math.max(col_max,matrix[row_ind][col_ind]);
                 }
                  col_min_of_max=Math.min(col_min_of_max,col_max);

             }
              return row_max_of_min==col_min_of_max ?Collections.singletonList(col_min_of_max) :Collections.emptyList();
    }
}