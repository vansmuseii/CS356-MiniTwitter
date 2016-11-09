/**
 *      File: Group.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This is supposed to create a Group
 *
 */

package minitwitter;

/**
 *
 * @author Van Muse
 */
public class Group {
    private String group;
    public Group(String name) {
        this.group = name;
    }

    public String getName() {
        return group;
    }

    public String toString() {
        return group;
    }
}
