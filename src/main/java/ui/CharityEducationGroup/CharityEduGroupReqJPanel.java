/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CharityEducationGroup;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Business;
import model.CharityEducationGroup.CharityEduGroup;
import model.UserAccount.UserAccount;

/**
 *
 * @author kkkkayla
 */
public class CharityEduGroupReqJPanel extends javax.swing.JPanel {

    JPanel container;

    UserAccount userAccount;

    Business system;

    CharityEduGroup eduGroup;

    /**
     * Creates new form ChrityEduGroupJPanel
     */
    public CharityEduGroupReqJPanel(JPanel container, UserAccount account, Business system) {
        initComponents();
        this.container = container;
        this.userAccount = account;
        this.eduGroup = (CharityEduGroup) account;

        //populateComboSchools();
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
        jTable1 = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        cmbSchool = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnAccept1 = new javax.swing.JButton();
        backLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Required Class", "Status "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(120, 290, 800, 250);

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome Charity Group");
        lblWelcome.setToolTipText("");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblWelcome);
        lblWelcome.setBounds(10, 110, 1050, 40);

        cmbSchool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbSchool);
        cmbSchool.setBounds(180, 220, 130, 30);

        jLabel1.setText("School:");
        add(jLabel1);
        jLabel1.setBounds(120, 220, 100, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N
        add(bg);
        bg.setBounds(1060, 0, 383, 900);

        btnCancel.setText("Cancel");
        add(btnCancel);
        btnCancel.setBounds(740, 590, 170, 29);

        btnAccept1.setText("Accept");
        add(btnAccept1);
        btnAccept1.setBounds(520, 590, 170, 29);

        backLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-to-52.png"))); // NOI18N
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
        });
        add(backLbl);
        backLbl.setBounds(60, 50, 52, 52);
    }// </editor-fold>//GEN-END:initComponents

    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_backLblMouseClicked

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
    private javax.swing.JComboBox<String> cmbSchool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
