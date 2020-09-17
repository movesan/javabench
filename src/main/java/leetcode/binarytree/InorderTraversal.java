package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * @description: 中序遍历
 * @author: movesan
 * @create: 2020-09-17 17:29
 **/
public class InorderTraversal {

    private static final String[] BANNER = { "",
            "                             _                       ___                                                   _     ",
            "                            (_)                     / __)                                                 | |    ",
            " _   _   ____   ____   ____  _  ____    ____       | |__   ____   ____  ____    ____  _ _ _   ___    ____ | |  _ ",
            "| | | | / ___) / _  | / ___)| ||  _ \\  / ___)      |  __) / ___) / _  ||    \\  / _  )| | | | / _ \\  / ___)| | / )",
            "| |_| |( (___ ( ( | || |    | || | | |( (___       | |   | |    ( ( | || | | |( (/ / | | | || |_| || |    | |< ( ",
            " \\____| \\____) \\_||_||_|    |_||_| |_| \\____)      |_|   |_|     \\_||_||_|_|_| \\____) \\____| \\___/ |_|    |_| \\_)",
            ""};

    /**
     * 迭代遍历
     * @param root
     * @return
     */
    public List<Integer> iterationTraversal(TreeNode root) {

        return null;
    }

    /**
     * 递归遍历
     * @param root
     * @return
     */
    public List<Integer> recursionTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursion(root, res);
        return res;
    }

    private void recursion(TreeNode root, List<Integer> res) {
        if (root == null) return;
        recursion(root.left, res);
        res.add(root.val);
        recursion(root.right, res);
    }

    @Test
    public void recursionTest() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1);
        root.left = left;
        root.right = right;

        System.out.println(BANNER);
    }

}
