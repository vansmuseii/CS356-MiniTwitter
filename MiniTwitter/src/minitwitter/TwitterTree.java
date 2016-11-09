/**
 *      File: TwitterTree.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 2
 *      Date Last Modified: 11/09/2016
 *
 *      Purpose: This is the overall tree of how to control the
 *      tree.
 *
 */

package minitwitter;

import java.util.Enumeration;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Van Muse
 */
public class TwitterTree extends DefaultTreeModel implements Visitable {

    public TwitterTree(TreeNode root) {
        super(root);
    }

    /**
     * This is for adding a leaf onto the tree
     *
     * @param dir
     * @param name
     * @return
     */
    public DefaultMutableTreeNode addLeaf(DefaultMutableTreeNode dir, String name) {
        DefaultMutableTreeNode leaf = new DefaultMutableTreeNode(new User(name));
        leaf.setAllowsChildren(false);
        dir.add(leaf);
        return dir;
    }

    /**
     * This is for adding a group on to the tree
     *
     * @param dir
     * @param name
     * @return
     */
    public DefaultMutableTreeNode addGroup(DefaultMutableTreeNode dir, String name) {
        DefaultMutableTreeNode fold = new DefaultMutableTreeNode(new Group(name));
        fold.setAllowsChildren(true);
        dir.add(fold);
        return dir;
    }

    @Override
    public void accept(Visitor visitor) {
        Enumeration en = ((DefaultMutableTreeNode) this.getRoot()).preorderEnumeration();
        while (en.hasMoreElements()) {
            TreeNode user = (DefaultMutableTreeNode) en.nextElement();
            visitor.visit(user);
        }
    }

    /**
     * This is supposed to return a User object with the string ID.
     *
     * @param id
     * @return
     */
    public User getUser(String id) {
        Enumeration en = ((DefaultMutableTreeNode) this.getRoot()).preorderEnumeration();
        while (en.hasMoreElements()) {
            try {
                User use = (User) ((DefaultMutableTreeNode) en.nextElement()).getUserObject();
                if (use.getUserName().equals(id)) {
                    return use;
                }
            } catch (Exception e) {

            }
        }
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame,
                "Unable to find User: " + id,
                "Search error",
                JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
