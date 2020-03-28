/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(4);
        obj.insert(7);
        obj.insert(8);
        obj.insert(6);
        obj.insert(10);
        obj.insert(1);
        obj.insert(20);
        obj.insert(3);
        obj.insert(40);
        obj.ComparePrePost();
    }
}
