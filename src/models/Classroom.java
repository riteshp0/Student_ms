package models;

public class Classroom {

    String name;

    String classTeacher;

    int capacity;

    int noOfStudents;

    int roomId;

    boolean ac;

    boolean Tv;


    public Classroom(String name, String classTeacher, int capacity, int noOfStudents, int roomId, boolean ac, boolean tv) {
        this.name = name;
        this.classTeacher = classTeacher;
        this.capacity = capacity;
        this.noOfStudents = noOfStudents;
        this.roomId = roomId;
        this.ac = ac;
        Tv = tv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isTv() {
        return Tv;
    }

    public void setTv(boolean tv) {
        Tv = tv;
    }

}
