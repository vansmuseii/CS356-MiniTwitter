/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author VANSKEES
 */
public class TwitterTree extends DefaultTreeModel implements Visitable{
    
    public TwitterTree(TreeNode root) {
        super(root);
    }
    
    public DefaultMutableTreeNode addLeaf(DefaultMutableTreeNode group, String name){
        group.add(new DefaultMutableTreeNode ("name"));
        return group;
    }    
    
    @Override
    public void accept(Visitor visitor) {
      
    }

}
