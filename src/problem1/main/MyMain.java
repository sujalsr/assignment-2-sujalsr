/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(2);
        obj.insert(3);
        obj.insert(5);
        obj.insert(4);
        obj.insert(8);
        obj.insert(1);
        System.out.println("Left Children (Nodes)");
        obj.printLeftNode();
        System.out.println("Count of Nodes not having left child");
        obj.countNotLeft();
    }
}
