/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

public class MyBinarySearchTree {
    TreeNode root;
    int count;

    public MyBinarySearchTree() {
        root = null;
        count = 0;
    }

    public void insert(int data) {
        TreeNode n = new TreeNode();
        n.setData(data);
        if (root == null) {
            root = n;
        } else {
            TreeNode temp = root;
            while (true) {
                if (data > temp.getData()) {
                    if (temp.getRight() == null) {
                        temp.setRight(n);
                        break;
                    } else {
                        temp = temp.getRight();
                    }
                } else {
                    if (temp.getLeft() == null) {
                        temp.setLeft(n);
                        break;
                    } else {
                        temp = temp.getLeft();
                    }
                }
            }
        }
    }

    private void LeftNode(TreeNode root) {
        if (root == null) {
            return;
        } else {
            if (root.getLeft() != null) {
                System.out.println(root.getLeft().getData());
            } else {
                count++;
            }
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }

    public void printLeftNode() {
        LeftNode(root);
    }

    public void countNotLeft() {
        System.out.println(count);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.getData() + "\t");
            preOrder(root.getLeft());
            preOrder(root.getRight());

        }
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + "\t");
        }
    }

    public void ComparePrePost() {

        System.out.println("Pre-order Traversal :-");
        preOrder(root);
        System.out.println();
        System.out.println("Post-order Traversal :-");
        postOrder(root);
    }

    public TreeNode getRoot() {
        return root;
    }
}