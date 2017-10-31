/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_and_other_trees;

/**
 *
 * @author Sigit Wicaksono
 */
public class main {
    public static void main(String []args){
        BinaryTreeNode tree = new BinaryTreeNode();
        tree.root = new BinaryTreeNode(1);
        tree.root.leftChild = new BinaryTreeNode(2);
        tree.root.rightChild = new BinaryTreeNode(3);
        tree.root.leftChild.leftChild = new BinaryTreeNode(4);
        tree.root.leftChild.rightChild = new BinaryTreeNode(5);
 
//        System.out.println("Preorder traversal of binary tree is ");
//        tree.preOrder();
        BinaryTreeNode tre = (BinaryTreeNode) tree.Clone(tree);
        tre.preOrder();
        
// 
//        System.out.println("\nInorder traversal of binary tree is ");
//        tree.printInorder();
// 
//        System.out.println("\nPostorder traversal of binary tree is ");
//        tree.printPostorder();
    }
}
