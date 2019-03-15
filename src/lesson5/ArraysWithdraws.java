package lesson5;

public class ArraysWithdraws {
    public static void main(String[] args) {
        String[] clients = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        withdraw(clients, balances, "Nikolay", 100);

    }

    static int withdraw(String[] clients, int[] balances, String client, int amount) {
        int clientIndex = 0;
        for (String iteration : clients) {
            if (iteration == client) {
                break;
            }
            clientIndex++;
        }
        int userBalance = new Integer(balances[clientIndex]);
        return userBalance >= amount?userBalance-amount:-1;
    }
}