package models;

import java.util.Date;

public class Invoice {

    Students students;
    int id;
    Date Idate;
    Date Fdate;
    Double amount;


    public Invoice(Students students, int id, Date idate, Date fdate, Double amount) {
        this.students = students;
        this.id = id;
        Idate = idate;
        Fdate = fdate;
        this.amount = amount;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getIdate() {
        return Idate;
    }

    public void setIdate(Date idate) {
        Idate = idate;
    }

    public Date getFdate() {
        return Fdate;
    }

    public void setFdate(Date fdate) {
        Fdate = fdate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
