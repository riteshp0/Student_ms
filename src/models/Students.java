package models;

import java.util.ArrayList;

public class Students {


    String name;
    int roll_no;
    int grade;
    String section;
    ArrayList<subject> subjects;


    public Students(String name, int roll_no, int grade, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public ArrayList<subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<subject> subjects) {
        this.subjects = subjects;
    }



}
