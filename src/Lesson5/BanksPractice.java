package Lesson5;

import java.util.Arrays;

public class BanksPractice {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100,500,8432, -99, 12000,-54, 0};
        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));
        depositMoney(names, balances, "Ann", 2000);
        System.out.println(Arrays.toString(balances));


    }

    static String[] findClientsByBalance(String[] clients, int[] balances, int n){
        //String[] results = new String[clients.length];

        //1
        int count = 0;
        for(int balance: balances){
            if(balance>=n)
                count++;
        }
        //2
        String[] results = new String[count];

        //3
        int index = 0;
        int resIndex = 0;
        for(int balance:balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;
    }
    static String[] findClientsWithNegativeBalance(String[] clients, int[] balances){
        //String[] results = new String[clients.length];

        //1
        int count = 0;
        for(int balance: balances){
            if(balance<0)
                count++;
        }
        //2
        String[] results = new String[count];

        //3
        int index = 0;
        int resIndex = 0;
        for(int balance:balances) {
            if (balance <0) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;
    }
    static void depositMoney(String[] clients, int[] balances, String client, int money){
        balances[findClientIndexByName(clients,client)]+=calculateDepositAmountAfterCommision(money);
    }
    static int findClientIndexByName(String[] clients, String client){
        int clientIndex = 0;
        for(String cl: clients){
            if(cl==client){
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }
    static int calculateDepositAmountAfterCommision(int money){
        return money <=100 ? (int)(money-money*0.02): (int)(money-money*0.01);
    }
}
