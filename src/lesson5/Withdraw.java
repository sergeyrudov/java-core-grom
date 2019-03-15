package lesson5;

import java.util.Arrays;

public class Withdraw {
    public static void main(String[] args) {
        int[] values = {500, 300, -190, 344};
        String[] names = {"Jack", "Ann", "Denis", "Andrey"};
        System.out.println(Arrays.toString(findClientsByBalance(names, values, -100)));
    }

    static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        //String[] results = new String[clients.length];

        //1
        int count = 0;
        for (int balance : balances) {
            if (balance >= n)
                count++;
        }
        //2
        String[] results = new String[count];

        //3
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }
        return results;
    }
}

//этот метод вернес всех клиентов на балансе у которых больше равно -400

//надо передавать массив, в котором будет искаться этот юзер, и от его баланса вычитается сумма
//надо передать массив, и в нем искать строкой юзера и вернуть индекс этого юзера.
