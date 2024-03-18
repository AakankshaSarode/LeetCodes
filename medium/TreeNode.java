

import java.util.*;
public class TreeNode {
       int val;
       TreeNode left;
        TreeNode right;
         TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
            this.left = left;
            this.right = right;
       }
    }
    class Solution {
    List<List<Integer>> ans;
       void solve(TreeNode root, int lvl){
            if(root== null){
                 return ;

            }
             if(ans.size()== lvl){
                   ans.add(new ArrayList<>());

             }
              ans.get(lvl). add(root.val);
               solve(root.left,lvl+1);
                solve(root.right,lvl+1);

       }
        
    public List<List<Integer>> levelOrder(TreeNode root) {
       ans= new ArrayList<>();
        solve(root,0);
         return ans;
    }
}