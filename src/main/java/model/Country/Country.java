/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Country;

import model.Accountant.Accountant;
import model.CountryManager.CountryManager;
import model.DataAnalyze.MacroData;

/**
 *
 * @author changxu
 */
public class Country {
    String Name;
    CountryManager countryManager;
    ArrayList<School> schoolList;
    MacroData macroData;
    Accountant accountant;
}
