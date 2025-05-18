package tree;

public class InorderTraversalProg3 {

    // Define TreeNode as a static inner class
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }

    // Inorder traversal function
    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);                // Visit left subtree
        System.out.print(node.val + " ");  // Visit node
        inorder(node.right);               // Visit right subtree
    }

    // Main method
    public static void main(String[] args) {
        InorderTraversalProg3 tree = new InorderTraversalProg3();

        // Manually construct the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder traversal of binary tree is:");
        tree.inorder(root);  // Expected output: 4 2 5 1 3
    }
}
