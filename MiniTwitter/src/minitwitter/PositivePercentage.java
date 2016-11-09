/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.util.Arrays;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author VANSKEES
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

    public double result() {
        return (count*100.0)/total;
    }

}
