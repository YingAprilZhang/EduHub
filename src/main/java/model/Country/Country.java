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
import model.DataAnalyze.MacroData;
import model.School.School;

/**
 *
 * @author changxu
 */
public class Country {
    String Name;
    CountryManager countryManager;
    List<School> schoolList;
    Map<Integer, MacroData> macroDataMap;
    Accountant accountant;
    
    public Country(){
        macroDataMap = new TreeMap<Integer, MacroData>();        
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
    
    
    
    @Override
    public String toString(){
        return Name;
    }
}
