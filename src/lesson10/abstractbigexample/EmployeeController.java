package lesson10.abstractbigexample;

public class EmployeeController {
    private Employee[] employee = new Employee[100];

    void paySalaryToEmployees(){
        for (Employee employee : employee){
            employee.paySalary();
            System.out.println("Salary was paid successfully to" + employee.getName() + "employee");
        }
    }
    /*void paySalaryToEmployees(){
        for (Employee employee : employee){
            if (employee instanceof DeveloperEmployee){
                int newBalance = employee.getBankAccount().getBalance() + employee.getSalaryPerMonth() + 1000;
                employee.getBankAccount().setBalance(newBalance);
            }else if(employee instanceof ManagerEmloyee){
                int newBalance = employee.getBankAccount().getBalance() + employee.getSalaryPerMonth();
                newBalance+=newBalance*0.25;
                employee.getBankAccount().setBalance(newBalance);
            }
            System.out.println("Salary was paid successfully to" + employee.getName() + "employee");
        }
    }*/

}
