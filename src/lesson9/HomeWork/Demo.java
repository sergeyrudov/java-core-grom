package lesson9.HomeWork;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User[] users = {new User(1, "Vasya", "sessionID"), null, new User(2, null, null), new User(3, "Ivan", "123"), };
        UserRepository name = new UserRepository(users);

        System.out.println(name.getUserNameById(1121));
        System.out.println(name.getUserNameById(-1121));

        System.out.println(Arrays.toString(name.getUserNames()));
        System.out.println(Arrays.toString(name.getUserIds()));

        name.delete(1111);
        System.out.println(Arrays.toString(name.getUserNames()));

        name.delete(0);
        System.out.println(Arrays.toString(name.getUserNames()));
    }
}
