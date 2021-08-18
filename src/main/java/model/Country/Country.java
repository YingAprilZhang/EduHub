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
        this.eduDataMap = new TreeMap<Integer, EduData>();
        this.requestList = new ArrayList<Request>();
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
