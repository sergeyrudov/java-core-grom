package lesson10.HW10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Кирил", "Киев", "Мужской");

        ElectronicsOrder e1 = new ElectronicsOrder("Холодильник", new Date(), "Киев", "Одесса", 4876, customer, 12);
        ElectronicsOrder e2 = new ElectronicsOrder("Чайник", new Date(), "Киев", "Львов", 800, customer, 3);

        FurnitureOrder f1 = new FurnitureOrder("Ручка", new Date(), "Киев", "Харьков", 250, customer, "12432");
        FurnitureOrder f2 = new FurnitureOrder("Гвоздь", new Date(), "Киев", "Винница", 24, customer, "13532");
        //electronic 1 order
        e1.validateOrder();
        e1.calculatePrice();
        //electronic 2 order
        e2.validateOrder();
        e2.calculatePrice();
        //furniture 1 order
        f1.validateOrder();
        f1.calculatePrice();
        //furniture 2 order
        f2.validateOrder();
        f2.calculatePrice();
    }
}
