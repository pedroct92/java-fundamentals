package com.pedrocoelho.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void testAddNode() {
        BinaryTree tree = new BinaryTree();


        tree.add(10);
        tree.add(12);
        tree.add(9);

        Assert.assertSame(10, tree.root.value);
        Assert.assertSame(12, tree.root.right.value);
        Assert.assertSame(9, tree.root.left.value);

    }

    @Test
    public void testContainsNode() {
        BinaryTree tree = new BinaryTree();

        tree.add(10);
        tree.add(12);
        tree.add(9);

        Assert.assertTrue(tree.containsNode(10));
        Assert.assertTrue(tree.containsNode(12));
        Assert.assertTrue(tree.containsNode(9));
        Assert.assertFalse(tree.containsNode(900));
    }
}
