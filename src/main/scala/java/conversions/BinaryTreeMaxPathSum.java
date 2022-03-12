package leet.java.conversions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class BinaryTreeMaxPathSum {
    public Max maxSubPathSum(TreeNode root) {
        if (root == null) {
            return new Max(Integer.MIN_VALUE, 0);
        }

        Max left = maxSubPathSum(root.left);
        Max right = maxSubPathSum(root.right);

        int linearChoice = left.linear > right.linear ? left.linear : right.linear;
        int linear = Math.max(linearChoice, 0) + root.val;

        int maxChoice = left.root > right.root ? left.root : right.root;
        int rooted = Math.max(left.linear, 0) + Math.max(right.linear, 0) + root.val;

        return new Max(Math.max(rooted, maxChoice), linear);
    }

    public int maxPathSum(TreeNode root) {
        Max m = maxSubPathSum(root);
        return m.larger();
    }

    class Max {
        int root;
        int linear;

        public Max(int root, int linear) {
            this.root = root;
            this.linear = linear;
        }

        public int larger() {
            return root > linear ? root : linear;
        }
    }
}
