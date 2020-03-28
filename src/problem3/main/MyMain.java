/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Aadarsh", 37);
        obj.insert("Aryan", 48);
        obj.insert("Avinash", 49);
        obj.insert("Aishwarya", 39);
        obj.insert("Devashish", 55);
        obj.insert("Anmol", 43);
        obj.insert("Devanshu", 54);
        obj.displayAsc();
    }
}
