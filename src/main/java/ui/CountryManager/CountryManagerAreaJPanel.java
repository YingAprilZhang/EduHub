/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CountryManager;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public class CountryManagerAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CountryManagerAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Business business;
    
    public CountryManagerAreaJPanel(JPanel userProcessContainer, UserAccount account, Business business) {
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

        bg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoView = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Country Manager Work Area");

        logoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-communicate-50.png"))); // NOI18N
        logoAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoAddMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("View My Requests");

        lblCountry.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCountry.setText("<Country Label>");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Country:");

        logoView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-combo-chart-64.png"))); // NOI18N
        logoView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoViewMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Analyze Education Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblCountry))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoView, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addComponent(bg))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCountry))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoAddMouseClicked
        // TODO add your handling code here:
        if(country == null){
            JOptionPane.showMessageDialog(this, "Plese select a country first.");
            return;
        }
        MaintainRegionalDataJPanel mrdj = (MaintainRegionalDataJPanel) new MaintainRegionalDataJPanel(userProcessContainer, country);
        userProcessContainer.add("MaintainRegionalDataJPanel", mrdj);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_logoAddMouseClicked

    private void logoViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoViewMouseClicked
        // TODO add your handling code here:
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
    }//GEN-LAST:event_logoViewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel logoAdd;
    private javax.swing.JLabel logoView;
    // End of variables declaration//GEN-END:variables
}
