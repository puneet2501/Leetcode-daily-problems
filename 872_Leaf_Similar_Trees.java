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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean ans = true;
        
        findLeaf(root1,list);
        findLeaf(root2,arr);


        return list.equals(arr);

    }

    static void findLeaf(TreeNode node,ArrayList<Integer> list){
        if(node!=null){
            if(node.left==null && node.right==null){
                list.add(node.val);
            }

            findLeaf(node.left, list);
            findLeaf(node.right, list);
        }
    }
}