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

        Lesson les1 = new Lesson("Java OOP", "09.12.2017", "Sea room");
        les1.addPresentStudents(
                new String[][]{
                        {"Vlad", "Vasya", "asdasd", "name4"},
                        {"Tkachuk", "Savitsky", "asd", "surname4"}
                }, a17);

        Lesson les2 = new Lesson("Java OOP", "09.12.2017", "Sea room");
        les2.addPresentStudents(
                new String[][]{
                        {"Vlad", "Vasya", "asdasd"},
                        {"Tkachuk", "Savitsky", "asd"}
                }, a17);
        Journal journalA17 = new Journal(a17);
        journalA17.addLesson(les1);
        journalA17.addLesson(les2);
        int count = journalA17.getAllLessonsByStudent(allStudents[5]);
        System.out.println(count);
    }
}