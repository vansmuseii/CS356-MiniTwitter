/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author VANSKEES
 */
public class TwitterTree extends DefaultTreeModel implements Visitable{
    private Map<String,Node> map;
    
    public TwitterTree(TreeNode root) {
        super(root);
    }
    
    @Override
    public void accept(Visitor visitor) {
        for (Map.Entry<String, Node> entry : map.entrySet()){
			  visitor.visit(entry.getValue());
		}
    }
    
}
