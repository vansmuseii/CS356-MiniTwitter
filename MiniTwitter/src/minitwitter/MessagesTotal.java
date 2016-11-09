/**
 *      File: MessagesTotal.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This inherits Visitor and creates a messages total
 *
 */

package minitwitter;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Van Muse
 */
public class MessagesTotal implements Visitor {

    private int total;

    @Override
    public void visit(Object n) {
        try {
            User user = (User) ((DefaultMutableTreeNode) n).getUserObject();
            total += user.getMessages().length;
        } catch (Exception e){
            
        }
    }
    
    /**
     * Returns the number of messages total
     * @return 
     */
    public int result(){
        return total;
    }

}
