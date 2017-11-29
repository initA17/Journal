public class Group {
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
}
