package models;

import java.util.ArrayList;

public class subject {

    String name;

    int fullMarks;

    int passMarks;

    String teacher;

    int creditHours;

    public subject(String name, String teacher, int creditHours, int fullMarks, int passMarks) {
        this.name = name;
        this.teacher = teacher;
        this.creditHours = creditHours;
        this.fullMarks = fullMarks;
        this.passMarks = passMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(int passMarks) {
        this.passMarks = passMarks;
    }

    public int getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(int fullMarks) {
        this.fullMarks = fullMarks;
    }

    public void getDetails(){
        System.out.println(this.getCreditHours()+" "+this.getFullMarks()+" "+this.getPassMarks()+" "+this.getTeacher());
    }
}

