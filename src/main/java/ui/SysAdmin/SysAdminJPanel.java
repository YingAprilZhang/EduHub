/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SysAdmin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import model.db.DB4OUtil;

/**
 *
 * @author aprilyz
 */
public class SysAdminJPanel extends javax.swing.JPanel {
    
    Business business = Business.getInstance();
    JPanel workArea;
    UserAccount account;
            
    /**
     * Creates new form SysAdminWorkArea
     */
    public SysAdminJPanel(JPanel workArea, UserAccount account) {
        
        this.workArea = workArea;
        this.account = account;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        orgBtn = new javax.swing.JButton();
        userBtn = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        leftPanel.setBackground(new java.awt.Color(132, 178, 208));

        orgBtn.setText("Manage Enterprise");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });

        userBtn.setText("Manage Users");
        userBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(userBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orgBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(478, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        // TODO add your handling code here:
        ManageOrgJPanel panel = new ManageOrgJPanel(rightPanel);
        rightPanel.add("ManageOrgJPanel",panel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_orgBtnActionPerformed

    private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
        // TODO add your handling code here:
        ManageUserJPanel panel = new ManageUserJPanel(rightPanel);
        rightPanel.add("ManageUserJPanel",panel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_userBtnActionPerformed

     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton orgBtn;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton userBtn;
    // End of variables declaration//GEN-END:variables
}
