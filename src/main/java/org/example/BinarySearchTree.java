package org.example;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(insertRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(insertRecursive(current.getRight(), value));
        }
        return current;
    }

    public List<Integer> inOrderTraversal() {
        List<Integer> elements = new ArrayList<>();
        inOrderRecursive(root, elements);
        return elements;
    }

    private void inOrderRecursive(Node node, List<Integer> elements) {
        if (node != null) {
            inOrderRecursive(node.getLeft(), elements);
            elements.add(node.getValue());
            inOrderRecursive(node.getRight(), elements);
        }
    }

    public int height() {
        return calculateHeight(root);
    }

    private int calculateHeight(Node node) {
        if (node == null) return -1;
        int left = calculateHeight(node.getLeft());
        int right = calculateHeight(node.getRight());
        return Math.max(left, right) + 1;
    }

    public List<Integer> getLeaves() {
        List<Integer> leaves = new ArrayList<>();
        findLeaves(root, leaves);
        return leaves;
    }

    private void findLeaves(Node node, List<Integer> leaves) {
        if (node == null) return;

        if (node.getLeft() == null && node.getRight() == null) {
            leaves.add(node.getValue());
        }

        findLeaves(node.getLeft(), leaves);
        findLeaves(node.getRight(), leaves);
    }

    public Node getRoot() {
        return root;
    }
}

