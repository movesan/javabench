package leetcode.binarytree;

/**
 * @description: 二叉树
 * @author: movesan
 * @create: 2020-09-17 17:33
 **/
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }



    @Override
    public String toString() {
        String left = this.left != null ? this.left.toString() : "";
        String right = this.right != null ? this.right.toString() : "";
        return "" + this.val +
                "   /      \\ " +
                "  /        \\" +
                left + "" + right;
    }
}
