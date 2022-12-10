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
    public int maxProduct(TreeNode root) {
        final int k = 1000000007;
        long ans = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        final long t = treeSum(root,arr);
        for(final long x : arr){
            ans = max(ans,x*(t-x));
        }

        return (int)(ans%k);
    }

    private int treeSum(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return 0;
        }

        final int ls = treeSum(root.left, arr);
        final int rs = treeSum(root.right,arr);
        final int s = root.val + ls +rs;
        arr.add(s);
        return s;
    }
    static long max(long a, long b){
        if(a>b) return a;
        return b;
    }
}