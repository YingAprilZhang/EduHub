/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Country;

import java.util.ArrayList;
import java.util.List;
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
    List<MacroData> macroDataList;
    Accountant accountant;
    
    public Country(){
        macroDataList = new ArrayList<MacroData>();
    }

    public List<MacroData> getMacroDataList() {
        return macroDataList;
    }

    public MacroData addMacroData(){
        MacroData md = new MacroData();
        macroDataList.add(md);
        return md;
    }
    
    @Override
    public String toString(){
        return Name;
    }
}
