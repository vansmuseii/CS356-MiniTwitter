/**
 *      File: PositivePercentage.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This inherits Visitor and grabs the positive
 *      feedback from the users.
 *
 */

package minitwitter;

import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Van Muse
 */
public class PositivePercentage implements Visitor {

    private int count = 0;
    private int total = 0;

    @Override
    public void visit(Object n) {
        String[] positiveWords = {"good", "awesome", "great", "excellent"};
        try{
            User user = (User) ((DefaultMutableTreeNode) n).getUserObject();
            Object arr[] = user.getMessages();
            String[] messages = Arrays.copyOf(arr, arr.length, String[].class);
            total += messages.length;
            for (String key : positiveWords) {
                for (String message : messages) {
                    if (message.toLowerCase().contains(key)) {
                        count++;
                    }
                }
            }
        }
        catch (Exception e){
            
        }
    }

    /**
     * Returns the Positive percentage.
     * @return 
     */
    public double result() {
        return (count*100.0)/total;
    }

}
