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
        intTurkeyMacroData(name);
        intTogoMacroData(name);
        intChileMacorData(name);
    }

    public void intTurkeyMacroData(String name){
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
    
    public void intTogoMacroData(String name){        
        if(name.equals("Togo")){
            MacroData macro2015 = new MacroData();            
            macro2015.setMaleEnroll(131.2);
            macro2015.setFemaleEnroll(124.9);
            macro2015.setMaleMeanYears(8.22);
            macro2015.setFemaleMeanYears(6.37);
            macro2015.setMaleOutSchool(2.9);
            macro2015.setFemaleOutSchool(9);
            macro2015.setMaleProgress(87.6);
            macro2015.setFemaleProgress(82.7);
            macro2015.setGdp(570.9);            
            macro2015.setEduExp(17.4);                   
            macro2015.setPupilTeacher(41.1);
            macro2015.setUnemploy(2.2);
            macro2015.setYear(2015);
            macroDataMap.put(2015, macro2015);
            
            MacroData macro2016 = new MacroData();            
            macro2016.setMaleEnroll(128.2);
            macro2016.setFemaleEnroll(122);
            macro2016.setMaleMeanYears(7.98);
            macro2016.setFemaleMeanYears(6.02);
            macro2016.setMaleOutSchool(5);
            macro2016.setFemaleOutSchool(11.1);
            macro2016.setMaleProgress(86.3);
            macro2016.setFemaleProgress(80);
            macro2016.setGdp(803.2);            
            macro2016.setEduExp(16.7);                   
            macro2016.setPupilTeacher(44.2);
            macro2016.setUnemploy(3);
            macro2016.setYear(2016);
            macroDataMap.put(2016, macro2016);
            
            MacroData macro2017 = new MacroData();            
            macro2017.setMaleEnroll(127.3);
            macro2017.setFemaleEnroll(121.4);
            macro2017.setMaleMeanYears(8.01);
            macro2017.setFemaleMeanYears(6.25);
            macro2017.setMaleOutSchool(4.5);
            macro2017.setFemaleOutSchool(10.3);
            macro2017.setMaleProgress(84.2);
            macro2017.setFemaleProgress(79.6);
            macro2017.setGdp(830.7);            
            macro2017.setEduExp(16);                   
            macro2017.setPupilTeacher(41.4);
            macro2017.setUnemploy(3.7);
            macro2017.setYear(2017);
            macroDataMap.put(2017, macro2017);
            
            MacroData macro2018 = new MacroData();            
            macro2018.setMaleEnroll(126);
            macro2018.setFemaleEnroll(121.5);
            macro2018.setMaleMeanYears(8.44);
            macro2018.setFemaleMeanYears(6.56);
            macro2018.setMaleOutSchool(2.8);
            macro2018.setFemaleOutSchool(7.8);
            macro2018.setMaleProgress(83.3);
            macro2018.setFemaleProgress(78.1);
            macro2018.setGdp(901.5);            
            macro2018.setEduExp(23.1);                   
            macro2018.setPupilTeacher(40.1);
            macro2018.setUnemploy(3.7);
            macro2018.setYear(2018);
            macroDataMap.put(2018, macro2018);
            
            MacroData macro2019 = new MacroData();            
            macro2019.setMaleEnroll(126.4);
            macro2019.setFemaleEnroll(122.2);
            macro2019.setMaleMeanYears(8.63);
            macro2019.setFemaleMeanYears(6.77);
            macro2019.setMaleOutSchool(2.3);
            macro2019.setFemaleOutSchool(4);
            macro2019.setMaleProgress(82.3);
            macro2019.setFemaleProgress(77.3);
            macro2019.setGdp(893.4);            
            macro2019.setEduExp(21.8);                   
            macro2019.setPupilTeacher(40.1);
            macro2019.setUnemploy(3.6);
            macro2019.setYear(2019);
            macroDataMap.put(2019, macro2019);
            
            
        }
    }

    public void intChileMacorData(String name){        
        if(name.equals("Chile")){
            MacroData macro2015 = new MacroData();            
            macro2015.setMaleEnroll(102.5);
            macro2015.setFemaleEnroll(99.3);
            macro2015.setMaleMeanYears(12.97);
            macro2015.setFemaleMeanYears(13.39);
            macro2015.setMaleOutSchool(3.6);
            macro2015.setFemaleOutSchool(4.2);
            macro2015.setMaleProgress(96.7);
            macro2015.setFemaleProgress(98.1);
            macro2015.setGdp(13574.2);            
            macro2015.setEduExp(19.9);                   
            macro2015.setPupilTeacher(18.7);
            macro2015.setUnemploy(10.2);
            macro2015.setYear(2015);
            macroDataMap.put(2015, macro2015);
            
            MacroData macro2016 = new MacroData();            
            macro2016.setMaleEnroll(102.2);
            macro2016.setFemaleEnroll(99.1);
            macro2016.setMaleMeanYears(13.02);
            macro2016.setFemaleMeanYears(13.45);
            macro2016.setMaleOutSchool(3.4);
            macro2016.setFemaleOutSchool(4);
            macro2016.setMaleProgress(97);
            macro2016.setFemaleProgress(98.2);
            macro2016.setGdp(13753.6);            
            macro2016.setEduExp(19.6);                   
            macro2016.setPupilTeacher(18.4);
            macro2016.setUnemploy(10.8);
            macro2016.setYear(2016);
            macroDataMap.put(2016, macro2016);
            
            MacroData macro2017 = new MacroData();            
            macro2017.setMaleEnroll(102.4);
            macro2017.setFemaleEnroll(99.5);
            macro2017.setMaleMeanYears(13.16);
            macro2017.setFemaleMeanYears(13.56);
            macro2017.setMaleOutSchool(2.8);
            macro2017.setFemaleOutSchool(3.3);
            macro2017.setMaleProgress(97.4);
            macro2017.setFemaleProgress(98.4);
            macro2017.setGdp(14998.8);            
            macro2017.setEduExp(21.2);                   
            macro2017.setPupilTeacher(17.5);
            macro2017.setUnemploy(18);
            macro2017.setYear(2017);
            macroDataMap.put(2017, macro2017);
            
            MacroData macro2018 = new MacroData();            
            macro2018.setMaleEnroll(102.9);
            macro2018.setFemaleEnroll(99.9);
            macro2018.setMaleMeanYears(13.23);
            macro2018.setFemaleMeanYears(13.66);
            macro2018.setMaleOutSchool(2);
            macro2018.setFemaleOutSchool(2.6);
            macro2018.setMaleProgress(97.8);
            macro2018.setFemaleProgress(98.6);
            macro2018.setGdp(15888.1);            
            macro2018.setEduExp(21.3);                   
            macro2018.setPupilTeacher(17);
            macro2018.setUnemploy(17.8);
            macro2018.setYear(2018);
            macroDataMap.put(2018, macro2018);
            
            MacroData macro2019 = new MacroData();            
            macro2019.setMaleEnroll(103.6);
            macro2019.setFemaleEnroll(100.7);
            macro2019.setMaleMeanYears(13.45);
            macro2019.setFemaleMeanYears(13.79);
            macro2019.setMaleOutSchool(1);
            macro2019.setFemaleOutSchool(1.6);
            macro2019.setMaleProgress(98.4);
            macro2019.setFemaleProgress(99.1);
            macro2019.setGdp(14741.7);            
            macro2019.setEduExp(21.5);                   
            macro2019.setPupilTeacher(16.8);
            macro2019.setUnemploy(17.4);
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
    
    public School getSchoolByName(String name){
        for(School s:schoolList){
            if(s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
