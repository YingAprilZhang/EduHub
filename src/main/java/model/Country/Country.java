/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Country;

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
    ArrayList<MacroData> macroDataList;
    Accountant accountant;
}
