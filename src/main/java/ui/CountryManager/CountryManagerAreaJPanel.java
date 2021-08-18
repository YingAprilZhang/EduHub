/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CountryManager;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Business;
import model.Country.Country;
import model.CountryManager.CountryManager;
import model.Role.CountryManagerRole;
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
    Country country;
    CountryManagerRole role;
    CountryManager countryManager;
    
    public CountryManagerAreaJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = Business.getInstance();
        this.role = (CountryManagerRole) account.getRole();
        this.country = account.getOrganization().getCountry();
        this.countryManager = country.getCountryManager();
        
        if(country != null){           
            lblCountry.setText(country.toString());            
        }
        
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
        lblRequest = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoAnalyze = new javax.swing.JLabel();
        lblAnalyze = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Country Manager Work Area");

        logoRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-communicate-50.png"))); // NOI18N
        logoRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoRequestMouseClicked(evt);
            }
        });

        lblRequest.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblRequest.setText("View My Requests");
        lblRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRequestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRequestMouseExited(evt);
            }
        });

        lblCountry.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCountry.setText("<Country Label>");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Country:");

        logoAnalyze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-combo-chart-64.png"))); // NOI18N
        logoAnalyze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoAnalyzeMouseClicked(evt);
            }
        });

        lblAnalyze.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblAnalyze.setText("Analyze Education Data");
        lblAnalyze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnalyzeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAnalyzeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAnalyzeMouseExited(evt);
            }
        });

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
                        .addComponent(logoRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnalyze)))
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
                    .addComponent(logoRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblRequest)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblAnalyze)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoRequestMouseClicked
        // TODO add your handling code here:
//        if(country == null){
//            JOptionPane.showMessageDialog(this, "Plese select a country first.");
//            return;
//        }
//        CountryManagerRequestJPanel cmrj = (CountryManagerRequestJPanel) new CountryManagerRequestJPanel(userProcessContainer, account, countryManager);
//        userProcessContainer.add("CountryManagerRequestJPanel", cmrj);
//        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
//        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_logoRequestMouseClicked

    private void logoAnalyzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoAnalyzeMouseClicked
        // TODO add your handling code here:
//        if(country == null){
//            JOptionPane.showMessageDialog(this, "Plese select a country first.");
//            return;
//        }
//        ManagerAnalyzeWorkAreaJPanel mawajp = (ManagerAnalyzeWorkAreaJPanel) new ManagerAnalyzeWorkAreaJPanel(userProcessContainer, account, country);
//        userProcessContainer.add("ManagerAnalyzeWorkAreaJPanel", mawajp);
//        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
//        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_logoAnalyzeMouseClicked

    private void lblRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRequestMouseClicked
        // TODO add your handling code here:
        if(country == null){
            JOptionPane.showMessageDialog(this, "Plese select a country first.");
            return;
        }
        CountryManagerRequestJPanel cmrj = (CountryManagerRequestJPanel) new CountryManagerRequestJPanel(userProcessContainer, account, countryManager);
        userProcessContainer.add("CountryManagerRequestJPanel", cmrj);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        
    }//GEN-LAST:event_lblRequestMouseClicked

    private void lblRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRequestMouseEntered
        // TODO add your handling code here:
        lblRequest.setFont(new Font("Lucida", Font.BOLD, 18));
    }//GEN-LAST:event_lblRequestMouseEntered

    private void lblRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRequestMouseExited
        // TODO add your handling code here:
        lblRequest.setFont(new Font("Lucida", Font.PLAIN, 18));
    }//GEN-LAST:event_lblRequestMouseExited

    private void lblAnalyzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnalyzeMouseClicked
        // TODO add your handling code here:
        if(country == null){
            JOptionPane.showMessageDialog(this, "Plese select a country first.");
            return;
        }
        ManagerAnalyzeWorkAreaJPanel mawajp = (ManagerAnalyzeWorkAreaJPanel) new ManagerAnalyzeWorkAreaJPanel(userProcessContainer, account, country);
        userProcessContainer.add("ManagerAnalyzeWorkAreaJPanel", mawajp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        
    }//GEN-LAST:event_lblAnalyzeMouseClicked

    private void lblAnalyzeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnalyzeMouseEntered
        // TODO add your handling code here:
        lblAnalyze.setFont(new Font("Lucida", Font.BOLD, 18));
    }//GEN-LAST:event_lblAnalyzeMouseEntered

    private void lblAnalyzeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnalyzeMouseExited
        // TODO add your handling code here:
        lblAnalyze.setFont(new Font("Lucida", Font.PLAIN, 18));
    }//GEN-LAST:event_lblAnalyzeMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAnalyze;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblRequest;
    private javax.swing.JLabel logoAnalyze;
    private javax.swing.JLabel logoRequest;
    // End of variables declaration//GEN-END:variables
}
