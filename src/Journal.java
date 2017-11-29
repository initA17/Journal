import java.util.ArrayList;
import java.util.Map;

public class Journal {
    private Group group;
    private ArrayList<Lesson> lessons;

    public Journal(Group group) {
        this.group = group;
        lessons = new ArrayList<Lesson>();
    }

    public Group getGroup() {
        return group;
    }

    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }

    public int getAllLessonsByStudent(Student student){
        int count = 0;
        for(Lesson les : lessons){
            if(les.isPresentStudent(student)) count++;
        }
        return count;
    }
}
