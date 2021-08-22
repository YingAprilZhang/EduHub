/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CountryDataMaintainer;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Country.Country;
import model.DataAnalyze.MacroData;

/**
 *
 * @author changxu
 */
public class ViewRegionalDataJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MaintainRegionalDataJPanel
     */
    
    JPanel userProcessContainer;
    MacroData md;
    Country country;
    
    public ViewRegionalDataJPanel(JPanel userProcessContainer, MacroData md, Country country) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.md = md;
        this.country = country;
        
        txtExp.setText(String.valueOf(md.getEduExp()));
        txtFemaleEnroll.setText(String.valueOf(md.getFemaleEnroll()));
        txtFemaleMeanYear.setText(String.valueOf(md.getFemaleMeanYears()));
        txtFemaleOut.setText(String.valueOf(md.getFemaleOutSchool()));
        txtFemaleProgression.setText(String.valueOf(md.getFemaleProgress()));
        txtGDP.setText(String.valueOf(md.getGdp()));
        txtMaleEnroll.setText(String.valueOf(md.getMaleEnroll()));
        txtMaleMeanYear.setText(String.valueOf(md.getMaleMeanYears()));
        txtMaleOut.setText(String.valueOf(md.getMaleOutSchool()));
        txtMaleProgression.setText(String.valueOf(md.getMaleProgress()));
        txtPupilTeacher.setText(String.valueOf(md.getPupilTeacher()));
        txtUnemployment.setText(String.valueOf(md.getUnemploy()));
        txtYear.setText(String.valueOf(md.getYear()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        passwordLbl = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        logoGender = new javax.swing.JLabel();
        passwordLbl1 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        name10 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        logoGender2 = new javax.swing.JLabel();
        txtMaleOut = new javax.swing.JTextField();
        txtFemaleOut = new javax.swing.JTextField();
        txtFemaleMeanYear = new javax.swing.JTextField();
        txtMaleMeanYear = new javax.swing.JTextField();
        txtMaleEnroll = new javax.swing.JTextField();
        txtFemaleEnroll = new javax.swing.JTextField();
        txtFemaleProgression = new javax.swing.JTextField();
        txtMaleProgression = new javax.swing.JTextField();
        txtUnemployment = new javax.swing.JTextField();
        txtExp = new javax.swing.JTextField();
        txtPupilTeacher = new javax.swing.JTextField();
        txtGDP = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        name12 = new javax.swing.JLabel();
        name8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        passwordLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLbl.setText("FEMALE");
        jLayeredPane1.add(passwordLbl);
        passwordLbl.setBounds(620, 250, 70, 22);

        name.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("Gender Equality Data");
        jLayeredPane1.add(name);
        name.setBounds(100, 190, 320, 50);

        name1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name1.setText("Out-of-school Childern Rate");
        jLayeredPane1.add(name1);
        name1.setBounds(60, 300, 200, 17);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Year:");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(60, 110, 90, 50);

        name2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name2.setText("View Annual Data");
        jLayeredPane1.add(name2);
        name2.setBounds(60, 60, 320, 60);

        logoGender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-unisex-50.png"))); // NOI18N
        jLayeredPane1.add(logoGender);
        logoGender.setBounds(50, 180, 60, 70);

        passwordLbl1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        passwordLbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLbl1.setText("MALE");
        jLayeredPane1.add(passwordLbl1);
        passwordLbl1.setBounds(380, 250, 40, 22);

        name3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name3.setText("Mean Years of Education");
        jLayeredPane1.add(name3);
        name3.setBounds(60, 370, 200, 17);

        name4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name4.setText("School Enrollment Rate");
        jLayeredPane1.add(name4);
        name4.setBounds(60, 440, 210, 17);

        name5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name5.setText("Progression to Higher Education");
        jLayeredPane1.add(name5);
        name5.setBounds(60, 510, 230, 17);

        name6.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        name6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name6.setText("Country Macro Data");
        jLayeredPane1.add(name6);
        name6.setBounds(900, 180, 320, 50);

        name7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name7.setText("Unemployment Rate");
        jLayeredPane1.add(name7);
        name7.setBounds(860, 300, 200, 17);

        name9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name9.setText("Pupil-teacher Ratio");
        jLayeredPane1.add(name9);
        name9.setBounds(860, 440, 210, 17);

        name10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name10.setText("GDP per capita");
        jLayeredPane1.add(name10);
        name10.setBounds(860, 510, 230, 17);

        name11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name11.setText("Government expenditure");
        jLayeredPane1.add(name11);
        name11.setBounds(860, 340, 200, 30);

        logoGender2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-kyrgyzstani-som-50.png"))); // NOI18N
        jLayeredPane1.add(logoGender2);
        logoGender2.setBounds(840, 170, 60, 70);

        txtMaleOut.setEditable(false);
        txtMaleOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleOut);
        txtMaleOut.setBounds(290, 290, 210, 40);

        txtFemaleOut.setEditable(false);
        txtFemaleOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleOut);
        txtFemaleOut.setBounds(540, 290, 210, 40);

        txtFemaleMeanYear.setEditable(false);
        txtFemaleMeanYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleMeanYear);
        txtFemaleMeanYear.setBounds(540, 360, 210, 40);

        txtMaleMeanYear.setEditable(false);
        txtMaleMeanYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleMeanYear);
        txtMaleMeanYear.setBounds(290, 360, 210, 40);

        txtMaleEnroll.setEditable(false);
        txtMaleEnroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleEnroll);
        txtMaleEnroll.setBounds(290, 430, 210, 40);

        txtFemaleEnroll.setEditable(false);
        txtFemaleEnroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleEnroll);
        txtFemaleEnroll.setBounds(540, 430, 210, 40);

        txtFemaleProgression.setEditable(false);
        txtFemaleProgression.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleProgression);
        txtFemaleProgression.setBounds(540, 500, 210, 40);

        txtMaleProgression.setEditable(false);
        txtMaleProgression.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleProgression);
        txtMaleProgression.setBounds(290, 500, 210, 40);

        txtUnemployment.setEditable(false);
        txtUnemployment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtUnemployment);
        txtUnemployment.setBounds(1090, 290, 210, 40);

        txtExp.setEditable(false);
        txtExp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtExp);
        txtExp.setBounds(1090, 360, 210, 40);

        txtPupilTeacher.setEditable(false);
        txtPupilTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtPupilTeacher);
        txtPupilTeacher.setBounds(1090, 430, 210, 40);

        txtGDP.setEditable(false);
        txtGDP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtGDP);
        txtGDP.setBounds(1090, 500, 210, 40);

        txtYear.setEditable(false);
        txtYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtYear);
        txtYear.setBounds(110, 120, 210, 30);

        btnSave.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnSave);
        btnSave.setBounds(230, 600, 110, 40);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnBack);
        btnBack.setBounds(20, 10, 110, 40);

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnUpdate);
        btnUpdate.setBounds(60, 600, 110, 40);

        name12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name12.setText("on education(% of government");
        jLayeredPane1.add(name12);
        name12.setBounds(860, 360, 220, 30);

        name8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name8.setText("expenditure)");
        jLayeredPane1.add(name8);
        name8.setBounds(860, 380, 220, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 892, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        double maleOutSchool;
        double femaleOutSchool;
        double maleMeanYears;
        double femaleMeanYears;
        double maleEnroll;
        double femaleEnroll;
        double maleProgress;
        double femaleProgress;

        double unemploy;
        double eduExp;
        double pupilTeacher;
        double gdp;

        try{
            maleOutSchool = Double.parseDouble(txtMaleOut.getText());
            femaleOutSchool = Double.parseDouble(txtFemaleOut.getText());
            maleMeanYears = Double.parseDouble(txtMaleMeanYear.getText());
            femaleMeanYears = Double.parseDouble(txtFemaleMeanYear.getText());
            maleEnroll = Double.parseDouble(txtMaleEnroll.getText());
            femaleEnroll = Double.parseDouble(txtFemaleEnroll.getText());
            maleProgress = Double.parseDouble(txtMaleProgression.getText());
            femaleProgress = Double.parseDouble(txtFemaleProgression.getText());

            unemploy = Double.parseDouble(txtUnemployment.getText());
            eduExp = Double.parseDouble(txtExp.getText());
            pupilTeacher = Double.parseDouble(txtPupilTeacher.getText());
            gdp = Double.parseDouble(txtGDP.getText());

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please make sure all data are double format.");
            return;
        }

        if(txtYear.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure to enter all data.");
            return;
        }

        
        md.setMaleOutSchool(maleOutSchool) ;
        md.setFemaleOutSchool(femaleOutSchool);
        md.setMaleMeanYears(maleMeanYears);
        md.setFemaleMeanYears(femaleMeanYears);
        md.setMaleEnroll(maleEnroll);
        md.setFemaleEnroll(femaleEnroll);
        md.setMaleProgress(maleProgress);
        md.setFemaleProgress(femaleProgress);

        md.setUnemploy(unemploy);
        md.setEduExp(eduExp);
        md.setPupilTeacher(pupilTeacher);
        md.setGdp(gdp);

        back();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtYear.setEditable(true);
        txtExp.setEditable(true);
        txtFemaleEnroll.setEditable(true);
        txtFemaleMeanYear.setEditable(true);
        txtFemaleOut.setEditable(true);
        txtFemaleProgression.setEditable(true);
        txtGDP.setEditable(true);
        txtMaleEnroll.setEditable(true);
        txtMaleMeanYear.setEditable(true);
        txtMaleOut.setEditable(true);
        txtMaleProgression.setEditable(true);
        txtPupilTeacher.setEditable(true);
        txtUnemployment.setEditable(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    public void back(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.last(userProcessContainer);

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel logoGender;
    private javax.swing.JLabel logoGender2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name10;
    private javax.swing.JLabel name11;
    private javax.swing.JLabel name12;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel name8;
    private javax.swing.JLabel name9;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordLbl1;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtFemaleEnroll;
    private javax.swing.JTextField txtFemaleMeanYear;
    private javax.swing.JTextField txtFemaleOut;
    private javax.swing.JTextField txtFemaleProgression;
    private javax.swing.JTextField txtGDP;
    private javax.swing.JTextField txtMaleEnroll;
    private javax.swing.JTextField txtMaleMeanYear;
    private javax.swing.JTextField txtMaleOut;
    private javax.swing.JTextField txtMaleProgression;
    private javax.swing.JTextField txtPupilTeacher;
    private javax.swing.JTextField txtUnemployment;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
