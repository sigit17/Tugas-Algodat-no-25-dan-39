package binary_and_other_trees;
public class BinaryTreeNode implements Cloneable{
    Object element,name;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    private int size;
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
    @Override
    public Object clone() {
        try{
            return super.clone();
        }
        catch (CloneNotSupportedException s){
            throw new Error("tidak bisa di clone");
        }
    }
    public void clonePreOrder(BinaryTreeNode a){
        clone();
        a.preOrder();
    }
    public void clonePostOrder(BinaryTreeNode a){
        clone();
        a.postOrder();
    }
    public boolean compareTree(BinaryTreeNode a, BinaryTreeNode b){
        if(a == null && b == null){
            return true;
        }
        if(a != null && b != null){
            return (a.element == b.element && compareTree(a.leftChild, b.leftChild) && compareTree(a.rightChild, b.rightChild));
        }
        return false;
    }
    public void swap(final BinaryTreeNode root){
        final BinaryTreeNode temp = root.rightChild;
        root.rightChild = root.leftChild;
        root.leftChild = temp;
        if(root.leftChild != null){
            swap(root.leftChild);
        }
        if(root.rightChild != null){
            swap(root.rightChild);
        }
    }
}
