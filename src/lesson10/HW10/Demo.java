package lesson10.HW10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Кирил", "Киев", "Мужской");

        ElectronicsOrder e1 = new ElectronicsOrder("TV", new Date(), "Киев", "Одесса", 12000, customer, 24);
        ElectronicsOrder e2 = new ElectronicsOrder("AudioSet", new Date(), "Киев", "Львов", 500, customer, 6);

        FurnitureOrder f1 = new FurnitureOrder("Dverca", new Date(), "Киев", "Харьков", 100, customer, "10000");
        FurnitureOrder f2 = new FurnitureOrder("Vintik", new Date(), "Киев", "Винница", 10, customer, "14666");
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
