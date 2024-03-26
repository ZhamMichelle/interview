package kz.zhami.interview.algorithms.another;

import java.util.*;

public class BFS_3 {
    public static void main(String[] args) {
        var root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        var arr = reverseLevelOrder(root);
        System.out.println(arr);
    }

    public static List<Integer> reverseLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        Deque<Integer> deque = new ArrayDeque<>();
        while (!queue.isEmpty()) {
            var current = queue.remove();
            deque.addLast(current.value);
            if (current.right != null) {
                queue.add(current.right);
            }
            if (current.left != null) {
                queue.add(current.left);
            }
        }

        List<Integer> list = new ArrayList<>();
        while (!deque.isEmpty()) {
            list.add(deque.removeLast());
        }
        return list;

    }
}
