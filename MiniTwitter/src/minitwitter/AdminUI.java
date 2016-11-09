package minitwitter;

import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Van Muse
 */
public class AdminUI extends javax.swing.JFrame {

    private static AdminUI instance = null;
    DecimalFormat df = new DecimalFormat("#.##");                     
    /**
     * Creates new form AdminUI
     */
    private AdminUI() {
        initComponents();
        
        /**
         * This is for rendering the look of the JTree
         */
        twitterTree.setCellRenderer(new DefaultTreeCellRenderer() {
            private Icon groupIcon = UIManager.getIcon("Tree.openIcon");

            @Override
            public Component getTreeCellRendererComponent(JTree tree,
                    Object value, boolean selected, boolean expanded,
                    boolean isLeaf, int row, boolean focused) {
                Component c = super.getTreeCellRendererComponent(tree, value,
                        selected, expanded, isLeaf, row, focused);

                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                if (!node.getAllowsChildren()) {
                    setIcon(null);
                } else {
                    setIcon(groupIcon);
                }
                return c;
            }
        });
    }

    public static AdminUI getInstance() {
        if (instance == null) {
            synchronized (AdminUI.class) {
                if (instance == null) {
                    instance = new AdminUI();
                }
            }
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userIDText = new javax.swing.JTextField();
        groupIDText = new javax.swing.JTextField();
        addUserButton = new javax.swing.JButton();
        addGroupButton = new javax.swing.JButton();
        openUserViewButton = new javax.swing.JButton();
        showUserTotalButton = new javax.swing.JButton();
        showGroupTotalButton = new javax.swing.JButton();
        showMessagesTotalButton = new javax.swing.JButton();
        positivePercentagesButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        twitterTree = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        addGroupButton.setText("Add Group");
        addGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupButtonActionPerformed(evt);
            }
        });

        openUserViewButton.setText("Open User View");
        openUserViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewButtonActionPerformed(evt);
            }
        });

        showUserTotalButton.setText("Show User Total");
        showUserTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserTotalButtonActionPerformed(evt);
            }
        });

        showGroupTotalButton.setText("Show Group Total");
        showGroupTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupTotalButtonActionPerformed(evt);
            }
        });

        showMessagesTotalButton.setText("Show Messages Total");
        showMessagesTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessagesTotalButtonActionPerformed(evt);
            }
        });

        positivePercentagesButton.setText("Show Positive Percentage");
        positivePercentagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positivePercentagesButtonActionPerformed(evt);
            }
        });

        twitterTree.setModel(new TwitterTree(new DefaultMutableTreeNode(new Group("Root"))));
        jScrollPane2.setViewportView(twitterTree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(showMessagesTotalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showUserTotalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showGroupTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positivePercentagesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userIDText, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(groupIDText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGroupButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(openUserViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUserButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(groupIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGroupButton))
                        .addGap(18, 18, 18)
                        .addComponent(openUserViewButton)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showUserTotalButton)
                            .addComponent(showGroupTotalButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showMessagesTotalButton)
                            .addComponent(positivePercentagesButton)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
        /**
         * This method is responsible for creating a user, add it to the 
         * tree, and update the display.
         */
        DefaultMutableTreeNode parentNode = null;
        DefaultMutableTreeNode child = null;
        TreePath path = twitterTree.getSelectionPath();
        if (path == null) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "Please select group to add user",
                    "Selection Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            parentNode = (DefaultMutableTreeNode) (path.getLastPathComponent());
            child = ((TwitterTree) twitterTree.getModel()).addLeaf(parentNode,userIDText.getText().trim());
            twitterTree.scrollPathToVisible(path.pathByAddingChild(child));
            ((DefaultTreeModel) twitterTree.getModel()).reload();
        }
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void addGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupButtonActionPerformed
        /**
         * This method is responsible for creating a group, adding it to the 
         * tree, and update the display
         */
        DefaultMutableTreeNode parentNode = null;
        DefaultMutableTreeNode group = null;
        TreePath path = twitterTree.getSelectionPath();
        if (path == null) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "Please select group to add new group",
                    "Selection Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            parentNode = (DefaultMutableTreeNode) (path.getLastPathComponent());
            group = ((TwitterTree) twitterTree.getModel()).addGroup(parentNode, groupIDText.getText().trim());
            twitterTree.scrollPathToVisible(path.pathByAddingChild(group));
            ((DefaultTreeModel) twitterTree.getModel()).reload();
        }

    }//GEN-LAST:event_addGroupButtonActionPerformed

    private void openUserViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewButtonActionPerformed
        /**
         * This method is responsible for opening the user view and sending
         * in the tree model and the user
         */
        DefaultMutableTreeNode leaf = null;
        TreePath path = twitterTree.getSelectionPath();
        leaf = (DefaultMutableTreeNode) path.getLastPathComponent();
        if (leaf.getAllowsChildren()) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "You must select a user",
                    "Selection Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (leaf.isLeaf()) {
            new UserUI((TwitterTree)twitterTree.getModel(), (User)leaf.getUserObject()).setVisible(true);
        }
    }//GEN-LAST:event_openUserViewButtonActionPerformed

    private void showUserTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserTotalButtonActionPerformed
        // TODO add your handling code here:
        UserTotal user = new UserTotal();
        ((TwitterTree) twitterTree.getModel()).accept(user);
        showDiag(showMessagesTotalButton.getText(),"User Total", String.valueOf(user.result()));
    }//GEN-LAST:event_showUserTotalButtonActionPerformed

    private void showGroupTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupTotalButtonActionPerformed
        // TODO add your handling code here:
         GroupTotal group = new GroupTotal();
        ((TwitterTree) twitterTree.getModel()).accept(group);
        showDiag(showMessagesTotalButton.getText(),"Group Total", String.valueOf(group.result()));
    }//GEN-LAST:event_showGroupTotalButtonActionPerformed

    private void showMessagesTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessagesTotalButtonActionPerformed
        // TODO add your handling code here:
         MessagesTotal messages = new MessagesTotal();
        ((TwitterTree) twitterTree.getModel()).accept(messages);
        showDiag(showMessagesTotalButton.getText(),"Total Messages", String.valueOf(messages.result()));
    }//GEN-LAST:event_showMessagesTotalButtonActionPerformed

    private void positivePercentagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positivePercentagesButtonActionPerformed
        // TODO add your handling code here:
         PositivePercentage percent = new PositivePercentage();
        ((TwitterTree) twitterTree.getModel()).accept(percent);
        showDiag(showMessagesTotalButton.getText(),"Positve Percentage", df.format(percent.result())+"%");
    }//GEN-LAST:event_positivePercentagesButtonActionPerformed

    private void showDiag(String title, String form, String total){
        JFrame frame = new JFrame();
         JOptionPane.showMessageDialog(frame,
                    form+": "+total,
                    title,
                    JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroupButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JTextField groupIDText;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton openUserViewButton;
    private javax.swing.JButton positivePercentagesButton;
    private javax.swing.JButton showGroupTotalButton;
    private javax.swing.JButton showMessagesTotalButton;
    private javax.swing.JButton showUserTotalButton;
    private javax.swing.JTree twitterTree;
    private javax.swing.JTextField userIDText;
    // End of variables declaration//GEN-END:variables

}
