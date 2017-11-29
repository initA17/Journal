import java.util.ArrayList;

public class Lesson {
    private String name;
    private String date;
    private String room;
    private ArrayList<Student> presentStudents;

    public Lesson(String name, String date, String room){
        this.name = name;
        this.date = date;
        this.room = room;
        presentStudents = new ArrayList<Student>();
    }

    public ArrayList<Student> getPresentStudents() {
        return presentStudents;
    }

    public boolean isPresentStudent(Student student){
        for(Student st : presentStudents){
            if(st.equals(student)) return true;
        }
        return false;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPresentStudents(String[][] names, Group group) {
        Student student;
        for(int i = 0; i < names[0].length; i++){
            student = group.checkStudent(names[0][i],names[1][i]);
            if(student != null) this.presentStudents.add(student);
        }
    }
}
