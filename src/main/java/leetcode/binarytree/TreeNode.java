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

    public static TreeNode getTree() {
        /*
                     5
                   /   \
                  3     8
                /  \   /  \
               2    4 6    9
              /           / \
             1           7   10
         */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
//        root.right.right.right

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(10);

        return root;
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
