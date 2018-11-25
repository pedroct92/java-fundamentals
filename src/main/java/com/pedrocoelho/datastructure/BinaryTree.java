package com.pedrocoelho.datastructure;

public class BinaryTree {

    Node root;


    public void add(int value) {
        root = this.addNode(this.root, value);
    }

    public Boolean containsNode(int value) {
        return containsValue(this.root, value);
    }

    public Node removeNode(int value) {
        return removeValue(this.root, value);
    }

    private Node addNode(Node currentNode, int value) {

        if (currentNode == null) {
            return new Node(value);
        }

        if(value < currentNode.value) {
            currentNode.left = addNode(currentNode.left, value);
        } else if(value > currentNode.value) {
            currentNode.right = addNode(currentNode.right, value);
        }

        return currentNode;
    }

    private Boolean containsValue(Node current, int value) {

        if(current == null) {
            return false;
        }

        if (current.value == value) {
            return true;
        }
        return value < current.value ? containsValue(current.left, value) : containsValue(current.right, value);
    }

    private Node removeValue(Node current, int value) {

        if (current == null) {
            return null;
        }

        if (current.value == value) {
            if(current.left == null && current.right == null) {
                return null;
            }

            if (current.left == null) {
                return current.right;
            }

            if (current.right == null) {
                return current.left;
            }

            //it means that the node that is being removed has both sides and we need to find the smallest to replace the root

        }

        if (value < current.value) {
            current.left = removeValue(current, value);
            return current;
        } else {
            current.right = removeValue(current, value);
            return current;
        }

    }

    public static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
