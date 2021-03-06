/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CharityEducationGroup;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.CharityEducationGroup.CharityEduManager;
import model.Country.Country;
import model.Request.EduRequest;
import model.Request.Request;
import model.Request.Request.RequestType;
import model.UserAccount.UserAccount;

/**
 *
 * @author kkkkayla
 */
public class CharityEduGroupReqJPanel extends javax.swing.JPanel {

    JPanel container;
    CharityEduManager eduGroup;
    Business business = Business.getInstance();
    UserAccount account;
    /**
     * Creates new form ChrityEduGroupJPanel
     */
    public CharityEduGroupReqJPanel(JPanel container, CharityEduManager eduGroup) {
        initComponents();
        this.container = container;
        
        this.eduGroup = eduGroup;

        //populateComboCountry();
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
        setLayout(null);

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "School", "Request Date", "Title", "Status", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(tblReq);

        add(jScrollPane1);
        jScrollPane1.setBounds(100, 220, 820, 320);

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome Charity Group");
        lblWelcome.setToolTipText("");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblWelcome);
        lblWelcome.setBounds(10, 110, 1050, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N
        add(bg);
        bg.setBounds(1060, 0, 383, 900);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel);
        btnCancel.setBounds(750, 590, 170, 29);

        btnAccept1.setText("Accept");
        btnAccept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccept1ActionPerformed(evt);
            }
        });
        add(btnAccept1);
        btnAccept1.setBounds(410, 590, 170, 29);

        backLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-to-52.png"))); // NOI18N
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
        });
        add(backLbl);
        backLbl.setBounds(60, 50, 52, 52);

        btnViewSent.setText("View  ");
        btnViewSent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSentActionPerformed(evt);
            }
        });
        add(btnViewSent);
        btnViewSent.setBounds(100, 590, 150, 29);
    }// </editor-fold>//GEN-END:initComponents

//    public void populateComboCountry() {
//
//        cmbCountry.removeAllItems();
//        for (Country c : business.getCountryDirectory().getName2Country().values()) {
//            cmbCountry.addItem(c.toString());
//        }
//
//    }
    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblReq.getModel();
        model.setRowCount(0);

        //Country c = business.getCountryDirectory().getCountryByName(cmbCountry.getSelectedItem().toString());
        //System.out.println(">>>>" + c.getRequestList().size());
//        // <<< for debug
//        EduRequest dummyr = new EduRequest();
//        dummyr.setTitle("this is title");
//        dummyr.setRequestType(RequestType.EduRequest);
//        dummyr.setRequestStatusType(Request.RequestStatusType.Sent);
//        ArrayList<EduRequest> ls = new ArrayList<EduRequest>();
//        ls.add(dummyr);
//
//        EduRequest dummyr2 = new EduRequest();
//        dummyr2.setTitle("this is title2");
//        dummyr2.setRequestStatusType(Request.RequestStatusType.Sent);
//        dummyr2.setRequestType(RequestType.FundRequest);
//        ls.add(dummyr2);
//        System.out.println("xxx dummy ls size: " + ls.size());
//        //>>>
//
//        System.out.println("list size: " + c.getRequestList().size());
        for (Country c : business.getCountryDirectory().getName2Country().values()) {
            for (Request r : c.getRequestList()) {
                //       for (EduRequest r : ls) {
                System.out.println(r);

                Object[] row = new Object[5];
                //if(r.getResourceProvider().getName()== eduGroup.getOrganization().getName()){
                if (r.getRequestType() == Request.RequestType.EduRequest) {
                    //if(r.getResourceProvider().getName()== eduGroup.getOrganization().getName()){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    row[0] = r.getSchool()==null?"":r.getSchool().getName();
                    row[1] = df.format(r.getRequestDate());
                    row[2] = r;
                    row[3] = r.getRequestStatusType().toString();
                    row[4] = r.getResolveDate()==null?"":df.format(r.getResolveDate());
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
        
        Request selectedReq = (Request) model.getValueAt(selectedRowIndex, 2);
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
        
        Request selectedReq = (Request) model.getValueAt(selectedRowIndex, 2);
        selectedReq.setResolveDate(new Date());

        selectedReq.setRequestStatusType(Request.RequestStatusType.RejectResourceProvider);

        populateRequestTable();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewSentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSentActionPerformed
        // TODO add your handling code here:
         int indexRow = tblReq.getSelectedRow();
        if(indexRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a request to view.");
            return;
        }
        Request r = (Request) tblReq.getValueAt(indexRow, 2);
        ViewRequestJPanel vrjp = (ViewRequestJPanel) new ViewRequestJPanel(container, account, r);
        container.add("ViewRequestJPanel", vrjp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
    }//GEN-LAST:event_btnViewSentActionPerformed

    private void back() {
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }

    //    public void populateComboSchools(){
    //        for(School s: ){
    //            cmbSchool
    //        }
    //    }

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
