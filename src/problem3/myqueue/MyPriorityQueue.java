/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node head;

    public MyPriorityQueue() {
        head = null;
    }

    public void insert(String name, int roll_no) {
        Node n = new Node();
        n.setName(name);
        n.setRno(roll_no);
        Node temp = head;
        if (temp == null) {
            head = n;
        } else {
            if (temp.getRno() > roll_no) {
                n.setNext(temp);
                head = temp;
            } else {
                while (temp.getNext() != null && temp.getNext().getRno() < roll_no) {
                    temp = temp.getNext();
                }
                n.setNext(temp.getNext());
                temp.setNext(n);
            }
        }
    }

    public void displayAsc() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getName() + "\t\t" + temp.getRno());
            temp = temp.getNext();
        }
    }
}
