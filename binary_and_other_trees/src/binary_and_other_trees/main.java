package binary_and_other_trees;
public class main {
    public static void main(String []args){
        BinaryTreeNode tree = new BinaryTreeNode();
        BinaryTreeNode tre = new BinaryTreeNode();
        tree.root = new BinaryTreeNode(1);
        tree.root.leftChild = new BinaryTreeNode(2);
        tree.root.rightChild = new BinaryTreeNode(3);
        tree.root.leftChild.leftChild = new BinaryTreeNode(4);
        tree.root.leftChild.rightChild = new BinaryTreeNode(5);
 
        System.out.println("Preorder ");
        tree.preOrder();
  
        System.out.println("\nPostorder ");
        tree.postOrder();
        
        System.out.println("apa object tree dan tre sama");
        System.out.println(tree.compareTree(tree.root, tre.root));
        
        System.out.println("setelah di copy di variabel tr");
        BinaryTreeNode tr = (BinaryTreeNode) tree.clone();
        System.out.println("preOrder");
        tr.preOrder();
        System.out.println("postOrder");
        tree.swap();
    }
}
