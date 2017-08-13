package HomeWork.HomeWork11;

import java.util.ArrayList;
import java.util.Iterator;


public class ContainerTree implements Iterable {

    public static ArrayList<TreeNode> binaryTree = new ArrayList<>();
    public static TreeNode root = new TreeNode(7);

    public static void addRoot(){
        binaryTree.add(root);
    }

    public static void add(int number){
        TreeNode newNode = new TreeNode(number);
        binaryTree.add(newNode);
        walk(newNode, root);
    }

    /**
     * The recursive method find empty treeNod with rules and fills up it.
     * @param stepNode
     * @param parent
     */
    private static void walk(TreeNode stepNode, TreeNode parent){
        if (size(stepNode) < size(parent)){
            if (parent.left == null){
                parent.left = stepNode;
                stepNode.up = parent;
            }
            else {
                parent = parent.left;
                walk(stepNode, parent);
            }
        }
        else {
            if (parent.right == null){
                parent.right = stepNode;
                stepNode.up = parent;
            }
            else {
                parent = parent.right;
                walk(stepNode, parent);
            }

        }

    }

    /**The method checks the value of tree node.
     *
     * @param treeNode
     * @return boolean value
     */
    public static boolean contains(TreeNode treeNode) throws RuntimeException{
        try {
            return treeNode.value != null;
        } catch (Exception e){
            return false;
        }
    }


    /**
     *
     * @param treeNode
     * @return size of binary tree list
     */
    private static int size(TreeNode treeNode){
        int size;
        size = treeNode.value;
        return size;
    }




    @Override
    public Iterator<TreeNode> iterator() {
        return new ContainerIterator();
    }

    private class ContainerIterator implements Iterator<TreeNode> {

        int current = -1;

        @Override
        public boolean hasNext() {
            return binaryTree.size() > current + 1;
        }

        @Override
        public TreeNode next(){
            if (current < binaryTree.size() - 1) {
                current++;
                return binaryTree.get(current);
            }

            else {
               throw new NextElementMissingException();
            }
        }

        @Override
        public void remove() {

        }
    }
}
