/**
 *      File: UserTotal.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This inherits Visitor and returns the user total
 *
 */
package minitwitter;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Van Muse
 */
public class UserTotal implements Visitor {

    private int total = 0;

    @Override
    public void visit(Object n) {
        try {
            if ((User) ((DefaultMutableTreeNode) n).getUserObject() instanceof User) {
                total++;
            }
        } catch (Exception e) {
        }
    }

    /**
     * Returns the number of Visitors
     *
     * @return
     */
    public int result() {
        return total;
    }

}
