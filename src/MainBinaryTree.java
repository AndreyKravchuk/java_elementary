import java.util.ArrayList;
/**
 * Created by user on 09.08.2017.
 */
public class MainBinaryTree {
    private static ArrayList<TreeNode> binaryTree = new ArrayList<>();
    private static TreeNode root = new TreeNode(7);
    public static void main(String[] args) {


        binaryTree.add(root);
        add(6);
        add(5);
        add(3);

        System.out.println(binaryTree);
        System.out.println(binaryTree.get(2).value);
        System.out.println(binaryTree.get(2).up);
        System.out.println(binaryTree.get(2).left);
        System.out.println(binaryTree.get(2).right);

    }

    private static void add(int number){
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
    private static boolean contains(TreeNode treeNode) {
        return treeNode.value != null;
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
}
