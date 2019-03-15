package lesson8;

public class IPhone {
    int price;
    double weight;
    String countryProduced;
    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;
        this.fingerPrint = fingerPrint;
    }

    void orderPhone(){
        //some logic
    }

    void deleteIPhoneFromDb(){
        //some logic
    }
}
