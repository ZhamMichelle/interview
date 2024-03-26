package kz.zhami.interview.algorithms.another;


public class DFS_1 {
    public static void main(String[] args) {
        var root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println(hasPath(root, 13));
    }

    public static boolean hasPath(TreeNode root, int sum) {
        if(root==null) return false;

        if (root.value == sum) {
            return true;
        }
        int helper = sum-root.value;
        return hasPath(root.left,helper) || hasPath(root.right,helper);
    }
}