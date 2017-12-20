package com.journal.test.module;

public class Student implements IHaveID{
    private Integer id;
    private String firstName;
    private String lastName;
    private String groupName;

    public Student(String firstName, String lastName, String groupName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupName = groupName;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return String.format("\n\tfirstName: %s, lastName: %s, groupName: %s",
                firstName, lastName, groupName);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
