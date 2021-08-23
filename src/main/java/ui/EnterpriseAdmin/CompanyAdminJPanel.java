/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.EnterpriseAdmin;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.Company.Company;
import model.Country.Country;
import model.Enterprise.Enterprise;
import model.Org.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class CompanyAdminJPanel extends javax.swing.JPanel {
    
    Business business = Business.getInstance();
    JPanel workArea;
    UserAccount account;
    Company company;

    /** Creates new form CompanyAdminJPanel */
    public CompanyAdminJPanel(JPanel workArea, UserAccount account) {
        
        this.workArea = workArea;
        this.account = account;
        initComponents();
        populateComboOrgType();
        this.company = (Company)account.getOrganization().getEnterprise();
        lblEnterprise.setText(this.company.getName());
       
    }
    
     private void populateComboOrgType(){
        for (Organization.OrgType type : Organization.OrgType.values()) {
            if (Enterprise.EtprType.Company == Organization.OrgType2EtprType.get(type)){
                typeBox.addItem(type.name());
            }
        }
    }
    
    private void refreshTable(){
        DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();
        model.setRowCount(0);

        for (Organization o : company.orgList) {
            Object row[] = new Object[2];
            row[0] = o;
            row[1] = o.getOrgType().name();
            model.addRow(row);
        }
     }
     
     private void saveInfo() {
         /*
       DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();
       
       for (int i = 0; i < model.getRowCount(); i++) {
           Organization o = business.getOrganizationDirectory().getOrganizationList().get(i);
           o.setName(tblInfo.getValueAt(i, 0).toString());
           Country country = business.getCountryDirectory().getCountryByName(tblInfo.getValueAt(i, 1).toString());
           o.setCountry(country);
           o.setOrgType(Organization.getOrgTypeByName(tblInfo.getValueAt(i, 2).toString()));
       }
         */
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        typeBox = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblPressure = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblTemperature1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        lblPressure1 = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Org Type"
            }
        ));
        tblInfo.setEnabled(false);
        jScrollPane1.setViewportView(tblInfo);

        btnUpdate.setText("Unlock/Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblPressure.setText("Name:");

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(132, 178, 205), 2, true));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Organizations In Company");

        lblTemperature1.setText("Type:");

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        lblPressure1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPressure1.setText("Enterprise:");

        lblEnterprise.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblEnterprise.setText("<Enterprise>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPressure)
                                        .addComponent(lblTemperature1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(209, 209, 209)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPressure1)
                        .addGap(18, 18, 18)
                        .addComponent(lblEnterprise)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(bg))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblTitle)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPressure1)
                    .addComponent(lblEnterprise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblPressure))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature1)
                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        tblInfo.setEnabled(true);
        btnSave.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveInfo();

        tblInfo.setEnabled(false);
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);

        JOptionPane.showMessageDialog(this, "Information saved.", "Information", JOptionPane.INFORMATION_MESSAGE);

        refreshTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tblInfo.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE );
            return;
        }
        Organization selectedRec = (Organization) tblInfo.getValueAt(row, 0);
        business.getOrganizationDirectory().getOrganizationList().remove(selectedRec);
        company.orgList.remove(selectedRec);
        refreshTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Country country = company.getCountry();
        Organization.OrgType orgType = Organization.getOrgTypeByName(typeBox.getSelectedItem().toString());
         Organization o = business.getOrganizationDirectory().createOrganization(txtName.getText(), country, orgType, company);
        company.orgList.add(o);
        JOptionPane.showMessageDialog(null, "Organization added successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        refreshTable();
        txtName.setText("");
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblPressure;
    private javax.swing.JLabel lblPressure1;
    private javax.swing.JLabel lblTemperature1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtName;
    private javax.swing.JComboBox<String> typeBox;
    // End of variables declaration//GEN-END:variables

}
