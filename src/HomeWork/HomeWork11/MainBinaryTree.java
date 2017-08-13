package HomeWork.HomeWork11;

import java.util.Iterator;

/**
 * Created by user on 09.08.2017.
 */
public class MainBinaryTree {

    public static void main(String[] args) throws RuntimeException{

        ContainerTree container = new ContainerTree();
        ContainerTree.addRoot();
        ContainerTree.add(6);
        ContainerTree.add(5);
        ContainerTree.add(10);
        ContainerTree.add(2);
        ContainerTree.add(1);
        ContainerTree.add(12);
        ContainerTree.add(3);

        System.out.println(ContainerTree.binaryTree);

        System.out.println(ContainerTree.binaryTree.get(0).up);
        System.out.println(ContainerTree.binaryTree.get(0).left);
        System.out.println(ContainerTree.binaryTree.get(0).right);
        System.out.println(ContainerTree.binaryTree.get(0).value);


        Iterator<TreeNode> iterator = container.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        try {
            System.out.println(iterator.next());
        } catch (Exception e){
            System.out.println("Next element is missing");
        }

        System.out.println(ContainerTree.contains(ContainerTree.binaryTree.get(7)));




    }

}


