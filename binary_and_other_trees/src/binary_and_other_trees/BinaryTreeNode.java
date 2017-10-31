package binary_and_other_trees;
public class BinaryTreeNode {
    Object element,name;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    //constructor
    public BinaryTreeNode(){}
    public BinaryTreeNode(Object theElement){
        element = theElement;
    }
    public BinaryTreeNode(Object theElement,Object name, BinaryTreeNode theleftChild, BinaryTreeNode therightChild){
        element = theElement;
        name = name;
        leftChild = theleftChild;
        rightChild = therightChild;
    }
    @Override
    public String toString(){
        return "[" + element + "," + name + "]";
    }
    BinaryTreeNode root = null;
    public static void visit(BinaryTreeNode t){
        System.out.println(t.element+ " ");
    }
    public static void preOrder(BinaryTreeNode t){
        if(t != null){
            visit(t);
            preOrder(t.leftChild);
            preOrder(t.rightChild);
        }
    }
    public static void inOrder(BinaryTreeNode t){
        if(t != null){
            inOrder(t.leftChild);
            visit(t);
            inOrder(t.rightChild);
        }
    }
    public static void postOrder(BinaryTreeNode t){
        if(t != null){
            postOrder(t.leftChild);
            postOrder(t.rightChild);
            visit(t);
        }
    }
    void postOrder()  {     postOrder(root);  }
    void inOrder()    {     inOrder(root);   }
    void preOrder()   {     preOrder(root);  }
    BinaryTreeNode Clone(BinaryTreeNode focusNode) {
        if (focusNode == null) {
            // base case
            return null;
        }
        BinaryTreeNode copy = new BinaryTreeNode(focusNode.element);
        copy.leftChild = Clone(focusNode.leftChild);
        copy.rightChild = Clone(focusNode.rightChild);
        return copy;
    }
}
