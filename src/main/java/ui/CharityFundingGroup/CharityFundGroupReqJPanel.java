/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CharityFundingGroup;

/**
 *
 * @author kkkkayla
 */
public class CharityFundGroupReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CharityFundGroupJPanel
     */
    
    
    public CharityFundGroupReqJPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        cmbSchool = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        btnDeny = new javax.swing.JButton();
        btnAccept1 = new javax.swing.JButton();

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Required Funding", "Status "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 290, 800, 250);

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lblWelcome.setText("Welcome Funding Group");
        lblWelcome.setToolTipText("");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblWelcome);
        lblWelcome.setBounds(10, 110, 1050, 40);

        cmbSchool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbSchool);
        cmbSchool.setBounds(180, 220, 130, 40);

        jLabel1.setText("School:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 220, 100, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(1060, 0, 383, 900);

        btnDeny.setText("Deny");
        jPanel1.add(btnDeny);
        btnDeny.setBounds(750, 590, 170, 29);

        btnAccept1.setText("Accept");
        jPanel1.add(btnAccept1);
        btnAccept1.setBounds(530, 590, 170, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1433, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAccept1;
    private javax.swing.JButton btnDeny;
    private javax.swing.JComboBox<String> cmbSchool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
