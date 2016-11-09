/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author VANSKEES
 */
public class UserTotal implements Visitor {

    private int total = 0;

    @Override
    public void visit(Object n) {
        try {
            User user = (User) ((DefaultMutableTreeNode) n).getUserObject();
            total++;
        } catch (Exception e) {
        }
    }

    public int result() {
        return total;
    }

}
