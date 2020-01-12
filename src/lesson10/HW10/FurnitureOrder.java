package lesson10.HW10;

import java.util.Date;

public class FurnitureOrder extends Order{
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String s) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        String name = getCustomerOwned().getName();
        if (getShipFromCity() == "Киев" || getShipFromCity() == "Львов") {
            if (getBasePrice() >= 500 && name != "Тест") {
                setDateConfirmed(new Date());
            }
        }
    }

    @Override
    public void calculatePrice() {
        double comission = getBasePrice();
        double shipP;
        if (getBasePrice() < 5000)
            comission += comission * 0.05;
        else comission += comission * 0.02;
        setTotalPrice(comission);
    }
}

