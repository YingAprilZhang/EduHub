/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CountryManager;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.TreeMap;
import javax.swing.JPanel;
import model.Country.Country;
import model.DataAnalyze.EduDataAnalyze;
import model.DataAnalyze.MacroDataAnalyze;
import model.UserAccount.UserAccount;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author changxu
 */
public class ManagerEducationDevelopmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerEducationDevelopmentJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Country country;
    
    String developmentIndicator = "";
    TreeMap<Integer, Double> developmentDataMap = new TreeMap<Integer, Double>();
    String equalityIndicator = "";
    TreeMap<Integer, Double> maleEqualityDataMap = new TreeMap<Integer, Double>();
    TreeMap<Integer, Double> femaleEqualityDataMap = new TreeMap<Integer, Double>();
    
    
    
    public ManagerEducationDevelopmentJPanel(JPanel userProcessContainer, UserAccount account, Country country) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.country = country;
        
    }

    public void refreshFluc(){        
        String selectedItem = (String) comboDevelopment.getSelectedItem();
        switch(selectedItem){
            case "Unemployement Rate" :
                developmentIndicator = "Unemployement rate";
                developmentDataMap = MacroDataAnalyze.getUnemployment(country);
                break;
            case "Government expenditure on education(% of government expenditure)" :
                developmentIndicator = "Government Education Expenditure";
                developmentDataMap = MacroDataAnalyze.getEduExp(country);
                break;
            case "Pupil-teacher ratio" :
                developmentIndicator = "Pupil-teacher Ratio";
                developmentDataMap = MacroDataAnalyze.getPupilTeacher(country);
                break;
            case "GDP" :
                developmentIndicator = "GDP";
                developmentDataMap = MacroDataAnalyze.getGdp(country);
                break;
                
        }
        
        XYSeriesCollection collection = new XYSeriesCollection();

        XYSeries series = new XYSeries("EducationDevelopment");
        for(Integer year: developmentDataMap.keySet()){
            series.add(year, developmentDataMap.get(year));
        }
        collection.addSeries(series);
    
        JFreeChart lineChart = ChartFactory.createXYLineChart(developmentIndicator + "Fluctuation", "Year", "Value",
        collection, PlotOrientation.VERTICAL, true, true, false);
        
        ChartPanel lineChartPanel = new ChartPanel(lineChart);
        flucPanel.removeAll();
        flucPanel.add(lineChartPanel, BorderLayout.CENTER);
        flucPanel.validate();

    }
    
    public void refreshRelation(){
        String selectedItem = (String) comboEquality.getSelectedItem();
        switch(selectedItem){
            case "Out of school" :
                equalityIndicator = "Out of School";
                maleEqualityDataMap = MacroDataAnalyze.getOutSchoolMale(country);
                femaleEqualityDataMap = MacroDataAnalyze.getOutSchoolFemale(country);
                break;
            case "Mean years of education" :
                equalityIndicator = "Mean Years of Education";
                maleEqualityDataMap = MacroDataAnalyze.getMeanYearsMale(country);
                femaleEqualityDataMap = MacroDataAnalyze.getMeanYearsFemale(country);
                break;
            case "School enrollment" :
                equalityIndicator = "School Enrollment";
                maleEqualityDataMap = MacroDataAnalyze.getEnrollMale(country);
                femaleEqualityDataMap = MacroDataAnalyze.getEnrollFemale(country);
                break;
            case "Progression to higher education" :
                equalityIndicator = "Progression to Higher Education";
                maleEqualityDataMap = MacroDataAnalyze.getProgressMale(country);
                femaleEqualityDataMap = MacroDataAnalyze.getProgressFemale(country);
                break;
            case "Math Score" :
                equalityIndicator = "Math Score";
                maleEqualityDataMap = EduDataAnalyze.getAvgMathScoreMale(country);
                femaleEqualityDataMap = EduDataAnalyze.getAvgMathScoreFemale(country);
                break;
            case "Literacy Score" :
                equalityIndicator = "Literacy Score";
                maleEqualityDataMap = EduDataAnalyze.getAvgLiteracyScoreMale(country);
                femaleEqualityDataMap = EduDataAnalyze.getAvgLiteracyScoreFemale(country);
                break;
            case "Science Score" :
                equalityIndicator = "Science Score";
                maleEqualityDataMap = EduDataAnalyze.getAvgScienceScoreMale(country);
                femaleEqualityDataMap = EduDataAnalyze.getAvgScienceScoreFemale(country);
                break;                                            
        }
        
        TreeMap<Double, Double> maleRelationshipMap = generateRelationshipMap(maleEqualityDataMap, developmentDataMap);
        TreeMap<Double, Double> femaleRelationshipMap = generateRelationshipMap(femaleEqualityDataMap, developmentDataMap);        

        XYSeriesCollection collection = new XYSeriesCollection();
        
        XYSeries maleSeries = new XYSeries("MaleRelationship");
        for(Double x: maleRelationshipMap.keySet()){
            maleSeries.add(x, maleRelationshipMap.get(x));
        }
        collection.addSeries(maleSeries);
        
        XYSeries femaleSeries = new XYSeries("femaleRelationship");
        for(Double x: femaleRelationshipMap.keySet()){
            maleSeries.add(x, femaleRelationshipMap.get(x));
        }
        collection.addSeries(femaleSeries);
        
        JFreeChart lineChart = ChartFactory.createXYLineChart("Equality & Development Relationship", "equalityIndicator", "developmentIndicator",
                collection, PlotOrientation.VERTICAL, true, true, false);
        
        ChartPanel lineChartPanel = new ChartPanel(lineChart);
        relationPanel.removeAll();
        relationPanel.add(lineChartPanel, BorderLayout.CENTER);
        relationPanel.validate();
        
        
    }
    
    public TreeMap<Double, Double> generateRelationshipMap(TreeMap<Integer, Double> equalityMap, TreeMap<Integer, Double> developmentMap){
        TreeMap<Double, Double> resultMap = new TreeMap<Double, Double>();
        Double valueX = 0.0D;
        Double valueY = 0.0D;
        
        for(Integer year: equalityMap.keySet()){            
            if(developmentMap.containsKey(year) == true){
                valueX = equalityMap.get(year);
                valueY = developmentMap.get(year);
                resultMap.put(valueX, valueY);
            }
        }
                
        return resultMap;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboDevelopment = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboEquality = new javax.swing.JComboBox<>();
        btnRefresh = new javax.swing.JButton();
        flucPanel = new javax.swing.JPanel();
        relationPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 250, 250));

        InfoPanel.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Education Development Analyze");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Select an Education Development Indicator:");

        comboDevelopment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unemployement rate", "Government expenditure on education(% of government expenditure)", "Pupil-teacher ratio", "GDP" }));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Select an Education Equality Indicator:");

        comboEquality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Out of school", "Mean years of education", "School enrollment", "Progression to higher education", "Literacy Score", "Math Score", "Science Score" }));

        btnRefresh.setText("Refresh Chart");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboEquality, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(InfoPanelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(comboDevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InfoPanelLayout.setVerticalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboDevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboEquality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addGap(12, 12, 12))
        );

        flucPanel.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout flucPanelLayout = new javax.swing.GroupLayout(flucPanel);
        flucPanel.setLayout(flucPanelLayout);
        flucPanelLayout.setHorizontalGroup(
            flucPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        flucPanelLayout.setVerticalGroup(
            flucPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );

        relationPanel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout relationPanelLayout = new javax.swing.GroupLayout(relationPanel);
        relationPanel.setLayout(relationPanelLayout);
        relationPanelLayout.setHorizontalGroup(
            relationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );
        relationPanelLayout.setVerticalGroup(
            relationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(flucPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(relationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flucPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshFluc();
        refreshRelation();
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void back(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.last(userProcessContainer);                
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> comboDevelopment;
    private javax.swing.JComboBox<String> comboEquality;
    private javax.swing.JPanel flucPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel relationPanel;
    // End of variables declaration//GEN-END:variables
}
