package lesson8.std;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        createHighestParent();

    }
    static void createHighestParent(){
        Student[] student = new Student[3];
        student[1] = new Student("Ivan", "Ivanov", 472,null,23);
        student[2] = new Student("Petr", "Petrov", 472,null,21);
        Course[] course = new Course[3];
        course[1] = new Course(new Date(), "TeacherName", 2, "TeacherLastName", student );
        SpecialStudent[] specialStudents = new SpecialStudent[3];
        specialStudents[1] = new SpecialStudent("SpecialName", "SpecialLastname", 295, course, 24, 23423423,"123@mail.com");
    }
}
