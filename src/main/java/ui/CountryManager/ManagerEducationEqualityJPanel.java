/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CountryManager;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Country.Country;
import model.DataAnalyze.EduDataAnalyze;
import model.DataAnalyze.MacroData;
import model.DataAnalyze.MacroDataAnalyze;
import model.UserAccount.UserAccount;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.RangeType;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author changxu
 */
public class ManagerEducationEqualityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerEducationEqualityJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Country country;
    
    public ManagerEducationEqualityJPanel(JPanel userProcessContainer, UserAccount account, Country country) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.country = country;
        
    }
    
    public void refreshChart(){
        String indicatorName = "";
        TreeMap<Integer, Double> maleDataMap = new TreeMap<Integer, Double>();
        TreeMap<Integer, Double> femaleDataMap = new TreeMap<Integer, Double>();
        
        String selectedItem = (String) comboBox.getSelectedItem();
        switch(selectedItem){
            case "Out of school" :
                indicatorName = "Out of School";
                maleDataMap = MacroDataAnalyze.getOutSchoolMale(country);
                femaleDataMap = MacroDataAnalyze.getOutSchoolFemale(country);
                break;
            case "Mean years of education" :
                indicatorName = "Mean Years of Education";
                maleDataMap = MacroDataAnalyze.getMeanYearsMale(country);
                femaleDataMap = MacroDataAnalyze.getMeanYearsFemale(country);
                break;
            case "School enrollment" :
                indicatorName = "School Enrollment";
                maleDataMap = MacroDataAnalyze.getEnrollMale(country);
                femaleDataMap = MacroDataAnalyze.getEnrollFemale(country);
                break;
            case "Progression to higher education" :
                indicatorName = "Progression to Higher Education";
                maleDataMap = MacroDataAnalyze.getProgressMale(country);
                femaleDataMap = MacroDataAnalyze.getProgressFemale(country);
                break;
            case "Math Score" :
                indicatorName = "Math Score";
                maleDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "math", "Male");
                femaleDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "math", "Female");
                break;
            case "Literacy Score" :
                indicatorName = "Literacy Score";
                maleDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "reading", "Male");
                femaleDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "reading", "Female");
                break;
            case "Science Score" :
                indicatorName = "Science Score";
                maleDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "science", "Male");
                femaleDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "science", "Female");
                break;                                
            
        };
        
        if(maleDataMap.size() == 0 || femaleDataMap.size() == 0){
            JOptionPane.showMessageDialog(this, "No data yet.");
            return;
        }
        
        Integer lowerX = 0;
        Integer upperX = 0;
        Double lowerY = 0.0D;
        Double upperY = 0.0D;
        Integer count = 0;
        
        XYSeriesCollection collection = new XYSeriesCollection();
        
        XYSeries maleSeries = new XYSeries("Male");
        for(Integer year: maleDataMap.keySet()){
            maleSeries.add(year, maleDataMap.get(year));
            if(count == 0){
                lowerX = year;
                upperX = year;
                lowerY = maleDataMap.get(year);
                upperY = maleDataMap.get(year);
            }            
            if(year < lowerX){
                lowerX = year;
            }else if(year > upperX){
                upperX = year;
            }
            if(maleDataMap.get(year) < lowerY){
                lowerY = maleDataMap.get(year);
            }else if(maleDataMap.get(year) > upperY){
                upperY = maleDataMap.get(year);
            }
            count ++;
        }
        count = 0;
        collection.addSeries(maleSeries);        
        
        XYSeries femaleSeries = new XYSeries("Female");
        for(Integer year: femaleDataMap.keySet()){
            femaleSeries.add(year, femaleDataMap.get(year));
            if(year < lowerX){
                lowerX = year;
            }else if(year > upperX){
                upperX = year;
            }
            if(femaleDataMap.get(year) < lowerY){
                lowerY = femaleDataMap.get(year);
            }else if(femaleDataMap.get(year) > upperY){
                upperY = femaleDataMap.get(year);
            }            
        }
        collection.addSeries(femaleSeries);
        
        JFreeChart lineChart = ChartFactory.createXYLineChart(indicatorName + " Fluctuation", "Year", "Value",
                collection, PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = (XYPlot) lineChart.getPlot();
        
        NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();
        xAxis.setTickUnit(new NumberTickUnit(1));
        xAxis.setRange(lowerX-1,upperX+1);
        
        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setRange(lowerY - (upperY-lowerY)/2,upperY + (upperY-lowerY)/2);
        
        XYItemRenderer renderer = (XYItemRenderer) plot.getRenderer();
        renderer.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(Boolean.TRUE);
                        
        ChartPanel lineChartPanel = new ChartPanel(lineChart);
        chartPanel.removeAll();
        chartPanel.add(lineChartPanel, BorderLayout.CENTER);
        chartPanel.validate();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        chartPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Education Equality");

        chartPanel.setBackground(new java.awt.Color(255, 255, 204));
        chartPanel.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Select an Education Equality Indicator:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Out of school", "Mean years of education", "School enrollment", "Progression to higher education", "Literacy Score", "Math Score", "Science Score", " " }));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh Chart");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRefresh)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addGap(35, 35, 35)
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshChart();
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void back(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.last(userProcessContainer);                
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
