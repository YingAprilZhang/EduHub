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
     
     // gender: Female / Male
    // course: reading / math / science
     public static Map<Integer, double[]> getAvgCourseScore (School school) {
        Map<Integer, double[]> result = new TreeMap<>();
        Map<Integer, Integer> year2count = new HashMap<>();
        for(EduData ed : school.eduDataList) {
            if (null==result.get(ed.year)) {
                 result.put(ed.year,new double[]{ed.readingScore, ed.mathScore, ed.scienceScore});
            } else {
                 double[] scores = result.get(ed.year);
                 scores[0] += ed.readingScore;
                 scores[1] += ed.mathScore;
                 scores[2] += ed.scienceScore;
                 result.put(ed.year,scores);
            }
            year2count.put(ed.year, 1 + (null==year2count.get(ed.year) ? 0 : year2count.get(ed.year)));
        }
        
        for (int year : result.keySet()) {
               result.get(year)[0] = result.get(year)[0]/year2count.get(year);
               result.get(year)[1] = result.get(year)[1]/year2count.get(year);
               result.get(year)[2] = result.get(year)[2]/year2count.get(year);
        }
        for (int year : result.keySet()) {
            System.out.println(
                      ", year: " + year
                    +", readingScore: "+ result.get(year)[0]
                    +", mathScore: "+ result.get(year)[1]
                    +", scienceScore"+ result.get(year)[2]);
        }
        return result;
    }

}
