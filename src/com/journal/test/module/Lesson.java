package com.journal.test.module;

import java.util.LinkedList;
import java.util.List;

public class Lesson {
    private String date;
    private String room;
    private List<Student> presentStudents;

    public Lesson(String date, String room){
        this.date = date;
        this.room = room;
        presentStudents = new LinkedList<Student>();
    }

    public List<Student> getPresentStudents() {
        return presentStudents;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void addPresentStudents(String[][] names, Group group) {
        Student student;
        for(int i = 0; i < names[0].length; i++){
            student = group.checkStudent(names[0][i],names[1][i]);
            if(student != null) this.presentStudents.add(student);
        }
    }

    public boolean isPresentStudent(Student student){
        for(Student st : presentStudents){
            if(st.equals(student)) return true;
        }
        return false;
    }
}
