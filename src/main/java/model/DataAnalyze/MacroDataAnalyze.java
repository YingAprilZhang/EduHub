/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DataAnalyze;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import model.Country.Country;

/**
 *
 * @author changxu
 */
public class MacroDataAnalyze {
    
    public MacroDataAnalyze(){
        
    }
    
    public static TreeMap<Integer,Double> getOutSchoolMale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getMaleOutSchool());
        }        
        return result;
    }
    
    public static TreeMap<Integer,Double> getOutSchoolFemale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getFemaleOutSchool());
        }        
        return result;
    }

    public static TreeMap<Integer,Double> getMeanYearsMale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getMaleMeanYears());
        }        
        return result;
    }

    public static TreeMap<Integer,Double> getMeanYearsFemale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getFemaleMeanYears());
        }        
        return result;
    }
    
    public static TreeMap<Integer,Double> getEnrollMale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getMaleEnroll());
        }        
        return result;
    }
    
    public static TreeMap<Integer,Double> getEnrollFemale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getFemaleEnroll());
        }        
        return result;
    }

    public static TreeMap<Integer,Double> getProgressMale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getMaleProgress());
        }        
        return result;
    }

    public static TreeMap<Integer,Double> getProgressFemale(Country country){
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        TreeMap<Integer, MacroData> macroDataMap =(TreeMap) country.getMacroDataMap();
        for(Integer year:macroDataMap.keySet()){
            result.put(year, macroDataMap.get(year).getFemaleProgress());
        }        
        return result;
    }
    
}
