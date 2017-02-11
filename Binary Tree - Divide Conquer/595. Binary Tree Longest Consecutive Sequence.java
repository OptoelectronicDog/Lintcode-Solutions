/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/* Thought: Use divide and conquer, traverse left and right from the root,  stand at every satisfied node, you need to determine:
   1) now if left child is satisfied, leftsum++, but you need to compare leftsum with rightsum to determine that if you also need to 
   sum subMax; 2) for right child, vice versa.
   
   Then, store subMax to the global variable maxLength, and return subMax!
 */
 
public class Solution {
    /**
     * @param root the root of binary tree
     * @return the length of the longest consecutive sequence path
     */
    public int longestConsecutive(TreeNode root) {
        // Write your code here
        helper(root);
        return maxLength;
    }
    
    private int maxLength = 0;
    
    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int subMax = 1; // at least 1 because of the root exists
        int leftsum = helper(root.left);
        int rightsum = helper(root.right);
        /* no need to traverse to the leaf, just to the last root node */
        if (root.left != null && root.left.val == root.val + 1) { // must statisfy at same                                                                                                                 // time! use "&&"!
            leftsum++;
            subMax = Math.max(rightsum, leftsum);
        }
        if (root.right != null && root.right.val == root.val + 1) {
            rightsum++;
            subMax = Math.max(leftsum, rightsum);
        }        
        if (subMax > maxLength) {
            maxLength = subMax;
        }
        
        return subMax;
    }
    
}
