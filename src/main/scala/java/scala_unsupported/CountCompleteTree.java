package leet.java.scala_unsupported;

public class CountCompleteTree {
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
