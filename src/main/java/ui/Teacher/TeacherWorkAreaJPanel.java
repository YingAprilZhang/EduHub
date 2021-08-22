/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Teacher;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class TeacherWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel workArea;
    UserAccount account;

    /**
     * Creates new form TeacherWorkAreaJPanel
     */
    public TeacherWorkAreaJPanel(JPanel workArea, UserAccount account) {
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

        schoolBtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        logoRequest1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentBtn = new javax.swing.JButton();
        lblStudentName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoAnalyze = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        schoolBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        schoolBtn.setText("Manage Educational Records");
        schoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolBtnActionPerformed(evt);
            }
        });

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_vertical.png"))); // NOI18N

        logoRequest1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-communicate-50.png"))); // NOI18N
        logoRequest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoRequest1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Teacher Work Area");

        studentBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        studentBtn.setText("View Educational Summary");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        lblStudentName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStudentName.setText("<Student Label>");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Teacher:");

        logoAnalyze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-combo-chart-64.png"))); // NOI18N
        logoAnalyze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoAnalyzeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(schoolBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblStudentName))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(logoRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 511, Short.MAX_VALUE)
                .addComponent(bg))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblStudentName))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(schoolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void schoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolBtnActionPerformed
        // TODO add your handling code here:
        TeacherAddScoreJPanel msijp = new TeacherAddScoreJPanel(workArea, account);
        workArea.add("TeacherAddScoreJPanel",msijp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_schoolBtnActionPerformed

    private void logoRequest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoRequest1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoRequest1MouseClicked

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        // TODO add your handling code here:
       TeacherScoreSummaryJPanel msijp = new TeacherScoreSummaryJPanel(workArea, account);
        workArea.add("TeacherScoreSummaryJPanel",msijp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_studentBtnActionPerformed

    private void logoAnalyzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoAnalyzeMouseClicked

    }//GEN-LAST:event_logoAnalyzeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel logoAnalyze;
    private javax.swing.JLabel logoRequest1;
    private javax.swing.JButton schoolBtn;
    private javax.swing.JButton studentBtn;
    // End of variables declaration//GEN-END:variables
}