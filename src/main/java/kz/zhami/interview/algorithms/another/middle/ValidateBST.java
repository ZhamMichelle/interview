package kz.zhami.interview.algorithms.another.middle;

public class ValidateBST {
    public static void main(String[] args) {
//        var node = new BST(4);
//        node.left = new BST(2);
//        node.right = new BST(5);
//        node.left.left = new BST(1);
//        node.left.right = new BST(3);

        var node = new BST(5);
        node.left = new BST(7);
        node.right = new BST(3);

        System.out.println(validateViaReflection(node));
    }

    public static boolean validateViaReflection(BST node) {
        if (node == null) {
            return true;
        }

        if ((node.left != null && node.left.value > node.value) || (node.right != null && node.right.value < node.value)) {
            return false;
        }

        if (node.left != null) {
            validateViaReflection(node.left);
        }
        if (node.right != null) {
            validateViaReflection(node.right);
        }

        return true;
    }

    public static boolean validate(BST node) {
        while (node.left != null || node.right != null) {
            if (node.left.value > node.value || node.right.value < node.value) {
                return false;
            }
            node = node.left;
        }
        return true;
    }
}

class BST {
    int value;
    BST left;
    BST right;

    public BST(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}