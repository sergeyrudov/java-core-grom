package lesson8.phones;

public class Android extends Phone{
    String androidVersion;
    int screenSize;
    String secretDeviceCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviceCode) {
//        this.price = price;
//        this.weight = weight;
//        this.countryProduced = countryProduced;
        //this - reference to the current class object
        //super - reference to the parent class object
        super(price, weight, countryProduced);
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    void installNewAndroidVersion(){
        System.out.println("installNewAndroidVersion invoked...");
    }
}
