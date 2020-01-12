package lesson10.HW10;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        String gender = getCustomerOwned().getGender();

        if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") {
            if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
                if (gender == "Женский" && getBasePrice() >= 100) {
                    setDateConfirmed(new Date());
                }
            }
        }
    }

    @Override
    public void calculatePrice() {
        double comission = getBasePrice();
        double shipP;
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса")
            shipP = getBasePrice() * 0.10;
        else shipP = getBasePrice() * 0.15;
        comission += shipP;
        if (getBasePrice() > 1000)
            comission -= comission * 0.05;
        setTotalPrice(comission);
    }
}

