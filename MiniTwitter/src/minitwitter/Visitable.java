/**
 *      File: Visitable.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This interface is supposed to accept a visitor.
 *
 */
package minitwitter;

/**
 *
 * @author Van Muse
 */
public interface Visitable {

    /**
     * This is supposed to accept a visitor.
     *
     * @param visitor
     */
    void accept(Visitor visitor);
}
