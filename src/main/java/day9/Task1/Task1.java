package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Mike", "10BA");
        Teacher teacher = new Teacher("Bob", "Math");

        student.printInfo();
        
        teacher.printInfo();

    }
}
