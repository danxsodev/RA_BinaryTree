package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] raDigits = {2, 4, 0, 3, 7, 1, 5};

        BinarySearchTree bst = new BinarySearchTree();

        for (int digit : raDigits) {
            bst.insert(digit);
        }

        System.out.println("==== Binary Search Tree ====");
        System.out.println("Raíz: " + bst.getRoot().getValue());

        List<Integer> leaves = bst.getLeaves();
        System.out.println("Folhas: " + leaves);

        System.out.println("Altura: " + bst.height());

        List<Integer> inOrder = bst.inOrderTraversal();
        System.out.println("Percurso em ordem: " + inOrder);
    }
}
