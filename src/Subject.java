import java.util.LinkedList;
import java.util.List;

public class Subject {
    private String name;
    private String teacher;
    private List<Lesson> lessons;

    public Subject(String name, String teacher){
        this.name = name;
        this.teacher = teacher;
        lessons = new LinkedList<Lesson>();
    }

    public List<Lesson> getAllLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getCountPresentLessons(Student student){
        int count = 0;
        for(Lesson les : lessons){
            if(les.isPresentStudent(student)) count++;
        }
        return count;
    }
}
