package kz.zhami.interview.algorithms.another;

import java.util.*;

public class BFS_1 {
    public static void main(String[] args) {
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        var arr = levelOrder_1(root);
        System.out.println(arr);
    }

    public static List<Integer> levelOrder_1(TreeNode node) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            var current = queue.remove();
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
            list.add(current.value);
        }
        return list;
    }


    public static List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<Integer> levels = new ArrayList<>();
        List<Integer> currLevel = new ArrayList<>();
        while (!queue.isEmpty()) {
//            for (int i = 0; i < queue.size(); i++) {
            TreeNode currNode = queue.remove();
            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
            currLevel.add(currNode.value);
//            }
            levels.addAll(currLevel);
        }
        return currLevel;
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
