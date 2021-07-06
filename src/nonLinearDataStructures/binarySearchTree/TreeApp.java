package nonLinearDataStructures.binarySearchTree;

public class TreeApp {
    public static void main(String[] args) {
        Tree iterativeTree = new Tree();
        iterativeTree.insertIterative(7);
        iterativeTree.insertIterative(4);
        iterativeTree.insertIterative(9);
        iterativeTree.insertIterative(1);
        iterativeTree.insertIterative(6);
        iterativeTree.insertIterative(8);
        iterativeTree.insertIterative(10);

        System.out.println(iterativeTree.findIterative(5));
        System.out.println(iterativeTree.findIterative(10));

        iterativeTree.traversePreOrder();
        iterativeTree.traverseInOrder();
        iterativeTree.traversePostOrder();
        iterativeTree.traverseLevelOrder();

        Tree recursiveTree = new Tree();
        recursiveTree.insertRecursive(7);
        recursiveTree.insertRecursive(4);
        recursiveTree.insertRecursive(9);
        recursiveTree.insertRecursive(1);
        recursiveTree.insertRecursive(6);
        recursiveTree.insertRecursive(8);
        recursiveTree.insertRecursive(10);

        System.out.println(recursiveTree.findRecursive(5));
        System.out.println(recursiveTree.findRecursive(10));
    }
}
