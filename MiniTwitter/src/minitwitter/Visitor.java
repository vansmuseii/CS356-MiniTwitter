/**
 *      File: Visitor.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This interface sets the visitor.
 *
 */
package minitwitter;

/**
 *
 * @author Van Muse
 */
public interface Visitor {

    /**
     * This for the visit method in each user
     *
     * @param n
     */
    void visit(Object n);
}
