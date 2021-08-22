/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.WorldManager;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Business;
import model.Country.Country;
import model.Country.CountryDirectory;
import model.DataAnalyze.EduDataAnalyze;
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
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author changxu
 */
public class WorldEducationDevelopmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorldEducationDevelopmentJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Business business;
    CountryDirectory countryDirectory;
    Country country;
    
    String developmentIndicator = "";
    TreeMap<Integer, Double> developmentDataMap = new TreeMap<Integer, Double>();
    String equalityIndicator = "";
    TreeMap<Integer, Double> maleEqualityDataMap = new TreeMap<Integer, Double>();
    TreeMap<Integer, Double> femaleEqualityDataMap = new TreeMap<Integer, Double>();
    
    
    public WorldEducationDevelopmentJPanel(JPanel userProcessContainer, UserAccount account) {        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = Business.getInstance();
        this.countryDirectory = business.getCountryDirectory();

        populateCountry();        
    }
    
    public void populateCountry(){
        comboCountry.removeAllItems();
        for(String name: countryDirectory.getName2Country().keySet()){
            comboCountry.addItem(name);
        }
        comboCountry.removeItem("World");
        comboCountry.removeItem("world");
    }    

    public void refreshFluc(){        
        String selectedItem = (String) comboDevelopment.getSelectedItem();
        switch(selectedItem){
            case "Unemployement rate" :
                developmentIndicator = "Unemployement Rate";
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
        
        if(developmentDataMap.size() == 0){
            JOptionPane.showMessageDialog(this, "No " + developmentIndicator + " data yet.");
            return;
        }
        
        Integer lowerX = 0;
        Integer upperX = 0;
        Double lowerY = 0.0D;
        Double upperY = 0.0D;
        Integer count = 0;
        
        XYSeriesCollection collection = new XYSeriesCollection();

        XYSeries series = new XYSeries(developmentIndicator);
        for(Integer year: developmentDataMap.keySet()){
            series.add(year, developmentDataMap.get(year));
            if(count == 0){
                lowerX = year;
                upperX = year;
                lowerY = developmentDataMap.get(year);
                upperY = developmentDataMap.get(year);
            }            
            if(year < lowerX){
                lowerX = year;
            }else if(year > upperX){
                upperX = year;
            }
            if(developmentDataMap.get(year) < lowerY){
                lowerY = developmentDataMap.get(year);
            }else if(developmentDataMap.get(year) > upperY){
                upperY = developmentDataMap.get(year);
            }
            count ++;            
        }
        count = 0;
        collection.addSeries(series);
    
        JFreeChart lineChart = ChartFactory.createXYLineChart(country + " " + developmentIndicator + " Fluctuation", "Year", "Value",
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
                maleEqualityDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "math", "Male");
                femaleEqualityDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "math", "Female");
                break;
            case "Literacy Score" :
                equalityIndicator = "Literacy Score";
                maleEqualityDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "reading", "Male");
                femaleEqualityDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "reading", "Female");
                break;
            case "Science Score" :
                equalityIndicator = "Science Score";
                maleEqualityDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "science", "Male");
                femaleEqualityDataMap = EduDataAnalyze.getAvgCourseScoreByGender(country, "science", "Female");
                break;                                            
        }
        
        if(developmentDataMap.size() == 0 || maleEqualityDataMap.size() == 0 || femaleEqualityDataMap.size() == 0){
            JOptionPane.showMessageDialog(this, "No data yet.");
            return;
        }        
        
        TreeMap<Double, Double> maleRelationshipMap = generateRelationshipMap(maleEqualityDataMap, developmentDataMap);
        TreeMap<Double, Double> femaleRelationshipMap = generateRelationshipMap(femaleEqualityDataMap, developmentDataMap);        

        Double lowerX = 0.0D;
        Double upperX = 0.0D;
        Double lowerY = 0.0D;
        Double upperY = 0.0D;
        Integer count = 0;

        XYSeriesCollection collection = new XYSeriesCollection();
        
        XYSeries maleSeries = new XYSeries("Male");
        for(Double x: maleRelationshipMap.keySet()){
            maleSeries.add(x, maleRelationshipMap.get(x));
            if(count == 0){
                lowerX = x;
                upperX = x;
                lowerY = maleRelationshipMap.get(x);
                upperY = maleRelationshipMap.get(x);
            }            
            if(x < lowerX){
                lowerX = x;
            }else if(x > upperX){
                upperX = x;
            }
            if(maleRelationshipMap.get(x) < lowerY){
                lowerY = maleRelationshipMap.get(x);
            }else if(maleRelationshipMap.get(x) > upperY){
                upperY = maleRelationshipMap.get(x);
            }
            count ++;            
        }
        collection.addSeries(maleSeries);
        
        XYSeries femaleSeries = new XYSeries("Female");
        for(Double x: femaleRelationshipMap.keySet()){
            femaleSeries.add(x, femaleRelationshipMap.get(x));
            if(x < lowerX){
                lowerX = x;
            }else if(x > upperX){
                upperX = x;
            }
            if(femaleRelationshipMap.get(x) < lowerY){
                lowerY = femaleRelationshipMap.get(x);
            }else if(femaleRelationshipMap.get(x) > upperY){
                upperY = femaleRelationshipMap.get(x);
            }            
            
        }
        collection.addSeries(femaleSeries);
        
        JFreeChart lineChart = ChartFactory.createXYLineChart("Equality & Development Relationship", equalityIndicator, developmentIndicator,
                collection, PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = (XYPlot) lineChart.getPlot();
        
        NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();        
        xAxis.setRange(lowerX - (upperX-lowerX)/2,upperX + (upperX-lowerX)/2);
        
        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setRange(lowerY - (upperY-lowerY)/2,upperY + (upperY-lowerY)/2);
        
        XYItemRenderer renderer = (XYItemRenderer) plot.getRenderer();
        renderer.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(Boolean.TRUE);
        
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
        jLabel6 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox<>();
        flucPanel = new javax.swing.JPanel();
        relationPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 250, 250));

        InfoPanel.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("World Education Development Analyze");

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

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Select a Country:");

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboDevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEquality, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)
                        .addContainerGap(602, Short.MAX_VALUE))
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        InfoPanelLayout.setVerticalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboDevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboEquality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addContainerGap())
        );

        flucPanel.setBackground(new java.awt.Color(255, 255, 102));
        flucPanel.setLayout(new java.awt.BorderLayout());

        relationPanel.setBackground(new java.awt.Color(255, 255, 102));
        relationPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(flucPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(relationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(flucPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        country = countryDirectory.getCountryByName(comboCountry.getSelectedItem().toString());
        if(country == null){
            JOptionPane.showMessageDialog(this, "Please select a country first.");
            return;
        }
        
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
    private javax.swing.JComboBox<String> comboCountry;
    private javax.swing.JComboBox<String> comboDevelopment;
    private javax.swing.JComboBox<String> comboEquality;
    private javax.swing.JPanel flucPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel relationPanel;
    // End of variables declaration//GEN-END:variables
}
