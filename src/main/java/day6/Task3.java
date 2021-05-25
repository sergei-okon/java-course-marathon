package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bob", "Math");
        Student student = new Student("Mike");

        teacher.evaluate(student);
    }
}
