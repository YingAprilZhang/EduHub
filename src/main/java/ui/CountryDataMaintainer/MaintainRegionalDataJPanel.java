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
public class MaintainRegionalDataJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MaintainRegionalDataJPanel
     */
    JPanel userProcessContainer;
    Country country;
    
    public MaintainRegionalDataJPanel(JPanel userProcessContainer, Country country) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.country = country;
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
        txtFemaleOut = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        logoGender = new javax.swing.JLabel();
        passwordLbl1 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        name3 = new javax.swing.JLabel();
        txtMaleMeanYear = new javax.swing.JTextField();
        txtFemaleMeanYear = new javax.swing.JTextField();
        name4 = new javax.swing.JLabel();
        txtMaleEnroll = new javax.swing.JTextField();
        txtFemaleEnroll = new javax.swing.JTextField();
        name5 = new javax.swing.JLabel();
        txtMaleProgression = new javax.swing.JTextField();
        txtFemaleProgression = new javax.swing.JTextField();
        txtMaleOut = new javax.swing.JTextField();
        logoGender1 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        txtUnemployment = new javax.swing.JTextField();
        name8 = new javax.swing.JLabel();
        txtExp = new javax.swing.JTextField();
        name9 = new javax.swing.JLabel();
        txtPupilTeacher = new javax.swing.JTextField();
        name10 = new javax.swing.JLabel();
        txtGDP = new javax.swing.JTextField();
        name11 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        name12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        passwordLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLbl.setText("FEMALE");
        jLayeredPane1.add(passwordLbl);
        passwordLbl.setBounds(620, 250, 70, 22);

        txtFemaleOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleOut);
        txtFemaleOut.setBounds(540, 290, 210, 40);

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
        name2.setText("Add New Annual Data");
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

        txtYear.setText("YYYY");
        txtYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtYear);
        txtYear.setBounds(110, 120, 210, 30);

        name3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name3.setText("Mean Years of Education");
        jLayeredPane1.add(name3);
        name3.setBounds(60, 370, 200, 17);

        txtMaleMeanYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleMeanYear);
        txtMaleMeanYear.setBounds(290, 360, 210, 40);

        txtFemaleMeanYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleMeanYear);
        txtFemaleMeanYear.setBounds(540, 360, 210, 40);

        name4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name4.setText("School Enrollment Rate");
        jLayeredPane1.add(name4);
        name4.setBounds(60, 440, 210, 17);

        txtMaleEnroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleEnroll);
        txtMaleEnroll.setBounds(290, 430, 210, 40);

        txtFemaleEnroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleEnroll);
        txtFemaleEnroll.setBounds(540, 430, 210, 40);

        name5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name5.setText("Progression to Higher Education");
        jLayeredPane1.add(name5);
        name5.setBounds(60, 510, 230, 17);

        txtMaleProgression.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleProgression);
        txtMaleProgression.setBounds(290, 500, 210, 40);

        txtFemaleProgression.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtFemaleProgression);
        txtFemaleProgression.setBounds(540, 500, 210, 40);

        txtMaleOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtMaleOut);
        txtMaleOut.setBounds(290, 290, 210, 40);

        logoGender1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-kyrgyzstani-som-50.png"))); // NOI18N
        jLayeredPane1.add(logoGender1);
        logoGender1.setBounds(840, 170, 60, 70);

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

        txtUnemployment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtUnemployment);
        txtUnemployment.setBounds(1090, 290, 210, 40);

        name8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name8.setText("expenditure)");
        jLayeredPane1.add(name8);
        name8.setBounds(860, 380, 220, 30);

        txtExp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtExp);
        txtExp.setBounds(1090, 360, 210, 40);

        name9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name9.setText("Pupil-teacher Ratio");
        jLayeredPane1.add(name9);
        name9.setBounds(860, 440, 210, 17);

        txtPupilTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtPupilTeacher);
        txtPupilTeacher.setBounds(1090, 430, 210, 40);

        name10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name10.setText("GDP per capita");
        jLayeredPane1.add(name10);
        name10.setBounds(860, 510, 230, 17);

        txtGDP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 176, 207)));
        jLayeredPane1.add(txtGDP);
        txtGDP.setBounds(1090, 500, 210, 40);

        name11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name11.setText("Government expenditure");
        jLayeredPane1.add(name11);
        name11.setBounds(860, 340, 200, 30);

        btnSave.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnSave);
        btnSave.setBounds(60, 600, 110, 40);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnBack);
        btnBack.setBounds(20, 10, 110, 40);

        name12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        name12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name12.setText("on education(% of government");
        jLayeredPane1.add(name12);
        name12.setBounds(860, 360, 220, 30);

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
            Integer year; 

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
        
        if(txtYear.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please make sure to enter all data.");
            return;
        }else{
            try{
                year = Integer.parseInt(txtYear.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please make sure to enter correct format(yyyy) for year");
                return;
            }
        }
        
        MacroData md = country.addMacroData(year);
        md.setYear(year);
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
    
    public void back(){
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CountryDataMaintainJPanel cdmjp = (CountryDataMaintainJPanel) component;
        cdmjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.last(userProcessContainer);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel logoGender;
    private javax.swing.JLabel logoGender1;
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
