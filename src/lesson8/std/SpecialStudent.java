package lesson8.std;

public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age, long secretKey, String email) {
        super(firstName, lastName, group, coursesTaken, age);
        this.secretKey = secretKey;
        this.email = email;
    }
}
