import java.util.ArrayList;
/**
 * Created by user on 09.08.2017.
 */
public class MainBinaryTree {
    private static ArrayList<TreeNode> binaryTree = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode root = new TreeNode(7);
        binaryTree.add(root);
        add(5);
        add(10);
        add(3);

        System.out.println(binaryTree);
        System.out.println(binaryTree.get(1).value);
        System.out.println(binaryTree.get(1).up);
        System.out.println(binaryTree.get(1).left);
        System.out.println(binaryTree.get(1).right);

    }

    /**The method find empty tree nod with rules and fills up it.
     *
     * @param number
     */
    private static void add(int number) {
        TreeNode treeNode = new TreeNode(number);
        binaryTree.add(treeNode);

        for (int i = 0; i < binaryTree.size();i++){
            TreeNode element = binaryTree.get(i);
            if (size(treeNode) < size(element) & element.left == null){
                element.left = treeNode;
                treeNode.up = element;
                break;
            }
            if (size(treeNode) >= size(element) & element.right == null){
                element.right = treeNode;
                treeNode.up = element;
                break;
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
