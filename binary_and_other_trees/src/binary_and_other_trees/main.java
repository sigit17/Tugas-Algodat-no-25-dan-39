package binary_and_other_trees;
public class main {
    public static void main(String []args){
        BinaryTreeNode tree = new BinaryTreeNode();
        tree.root = new BinaryTreeNode(1);
        tree.root.leftChild = new BinaryTreeNode(2);
        tree.root.rightChild = new BinaryTreeNode(3);
        tree.root.leftChild.leftChild = new BinaryTreeNode(4);
        tree.root.leftChild.rightChild = new BinaryTreeNode(5);
 
        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder();
  
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder();
    }
}
