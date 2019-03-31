package lesson8.std;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        createHighestParent();

    }
    static void createHighestParent(){
        Student[] student = new Student[1];
        CollegeStudent[] collegeStudents = new CollegeStudent[1];
        SpecialStudent[] specialStudents = new SpecialStudent[1];
        student[1] = new Student("Ivan", "Ivanov", 472,null,23);
        collegeStudents[1] = new CollegeStudent("CollegeStudent", "StdLastname", 233, null, 56);
        specialStudents[1] = new SpecialStudent("SpecialName", "SpecialLastname", 295, null, 24, 23423423,"123@mail.com");
    }
}
