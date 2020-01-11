package lesson10.abstractbigexample;

public class ManagerEmloyee extends Employee{

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth();
        newBalance+=newBalance*0.25;
        getBankAccount().setBalance(newBalance);
    }
}
