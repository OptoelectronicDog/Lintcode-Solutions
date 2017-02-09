public class Solution {
    /**
     * @param root the root of binary tree
     * @return the root of the maximum average of subtree
     */
    public TreeNode findSubtree2(TreeNode root) {
        // Write your code here
        helper(root);
        return subRoot;
    }
    
    /* define a new class to record tree transversal */
    private class Counting {
        public int sum; // 2. 别设成private，不然其他类外函数用不了！！！
        public int size; // 2. 别设成private，不然其他类外函数用不了！！！
        
        public Counting(int sum, int size) { // initialized with sum and size
            this.sum = sum; // val's sum
            this.size = size; // # of nodes' sum
        }
    }
    
    /* use a method named helper to transverse the tree, it should takes a root (TreeNode) and returns Counting, so we firstly declare a TreeNode and a Counting */
    /* 必须return Counting，不然没法递归！！！ */
    
    private TreeNode subRoot = null; // 在helper外定义，不然modify后存不住！
    private Counting subResult = null;
    
    private Counting helper (TreeNode root) { // do not forget to define param's type
        if (root == null) {
            return (new Counting(0,0)); // 边界情况, 从这开始不往下递了，直接归
                                        //  root为null不能更新subRoot，所以选（0，0）
                                        // 是为了永远不执行60行的if！！！
        }
        
        Counting left = helper(root.left); // 递归实现，root在往左遍历
        /* post-order, 这里定义对root做的事情 */
        Counting right = helper(root.right); // 递归实现，root在往右遍历
        Counting result = new Counting(left.sum + right.sum + root.val,
        left.size + right.size + 1); // sum为左右根的val求和（每个为val)，  
                                    // size为左右根size求和（每个为1）
        
        /* 更新subRoot(空的时候要更新)和subResult（小的时候要更新）,这里subResult和subRoot是用来保存最新的结果！另外注意除法换乘法 */
        if (subRoot == null || subResult.sum * result.size < subResult.size * result.sum) { 
            subRoot = root;
            subResult = result;
        }
        /* 这里一定要return helper 里的 result! 才能真正求出子树和! */
        return result; // 会把整棵树完整遍历一遍
    }
    
    
    
}
