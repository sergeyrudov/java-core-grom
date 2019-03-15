package lesson5;

import java.util.Arrays;

public class ArraysTrainings {
    public static void main(String[] args) {
        int[] values = {500,300,-190,344};
        String[] names = {"Jack", "Ann", "Denis", "Andrey"};
        System.out.println(Arrays.toString(findClientsByBalance(names,values,300)));
    }

    static String[] findClientsByBalance(String[] clients, int[] balances, int n){
        //String[] results = new String[clients.length];
        //1
        int count = 0;
        for(int balance: balances){
            if(balance>=n)
                count++;
            System.out.println(count);
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
    }}
//    static String[] withdrawAndShowResult(String[] client, int[] balance){
//
//    }
//}
