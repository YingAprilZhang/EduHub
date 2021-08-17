/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DataAnalyze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author changxu
 */
public class MacroData {
    Integer year;
    
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
    
    List<Double> macroEduList;
    List<Double> macroEcoList;
    
    MacroEduType macroEduType;
    MacroEcoType macroEcoType;
    
    public MacroData(){
        
        this.macroEduType = macroEduType;
        
        macroEduList = new ArrayList<Double>();
        macroEduList.add(maleOutSchool);
        macroEduList.add(femaleOutSchool);
        macroEduList.add(maleMeanYears);
        macroEduList.add(femaleMeanYears);
        macroEduList.add(maleEnroll);
        macroEduList.add(femaleEnroll);
        macroEduList.add(maleProgress);
        macroEduList.add(femaleProgress);
        
        macroEcoList = new ArrayList<Double>();
        macroEcoList.add(unemploy);
        macroEcoList.add(eduExp);
        macroEcoList.add(pupilTeacher);
        macroEcoList.add(gdp);
    }

    public enum MacroEduType{
        maleOutSchool("Out of school male"),
        femaleOutSchool("Out of school female"),
        maleMeanYears("Mean years of education male"),
        femaleMeanYears("Mean years of education female"),
        maleEnroll("School enrollment male"),
        femaleEnroll("School enrollment female"),
        maleProgress("Progression to higher education male"),
        femaleProgress("Progression to higher education female"),
        totalEnroll("School enrollment");
       
                
        private String value;
        private MacroEduType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }        
    
    public Map<MacroEduType, Double> MacroEduType2MacroEduMapping = new HashMap<MacroEduType, Double>() {{            
        put(MacroEduType.femaleEnroll, femaleEnroll);
        put(MacroEduType.femaleMeanYears, femaleMeanYears);
        put(MacroEduType.femaleOutSchool, femaleOutSchool);
        put(MacroEduType.femaleProgress, femaleProgress);
        put(MacroEduType.maleEnroll, maleEnroll);
        put(MacroEduType.maleMeanYears, maleMeanYears);
        put(MacroEduType.maleOutSchool, maleOutSchool);
        put(MacroEduType.maleProgress, maleProgress);
        put(MacroEduType.totalEnroll, 0.0);
    }};
    
    public MacroEduType getMacroEduTypebyValue(String value) {
        MacroEduType result = null;
        for(MacroEduType m: MacroEduType.values()){
            result = value.equals(m.getValue()) ? m : null;
            if (value.equals(m.getValue())) {
                result = m;
                break;
            }            
        }
        return result;
    }
        
    public enum MacroEcoType{
        unemploy("Unemployement rate"),
        eduExp("Government expenditure on education(% of government expenditure)"),
        pupilTeacher("Pupil-teacher ratio"),
        gdp("GDP");
        
        private String value;
        private MacroEcoType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public Map<MacroEcoType, Double> MacroEcoType2MacroEcoMapping = new HashMap<MacroEcoType, Double>() {{            
        put(MacroEcoType.unemploy, unemploy);
        put(MacroEcoType.eduExp, eduExp);
        put(MacroEcoType.pupilTeacher, pupilTeacher);
        put(MacroEcoType.gdp, gdp);
    }};
    
    public MacroEcoType getMacroEcoTypebyValue(String value) {
        MacroEcoType result = null;
        for(MacroEcoType m: MacroEcoType.values()){
            result = value.equals(m.getValue()) ? m : null;
            if (value.equals(m.getValue())) {
                result = m;
                break;
            }            
        }
        return result;
    }
    
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    

    public double getMaleOutSchool() {
        return maleOutSchool;
    }

    public void setMaleOutSchool(double maleOutSchool) {
        this.maleOutSchool = maleOutSchool;
    }

    public double getFemaleOutSchool() {
        return femaleOutSchool;
    }

    public void setFemaleOutSchool(double femaleOutSchool) {
        this.femaleOutSchool = femaleOutSchool;
    }

    public double getMaleMeanYears() {
        return maleMeanYears;
    }

    public void setMaleMeanYears(double maleMeanYears) {
        this.maleMeanYears = maleMeanYears;
    }

    public double getFemaleMeanYears() {
        return femaleMeanYears;
    }

    public void setFemaleMeanYears(double femaleMeanYears) {
        this.femaleMeanYears = femaleMeanYears;
    }

    public double getMaleEnroll() {
        return maleEnroll;
    }

    public void setMaleEnroll(double maleEnroll) {
        this.maleEnroll = maleEnroll;
    }

    public double getFemaleEnroll() {
        return femaleEnroll;
    }

    public void setFemaleEnroll(double femaleEnroll) {
        this.femaleEnroll = femaleEnroll;
    }

    public double getMaleProgress() {
        return maleProgress;
    }

    public void setMaleProgress(double maleProgress) {
        this.maleProgress = maleProgress;
    }

    public double getFemaleProgress() {
        return femaleProgress;
    }

    public void setFemaleProgress(double femaleProgress) {
        this.femaleProgress = femaleProgress;
    }

    public double getUnemploy() {
        return unemploy;
    }

    public void setUnemploy(double unemploy) {
        this.unemploy = unemploy;
    }

    public double getEduExp() {
        return eduExp;
    }

    public void setEduExp(double eduExp) {
        this.eduExp = eduExp;
    }

    public double getPupilTeacher() {
        return pupilTeacher;
    }

    public void setPupilTeacher(double pupilTeacher) {
        this.pupilTeacher = pupilTeacher;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public List<Double> getMacroEduList() {
        return macroEduList;
    }

    public List<Double> getMacroEcoList() {
        return macroEcoList;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(year);
    }
}
