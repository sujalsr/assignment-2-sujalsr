/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        obj.enqueue(1, 4, 2);
        obj.enqueue(2, 4, 1);
        obj.enqueue(48, 3, 3);
        obj.enqueue(5, 2, 0);
        obj.enqueue(39, 2, 2);
        obj.enqueue(69, 0, 1);
        obj.eraseBackLog();
        obj.display();

    }
}