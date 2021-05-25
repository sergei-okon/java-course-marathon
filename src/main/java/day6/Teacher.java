package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String gradeInWords;

    void evaluate(Student studentName) {
        int min = 2;
        int max = 5;
        Random random = new Random();
        int grade = random.nextInt(max - min) + min;

        switch (grade) {
            case 2:
                gradeInWords = "Неудовлетворительно";
                break;
            case 3:
                gradeInWords = "Удовлетворительно";
                break;
            case 4:
                gradeInWords = "Хорошо";
                break;
            case 5:
                gradeInWords = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + studentName.getName()
                + " по предмету " + subject + " на оценку " + gradeInWords);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
