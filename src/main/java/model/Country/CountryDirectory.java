/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author changxu
 */
public class CountryDirectory {
    private Map<String, Country> name2Country;

    public CountryDirectory() {
        this.name2Country = new HashMap<>();
        // 添加默认country "world" 给无国界Org
        this.name2Country.put("world", new Country("world"));
    }

    public Map<String, Country> getName2Country() {
        return name2Country;
    }

    public void setName2Country(Map<String, Country> name2Country) {
        this.name2Country = name2Country;
    }

    // get a country by name, create one if the country does not exist
    public Country getCountryByName(String name) {
        Country c = name2Country.get(name);
        if (c == null) {
            c = new Country(name);
            name2Country.put(name, c);
        }
        return c;
    }
    
    
    
}
