/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Company;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.Company.CompanyManager;
import model.Country.Country;
import model.Request.Request;
import model.UserAccount.UserAccount;

/**
 *
 * @author kkkkayla
 */
public class ManageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRequestJPanel
     */
    JPanel container;

    UserAccount userAccount;

    Business business = Business.getInstance();

    CompanyManager company;

    public ManageRequestJPanel(JPanel container,  CompanyManager company) {
        initComponents();
        this.container = container;
        this.company = company;
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReq = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnAccept1 = new javax.swing.JButton();
        backLbl = new javax.swing.JLabel();
        btnViewSent = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Request Date", "Title", "Status ", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(tblReq);

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome Company");
        lblWelcome.setToolTipText("");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        btnCancel.setText("Pass");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAccept1.setText("Accept");
        btnAccept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccept1ActionPerformed(evt);
            }
        });

        backLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-to-52.png"))); // NOI18N
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
        });

        btnViewSent.setText("View  ");
        btnViewSent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(backLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnViewSent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(btnAccept1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(526, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bg)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(backLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 504, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewSent)
                    .addComponent(btnAccept1)
                    .addComponent(btnCancel))
                .addGap(276, 276, 276))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(96, 96, 96)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(bg))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();
        model.setRowCount(0);

        for (Country c : business.getCountryDirectory().getName2Country().values()) {
            for (Request r : c.getRequestList()) {

                Object[] row = new Object[5];
                //if(r.getResourceProvider().getName()== company.getOrganization().getName()){
                if (r.getRequestType() == Request.RequestType.CompanyRequest) {
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    row[0] = r.getSchool().getName();
                    row[1] = df.format(r.getRequestDate());
                    row[2] = r.getTitle();
                    row[3] = r.getRequestStatusType().toString();
                    row[4] = r.getResolveDate() == null ? "" : df.format(r.getResolveDate());
                    model.addRow(row);
                }
                //}
            }
        }
    }


    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_backLblMouseClicked

    private void btnAccept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccept1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblReq.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request first.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();
        Request selectedReq = (Request) model.getValueAt(selectedRowIndex, 0);
        selectedReq.setResolveDate(new Date());

        selectedReq.setRequestStatusType(Request.RequestStatusType.AcceptResourceProvider);

        populateRequestTable();
    }//GEN-LAST:event_btnAccept1ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblReq.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request first.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();
        Request selectedReq = (Request) model.getValueAt(selectedRowIndex, 0);
        selectedReq.setResolveDate(new Date());

        selectedReq.setRequestStatusType(Request.RequestStatusType.RejectResourceProvider);

        populateRequestTable();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewSentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSentActionPerformed
        // TODO add your handling code here:
        int indexRow = tblReq.getSelectedRow();
        if (indexRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request to view.");
            return;
        }
        Request r = (Request) tblReq.getValueAt(indexRow, 2);
        ViewRequestJPanel vrjp = (ViewRequestJPanel) new ViewRequestJPanel(container, userAccount, r);
        container.add("ViewRequestJPanel", vrjp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
    }//GEN-LAST:event_btnViewSentActionPerformed

    private void back() {
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLbl;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAccept1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnViewSent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables
}
