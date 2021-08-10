/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CharityEducationGroup;

/**
 *
 * @author kkkkayla
 */
public class SingleClass {

    private String name;
    private int classID;

    public SingleClass(String name, int classID) {
        this.name = name;
        this.classID = classID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public boolean isMatch(int ID) {
        if (this.classID == ID) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(classID);
    }

}
