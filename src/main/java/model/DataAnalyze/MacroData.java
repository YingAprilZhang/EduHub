/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DataAnalyze;

import java.util.ArrayList;
import java.util.List;

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
    
    public MacroData(){
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
