package minitwitter;

import java.util.Enumeration;
import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author Van Muse
 */
public class TwitterTree extends DefaultTreeModel implements Visitable{
    private Map<String,DefaultMutableTreeNode> map;
    public TwitterTree(TreeNode root) {
        super(root);
    }
    /**
     * This is for adding a leaf onto the tree
     * @param dir
     * @param name
     * @return 
     */
    
    public DefaultMutableTreeNode addLeaf(DefaultMutableTreeNode dir, String name){
        DefaultMutableTreeNode leaf = new DefaultMutableTreeNode(new User(name));
        leaf.setAllowsChildren(false);
        dir.add(leaf);
        return dir;
    }
    /**
     * This is for adding a group on to the tree
     * @param dir
     * @param name
     * @return 
     */
    public DefaultMutableTreeNode addGroup(DefaultMutableTreeNode dir, String name){
        DefaultMutableTreeNode fold = new DefaultMutableTreeNode(name);
        fold.setAllowsChildren(true);
        dir.add(fold);
        return dir;
    }

    @Override
    public void accept(Visitor visitor) {
        map.put(this.getRoot().toString(), (DefaultMutableTreeNode) this.getRoot());
        for (Map.Entry<String, DefaultMutableTreeNode> v : map.entrySet()){
                  visitor.visit(v.getValue());
        }
    }
    /**
     * This is supposed to return a User object with the string ID
     * However I had difficulty trying to find the User object, and was getting
     * a string instead
     * @param id
     * @return 
     */
    public User getUser(String id){
        Enumeration en = ((DefaultMutableTreeNode) this.getRoot()).preorderEnumeration();
        while (en.hasMoreElements()) {
            User node = (User) ((DefaultMutableTreeNode)en.nextElement()).getUserObject();
            System.out.println(node.getClass().getName());
//            User use = (User) ;
//            if (use.getUserName().equals(id))
//                return use;         
        }
        return null;
    }    
}
