/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
 HashMap<Integer, Pair> map = new HashMap<>();
 
 public boolean isCousins(TreeNode root, int x, int y) {
      traverse(root, 0, 0);
     //Checking the given cousin condintion
     if(map.get(x).height == map.get(y).height && map.get(x).parent!= map.get(y).parent){
           return true;
       }
       return false;
 }
 
 //PreOrder Traversal Recursive method to store values 
 public void traverse(TreeNode root, int l, int p){
      if(root == null)
         return;
 
      map.put(root.val, new Pair(l, p));
      traverse(root.left, l+1, root.val);
      traverse(root.right, l+1, root.val);
      }
}
//A Pair Data class to store combined data about a node
class Pair {
 int height;
 int parent;
 Pair(int h, int p){
 this.height = h;
 this.parent = p;
 }
}
