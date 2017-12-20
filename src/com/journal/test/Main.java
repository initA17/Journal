package com.journal.test;

import com.journal.test.module.*;

public class Main {
    public static void main(String[] args) {
        Group a17 = new Group("A17");
        Student[] allStudents = new Student[]{
                new Student("Vlad", "Tkachuk", a17.getName()),
                new Student("Vasya", "Savitsky", a17.getName()),
                new Student("name1", "surname2", a17.getName()),
                new Student("name2", "surname2", a17.getName()),
                new Student("name3", "surname3", a17.getName()),
                new Student("name4", "surname4", a17.getName())
        };
        a17.students = allStudents;

        Lesson les1 = new Lesson("28.11.2017", "Sea room");
        les1.addPresentStudents(
                new String[][]{
                        {"Vlad", "Vasya", "asdasd", "name4"},
                        {"Tkachuk", "Savitsky", "asd", "surname4"}
                }, a17);

        Lesson les2 = new Lesson("29.11.2017", "Sea room");
        les2.addPresentStudents(
                new String[][]{
                        {"Vlad", "Vasya", "asdasd"},
                        {"Tkachuk", "Savitsky", "asd"}
                }, a17);

        Subject sJava = new Subject("Java", "SomeBody");
        sJava.addLesson(les1);
        sJava.addLesson(les2);

        Subject sSharp = new Subject("Sharp", "Gomon");
        sSharp.addLesson(les1);
        sSharp.addLesson(les2);

        Journal journalA17 = new Journal(a17);
        journalA17.addSubject(sJava);
        journalA17.addSubject(sSharp);

        System.out.println("Total: " + journalA17.getCountPresentLessons(allStudents[1]));
        System.out.println("Count on java: " + journalA17.getCountPresentLessons(allStudents[1], sJava));
        System.out.println("Count on sharp: " + journalA17.getCountPresentLessons(allStudents[1], sSharp));
    }
}