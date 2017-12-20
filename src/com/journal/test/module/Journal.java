package com.journal.test.module;

import java.util.LinkedList;
import java.util.List;

public class Journal {
    private Group group;
    private List<Subject> subjects;

    public Journal(Group group) {
        this.group = group;
        subjects = new LinkedList<Subject>();
    }

    public Group getGroup() {
        return group;
    }

    public void addSubject(Subject sub){
        subjects.add(sub);
    }

    public int getCountPresentLessons(Student student){
        int count = 0;
        for(Subject sub : subjects){
            count += sub.getCountPresentLessons(student);
        }
        return count;
    }

    public int getCountPresentLessons(Student student, Subject subject){
        int count = 0;
        for(Subject sub : subjects){
            if(sub.equals(subject))
                count += sub.getCountPresentLessons(student);
        }
        return count;
    }
}
