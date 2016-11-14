/**
 *      File: GroupTotal.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This inherits Visitor and gets a group total
 *
 */
package minitwitter;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Van Muse
 */
public class GroupTotal implements Visitor {

    private int total = 0;

    @Override
    public void visit(Object n) {
        try {
            if ((Group) ((DefaultMutableTreeNode) n).getUserObject() instanceof Group) {
                total++;
            }
        } catch (Exception E) {

        }
    }

    /**
     * Returns the total of groups
     *
     * @return
     */
    public int result() {
        return total;
    }

}
