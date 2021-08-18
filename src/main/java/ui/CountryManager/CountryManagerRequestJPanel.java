/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CountryManager;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.CountryManager.CountryManager;
import model.Request.Request;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public class CountryManagerRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CountryManagerRequestJPanel
     */
    JPanel userProcessContainer;
    CountryManager countryManager;
    UserAccount account;
    
    public CountryManagerRequestJPanel(JPanel userProcessContainer, UserAccount account, CountryManager countryManager) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.countryManager = countryManager;
        
        refreshReceivedTable();
        refreshSentTable();
    }

    public void refreshReceivedTable(){
//        DefaultTableModel model = (DefaultTableModel) tblReceived.getModel();
//        model.setRowCount(0);
//
//        for(Request r: countryManager.getRequestQueue()){
//            if(r.getReceiver() == account){
//                Object[] row = new Object[3];
//                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                row[0] = df.format(r.getRequestDate());
//                row[1] = r.getSender();
//                row[2] = r;
//                model.addRow(row);
//            }
//        }
    }
    
    public void refreshSentTable(){
//        DefaultTableModel model = (DefaultTableModel) tblReceived.getModel();
//        model.setRowCount(0);
//
//        for(Request r: countryManager.getRequestQueue()){
//            if(r.getSender() == account){
//                Object[] row = new Object[3];
//                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                row[0] = df.format(r.getRequestDate());
//                row[1] = r.getReceiver();
//                row[2] = r;
//                model.addRow(row);
//            }
//        }
//
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceived = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSent = new javax.swing.JTable();
        btnViewReceived = new javax.swing.JButton();
        btnViewSent = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("My Request Work Area");

        tblReceived.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Received Date", "Sender", "Title"
            }
        ));
        jScrollPane1.setViewportView(tblReceived);

        tblSent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sent Date", "Receiver", "Title"
            }
        ));
        jScrollPane2.setViewportView(tblSent);

        btnViewReceived.setText("View Received Request");
        btnViewReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReceivedActionPerformed(evt);
            }
        });

        btnViewSent.setText("View Sent Request");
        btnViewSent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSentActionPerformed(evt);
            }
        });

        btnCreate.setText("Create New Request");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewReceived))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewSent)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate)))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(bg))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnViewReceived, btnViewSent});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewSent, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewReceived))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReceivedActionPerformed
        // TODO add your handling code here:
        int indexRow = tblReceived.getSelectedRow();
        if(indexRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a request to view.");
            return;
        }
        Request r = (Request) tblReceived.getValueAt(indexRow, 2);
        CountryViewRequestJPanel cvrjp = (CountryViewRequestJPanel) new CountryViewRequestJPanel(userProcessContainer, account, r);
        userProcessContainer.add("CountryViewRequestJPanel", cvrjp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);

    }//GEN-LAST:event_btnViewReceivedActionPerformed

    private void btnViewSentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewSentActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    public void back(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.last(userProcessContainer);        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnViewReceived;
    private javax.swing.JButton btnViewSent;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblReceived;
    private javax.swing.JTable tblSent;
    // End of variables declaration//GEN-END:variables
}
