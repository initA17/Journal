package com.journal.test.module;

public class Group implements IHaveID {
    private Integer id;
    private String name;
    public Student[] students;

    public Group(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public Student checkStudent(String fname, String lname){
        for(Student s : this.students){
            if(s.getFirstName() == fname && s.getLastName() == lname){
                return s;
            }
        }
        return null;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
