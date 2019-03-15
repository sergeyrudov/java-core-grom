package lesson6;




import java.util.Date;

public class DemoHomeWork {
    public static void main(String[] args) {
        DemoHomeWork.createOrderAndCallMethods().isValidType();
        DemoHomeWork.createOrderAndCallMethods().checkPrice();
        DemoHomeWork.createOrderAndCallMethods().confirmOrder();
    }

    static Order createOrder(){
       Order object1 = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return object1;
   }
   static Order createOrderAndCallMethods(){
       Order object2 = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
       return object2;
   }
}
