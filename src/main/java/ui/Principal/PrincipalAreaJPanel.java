/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Principal;

import java.awt.CardLayout;
import java.awt.Cursor;
import javax.swing.JPanel;
import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class PrincipalAreaJPanel extends javax.swing.JPanel {

    JPanel workArea;
    UserAccount account;
            
    /**
     * Creates new form PrincipalAreaJPanel
     */
    public PrincipalAreaJPanel(JPanel workArea, UserAccount account) {
            
        initComponents();
        
        this.workArea = workArea;
        this.account = account;
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
        logoRequest = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoAnalyze = new javax.swing.JLabel();
        logoRequest1 = new javax.swing.JLabel();
        schoolBtn = new javax.swing.JButton();
        studentBtn = new javax.swing.JButton();
        reqBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("School Principal Work Area");

        logoRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-communicate-50.png"))); // NOI18N
        logoRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoRequestMouseClicked(evt);
            }
        });

        lblCountry.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCountry.setText("<School Label>");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("School:");

        logoAnalyze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-combo-chart-64.png"))); // NOI18N
        logoAnalyze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoAnalyzeMouseClicked(evt);
            }
        });

        logoRequest1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-communicate-50.png"))); // NOI18N
        logoRequest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoRequest1MouseClicked(evt);
            }
        });

        schoolBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        schoolBtn.setText("Manage School Information");
        schoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolBtnActionPerformed(evt);
            }
        });

        studentBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        studentBtn.setText("View Student Data Summary");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        reqBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        reqBtn.setText("Manage My Requests");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 744, Short.MAX_VALUE)
                .addComponent(bg))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblCountry))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCountry))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(logoAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(schoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(logoRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(logoRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(reqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))))
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

    private void logoAnalyzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoAnalyzeMouseClicked
        // TODO add your handling code here:
        /*
        int selectedRow = tblYear.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a year.");
            return;
        }

        MacroData md = (MacroData) tblYear.getValueAt(selectedRow, 0);
        ViewRegionalDataJPanel vrdj = (ViewRegionalDataJPanel) new ViewRegionalDataJPanel(userProcessContainer, md, country);
        userProcessContainer.add("ViewRegionalDataJPanel", vrdj);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
*/
    }//GEN-LAST:event_logoAnalyzeMouseClicked

    private void logoRequest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoRequest1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoRequest1MouseClicked

    private void schoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolBtnActionPerformed
        // TODO add your handling code here:
        ManageSchoolInfoJPanel msijp = new ManageSchoolInfoJPanel(workArea, account);
        workArea.add("ManageSchoolInfoJPanel",msijp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_schoolBtnActionPerformed

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentBtnActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        // TODO add your handling code here:
        PrincipalReqJPanel prjp = new PrincipalReqJPanel(workArea, account);
        workArea.add("PrincipalReqJPanel",prjp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_reqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel logoAnalyze;
    private javax.swing.JLabel logoRequest;
    private javax.swing.JLabel logoRequest1;
    private javax.swing.JButton reqBtn;
    private javax.swing.JButton schoolBtn;
    private javax.swing.JButton studentBtn;
    // End of variables declaration//GEN-END:variables
}
