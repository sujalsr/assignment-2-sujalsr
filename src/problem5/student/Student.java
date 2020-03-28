/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    int roll;
    int app_count;
    int backlog;

    public int getRoll() {
        return roll;
    }

    public Student(int roll, int app_count, int backlog) {
        this.roll = roll;
        this.app_count = app_count;
        this.backlog = backlog;
    }

    public int getApp_count() {
        return app_count;
    }

    public int getBacklog() {
        return backlog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", app_count=" + app_count +
                ", backlog=" + backlog +
                '}';
    }
}
