/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Business;
import model.Country.Country;
import model.Org.Organization;
import model.Role.Role;

/**
 *
 * @author aprilyz
 */
public class SignUpJPanel extends javax.swing.JPanel {
    
    Business business = Business.getInstance();
    JPanel workArea;

    /**
     * Creates new form SignUpJPanel
     */
    public SignUpJPanel(JPanel workArea) {
        this.workArea = workArea;
        
        initComponents();
        
        populateComboRole(); 
        populateComboOrganization(); 
        
        backLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }
    
        private void populateComboRole(){
            for (Role.RoleType type : Role.RoleType.values()) {
                roleBox.addItem(type.getValue());
            }
        }
        
        private void populateComboOrganization() {
            for (Organization organization : business.getOrganizationDirectory().getOrganizationList()) {
                organizationBox.addItem(organization.getName());
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
        backLbl = new javax.swing.JLabel();
        lblTemperature1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        passWordField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();
        roleBox = new javax.swing.JComboBox<>();
        lblTemperature2 = new javax.swing.JLabel();
        organizationBox = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Sign Up");

        backLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-to-52.png"))); // NOI18N
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
        });

        lblTemperature1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTemperature1.setText("Role");

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblCountry.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblCountry.setText("Country");

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username");

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password");

        passWordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordFieldActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });

        roleBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        lblTemperature2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTemperature2.setText("Organization");

        organizationBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        organizationBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationBoxActionPerformed(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(51, 153, 255));
        submitBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(backLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(301, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCountry, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTemperature1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTemperature2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(roleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(organizationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(323, 323, 323))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(388, 388, 388)))))
                .addComponent(bg))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(backLbl)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUsername))
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature2)
                    .addComponent(organizationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_backLblMouseClicked

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void passWordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passWordFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryFieldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here
        Country country = business.getCountryDirectory().getCountryByName(countryField.getText());
        Role.RoleType type = Role.getRoleTypeByValue(roleBox.getSelectedItem().toString());
        Role role = Role.RoleTypeToRoleMapping.get(type);
        Organization org = business.getOrganizationDirectory().getOrgByName(organizationBox.getSelectedItem().toString()); 
        business.getUserAccountDirectory().createUserAccount(userNameField.getText(), 
                passWordField.getText(), nameField.getText(), country, role, org);
        JOptionPane.showMessageDialog(null, "User successfully signed up!", "Info", JOptionPane.INFORMATION_MESSAGE);
        back();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        // TODO add your handling code here 
    }//GEN-LAST:event_submitBtnMouseClicked

    private void organizationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationBoxActionPerformed

    private void back() {
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLbl;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTemperature1;
    private javax.swing.JLabel lblTemperature2;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> organizationBox;
    private javax.swing.JTextField passWordField;
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}