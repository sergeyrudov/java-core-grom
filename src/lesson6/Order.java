package lesson6;

import java.util.Date;

public class Order {
    public static void main(String[] args) {

    }
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;



    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {

    }

    void confirmOrder() {
        if (!isConfirmed) {
            isConfirmed = true;
            dateConfirmed = new Date();  //current date
        }
    }

    boolean checkPrice() {
        return price > 1000;
    }

    boolean isValidType() {
        return type == "Buy";
    }
}


