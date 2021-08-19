/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.School;

/**
 *
 * @author aprilyz
 */
public class EduData {
    public int year;
    
    public Student student;
    public double readingScore;
    public double mathScore;
    public double scienceScore;
    public double totalScore;

    public EduData(int year, Student student, double readingScore, double mathScore, double scienceScore) {
        this.year = year;
        this.student = student;
        this.readingScore = readingScore;
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.totalScore = readingScore + mathScore + scienceScore;
    }
    
    
}
