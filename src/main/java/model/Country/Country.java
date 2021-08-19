/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import model.Accountant.Accountant;
import model.CountryManager.CountryManager;
import model.DataAnalyze.EduDataAnalyze;
import model.DataAnalyze.MacroData;
import model.Request.Request;
import model.School.School;
import model.School.EduData;

/**
 *
 * @author changxu
 */
public class Country {
    String name;
    CountryManager countryManager;
    List<School> schoolList;
    Map<Integer, MacroData> macroDataMap;
    Accountant accountant;
    Double accountBalance;
    List<Request> requestList;
    
    public Country(String name){
        this.name = name;
        this.schoolList = new ArrayList<>();
        this.macroDataMap = new TreeMap<Integer, MacroData>();        
        this.requestList = new ArrayList<Request>();
        intMacroData(name);
    }

    public void intMacroData(String name){
        if(name.equals("Turkey")){
            MacroData macro2015 = new MacroData();            
            macro2015.setMaleEnroll(106.6);
            macro2015.setFemaleEnroll(106.1);
            macro2015.setMaleMeanYears(9.95);
            macro2015.setFemaleMeanYears(8.3);
            macro2015.setMaleOutSchool(4.8);
            macro2015.setFemaleOutSchool(5.8);
            macro2015.setMaleProgress(99.7);
            macro2015.setFemaleProgress(99.4);
            macro2015.setGdp(11006.3);            
            macro2015.setEduExp(6.4);                   
            macro2015.setPupilTeacher(19.3);
            macro2015.setUnemploy(10.2);
            macro2015.setYear(2015);
            macroDataMap.put(2015, macro2015);
            
            MacroData macro2016 = new MacroData();            
            macro2016.setMaleEnroll(103.4);
            macro2016.setFemaleEnroll(102.7);
            macro2016.setMaleMeanYears(10.15);
            macro2016.setFemaleMeanYears(9.4);
            macro2016.setMaleOutSchool(4.8);
            macro2016.setFemaleOutSchool(5.7);
            macro2016.setMaleProgress(99.8);
            macro2016.setFemaleProgress(99.5);
            macro2016.setGdp(10894.6);            
            macro2016.setEduExp(6.8);                   
            macro2016.setPupilTeacher(18.4);
            macro2016.setUnemploy(10.8);
            macro2016.setYear(2016);
            macroDataMap.put(2016, macro2016);
            
            MacroData macro2017 = new MacroData();            
            macro2017.setMaleEnroll(101.3);
            macro2017.setFemaleEnroll(100.6);
            macro2017.setMaleMeanYears(10.36);
            macro2017.setFemaleMeanYears(9.58);
            macro2017.setMaleOutSchool(5.5);
            macro2017.setFemaleOutSchool(6.2);
            macro2017.setMaleProgress(99.9);
            macro2017.setFemaleProgress(99.6);
            macro2017.setGdp(10589.7);            
            macro2017.setEduExp(6.8);                   
            macro2017.setPupilTeacher(17.5);
            macro2017.setUnemploy(10.8);
            macro2017.setYear(2017);
            macroDataMap.put(2017, macro2017);
            
            MacroData macro2018 = new MacroData();            
            macro2018.setMaleEnroll(93.6);
            macro2018.setFemaleEnroll(92.7);
            macro2018.setMaleMeanYears(10.53);
            macro2018.setFemaleMeanYears(9.87);
            macro2018.setMaleOutSchool(4.8);
            macro2018.setFemaleOutSchool(5.5);
            macro2018.setMaleProgress(100.3);
            macro2018.setFemaleProgress(99.8);
            macro2018.setGdp(9453.2);            
            macro2018.setEduExp(7.1);                   
            macro2018.setPupilTeacher(17);
            macro2018.setUnemploy(10.9);
            macro2018.setYear(2018);
            macroDataMap.put(2018, macro2018);
            
            MacroData macro2019 = new MacroData();            
            macro2019.setMaleEnroll(95.4);
            macro2019.setFemaleEnroll(94.4);
            macro2019.setMaleMeanYears(10.66);
            macro2019.setFemaleMeanYears(10.3);
            macro2019.setMaleOutSchool(4.7);
            macro2019.setFemaleOutSchool(5.3);
            macro2019.setMaleProgress(100.4);
            macro2019.setFemaleProgress(100.2);
            macro2019.setGdp(9126.6);            
            macro2019.setEduExp(7.2);                   
            macro2019.setPupilTeacher(16.8);
            macro2019.setUnemploy(13.7);
            macro2019.setYear(2019);
            macroDataMap.put(2019, macro2019);
            
            
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public Map<Integer, MacroData> getMacroDataMap() {
        return macroDataMap;
    }

    public MacroData addMacroData(Integer year){
        MacroData md = new MacroData();
        macroDataMap.put(year, md);        
        return md;
    }

    public CountryManager getCountryManager() {
        return countryManager;
    }

    public void setCountryManager(CountryManager countryManager) {
        this.countryManager = countryManager;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Request> getRequestList() {
        return requestList;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
}
