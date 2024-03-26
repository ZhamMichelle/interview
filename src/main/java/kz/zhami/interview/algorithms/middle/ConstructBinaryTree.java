package kz.zhami.interview.algorithms.middle;

public class ConstructBinaryTree {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] in = {4, 2, 5, 1, 6, 3, 7};

    }

    public static int[] construct(int[] pre, int[] in) {
        int root = pre[0];
        int inRootIndex = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == root) {
                inRootIndex = i;
                break;
            }
        }

        for (int i = 0; i < inRootIndex; i++) {

        }
        return new int[0];
    }
}

class TreeNode_Construct {
    int value;
    TreeNode_Construct left;
    TreeNode_Construct right;

    public TreeNode_Construct(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

//    @Override
//    public String toString(){
//
//    }
}
