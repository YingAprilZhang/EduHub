/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CharityEducationGroup;

import java.util.ArrayList;

/**
 *
 * @author kkkkayla
 */
public class EduClass {

    private ArrayList<SingleClass> classList;
    private int classCount;

    public EduClass(ArrayList<SingleClass> classList) {
        this.classList = classList;
        this.classCount = classList.size() + 1;
    }

    public EduClass() {
        this.classList = new ArrayList<SingleClass>();
        this.classCount = 1;
    }

    public ArrayList<SingleClass> getClassList() {
        return classList;
    }

    public void setClassList(ArrayList<SingleClass> classList) {
        this.classList = classList;
    }

    public SingleClass addNewClass(String name) {
        SingleClass newClass = new SingleClass(name, classCount);
        classList.add(newClass);
        classCount++;
        return newClass;
    }

    public boolean removeClassByID(int ID) {
        for (SingleClass educlass : classList) {
            if (educlass.isMatch(ID)) {
                classList.remove(educlass);
                return true;
            }
        }
        return false;
    }

    public SingleClass findClassByID(int id) {
        for (SingleClass eduClass : this.getClassList()) {
            if (eduClass.getClassID() == id) {
                return eduClass;
            }
        }
        return null;
    }

}
