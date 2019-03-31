package lesson8.std;

public class Demo {
    public static void main(String[] args) {
        Demo.createHighestParent();
        Demo.createLowestChild();

    }
    static SpecialStudent[] createHighestParent(){
//        Student[] student = new Student[1];
//        CollegeStudent[] collegeStudents = new CollegeStudent[1];
        SpecialStudent[] specialStudents = new SpecialStudent[1];
//        student[1] = new Student("Ivan", "Ivanov", 472,null,23);
//        collegeStudents[1] = new CollegeStudent("CollegeStudent", "StdLastname", 233, null, 56);
        specialStudents[1] = new SpecialStudent("SpecialName", "SpecialLastname", 295, null, 24, 23423423,"123@mail.com");
        return specialStudents;
    }

    static Student[] createLowestChild() {
        Student[] student = new Student[1];
        student[1] = new Student("Ivan", "Ivanov", 33, null, 21);
        return student;
    }
}
