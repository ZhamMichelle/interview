package kz.zhami.interview.algorithms.another;

public class SubTreeOfTree {
    public static void main(String[] args) {
        var s = new TreeNode_1(3);
        s.left = new TreeNode_1(4);
        s.right = new TreeNode_1(5);
        s.left.left = new TreeNode_1(1);
        s.left.right = new TreeNode_1(2);

        var t = new TreeNode_1(4);
        t.left = new TreeNode_1(1);
        t.right = new TreeNode_1(2);

        System.out.println(isSubTreeOfTree_1(s, t));
    }

    public static boolean isSubTreeOfTree_1(TreeNode_1 s, TreeNode_1 t){
        if (t == null)
            return true;

        if (s == null)
            return false;

        if(areIdentical_1(s,t))
            return true;
        return isSubTreeOfTree_1(s.left,t) || isSubTreeOfTree_1(s.right,t);
    }

    public static boolean areIdentical_1(TreeNode_1 s, TreeNode_1 t){
        if(s==null && t==null){
            return true;
        }
        if(s==null || t==null){
            return false;
        }
        return (s.value==t.value &&
                areIdentical_1(s.left,t.left) &&
                areIdentical_1(s.right,t.right));
    }
























    public static boolean isSubTreeOfTree(TreeNode_1 s, TreeNode_1 t) {
        if (t == null)
            return true;

        if (s == null)
            return false;

        if (areIdentical(s, t))
            return true;

        return isSubTreeOfTree(s.left,t) || isSubTreeOfTree(s.right,t);
    }

    public static boolean areIdentical(TreeNode_1 s, TreeNode_1 t) {
        if (s == null && t == null)
            return true;

        if (s == null || t == null)
            return false;

        return (s.value == t.value &&
                areIdentical(s.left, t.left) && areIdentical(s.right, t.right));
    }
}

class TreeNode_1 {
    int value;
    TreeNode_1 left;
    TreeNode_1 right;

    public TreeNode_1(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
