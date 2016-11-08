package minitwitter;

import java.util.Enumeration;
import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Van Muse
 */
public class TwitterTree extends DefaultTreeModel implements Visitable{
    private Map<String,DefaultMutableTreeNode> map;
    public TwitterTree(TreeNode root) {
        super(root);
    }
    
    public DefaultMutableTreeNode addLeaf(DefaultMutableTreeNode dir, String name){
        DefaultMutableTreeNode leaf = new DefaultMutableTreeNode(new User(name));
        leaf.setAllowsChildren(false);
        dir.add(leaf);
        return dir;
    }
    public DefaultMutableTreeNode addGroup(DefaultMutableTreeNode dir, String name){
        DefaultMutableTreeNode fold = new DefaultMutableTreeNode(name);
        fold.setAllowsChildren(true);
        dir.add(fold);
        return dir;
    }

    
    @Override
    public void accept(Visitor visitor) {
        map.put(this.getRoot().toString(), (DefaultMutableTreeNode) this.getRoot());
        for (Map.Entry<String, DefaultMutableTreeNode> entry : map.entrySet()){
                  visitor.visit(entry.getValue());
        }
    }
    
    public User getUser(String id){
        Enumeration en = ((DefaultMutableTreeNode) this.getRoot()).preorderEnumeration();
        while (en.hasMoreElements()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();
            User use = (User) node.getUserObject();
            if (use.getUserName().equals(id))
                return use;         
        }
        return null;
    }    
}
