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
import model.School.EduData;
import model.School.School;

/**
 *
 * @author aprilyz
 */
public class EduDataAnalyze {
   
    public static TreeMap<Integer,Double> getAvgMathScoreMale (Country country) {
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
    
        return result;
        
    }
    
    public static TreeMap<Integer,Double> getAvgMathScoreFemale (Country country) {
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        return result;
        
    }
    
    public static TreeMap<Integer,Double> getAvgLiteracyScoreMale (Country country) {
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        return result;

    }

    public static TreeMap<Integer,Double> getAvgLiteracyScoreFemale (Country country) {
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        return result;

    }

    public static TreeMap<Integer,Double> getAvgScienceScoreMale (Country country) {
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        return result;

    }

    public static TreeMap<Integer,Double> getAvgScienceScoreFemale (Country country) {
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        
        return result;

    }
    
    // gender: Female / Male
    // course: reading / math / science
     public static TreeMap<Integer,Double> getAvgCourseScoreByGender (Country country, String course, String gender) {
        TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
        Map<Integer, Double> year2count = new HashMap<>();
        double score = 0.0;
        for (School school : country.getSchoolList()) {
                for(EduData ed : school.eduDataList) {
                        if (ed.student.gender.equals(gender)) {
                                if (course.equals("reading")) {
                                    score = ed.readingScore;
                                } else if  (course.equals("math")) {
                                     score = ed.mathScore;
                                } else if  (course.equals("science")) {
                                     score = ed.scienceScore;
                                }    
                                result.put(ed.year, score + (null==result.get(ed.year) ? 0.0 : result.get(ed.year)));
                                year2count.put(ed.year, 1 + (null==year2count.get(ed.year) ? 0 : year2count.get(ed.year)));
                        }
                }
        }
        
        for (int year : result.keySet()) {
            result.put(year, result.get(year)/year2count.get(year));
        }
        /*
        for (int year : result.keySet()) {
            System.out.println("country: "+ country
                    +", year: " + year
                    +", gender: "+gender
                    +", course: "+ course 
                    +"--"+ result.get(year));
        }
        */
        return result;
    }

}
