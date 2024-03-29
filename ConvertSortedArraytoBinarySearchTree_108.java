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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
		
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int half = nums.length / 2;
		
        TreeNode root = new TreeNode(nums[half]);
		
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, half));
		
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, half+1, nums.length));
		
        return root;
    }
}