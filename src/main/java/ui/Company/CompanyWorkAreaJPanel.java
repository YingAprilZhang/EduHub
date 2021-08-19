/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Company;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Business;
import model.Company.CompanyManager;
import model.UserAccount.UserAccount;

/**
 *
 * @author kkkkayla
 */
public class CompanyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CompanyJPanel
     */
    JPanel userProcessContainer;
    Business business;
    CompanyManager company;
    UserAccount account;

    public CompanyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.company = (CompanyManager) account;

        lblCompany.setText(company.getUsername());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblReq = new javax.swing.JLabel();
        logoRequest = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblViewData = new javax.swing.JLabel();
        logoStudent = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Company Work Area");

        lblReq.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblReq.setText("Manage My Requests");
        lblReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReqMouseClicked(evt);
            }
        });

        logoRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-communicate-50.png"))); // NOI18N
        logoRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoRequestMouseClicked(evt);
            }
        });

        lblCompany.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCompany.setText("<value>");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Company:");

        lblViewData.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblViewData.setText("View School Data");
        lblViewData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewDataMouseClicked(evt);
            }
        });

        logoStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-student-40.png"))); // NOI18N
        logoStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoStudentMouseClicked(evt);
            }
        });

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logoRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReq))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logoStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblCompany)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(bg))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCompany))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblViewData)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblReq)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoRequestMouseClicked
        // TODO add your handling code here:
        /*
        if(country == null){
            JOptionPane.showMessageDialog(this, "Plese select a country first.");
            return;
        }
        CountryManagerRequestJPanel cmrj = (CountryManagerRequestJPanel) new CountryManagerRequestJPanel(userProcessContainer, account, countryManager);
        userProcessContainer.add("CountryManagerRequestJPanel", cmrj);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
         */
    }//GEN-LAST:event_logoRequestMouseClicked

    private void logoStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoStudentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoStudentMouseClicked

    private void lblViewDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewDataMouseClicked
        // TODO add your handling code here:
        ViewStudentJPanel vsjp = new ViewStudentJPanel(userProcessContainer, account, business);
        userProcessContainer.add(vsjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblViewDataMouseClicked

    private void lblReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReqMouseClicked
        // TODO add your handling code here:
        ManageRequestJPanel cegrjp = new ManageRequestJPanel(userProcessContainer, account, business);
        userProcessContainer.add(cegrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblReqMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblReq;
    private javax.swing.JLabel lblViewData;
    private javax.swing.JLabel logoRequest;
    private javax.swing.JLabel logoStudent;
    // End of variables declaration//GEN-END:variables
}
