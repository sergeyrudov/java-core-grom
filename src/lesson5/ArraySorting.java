package lesson5;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

    static int[] sortAscending(int[] array) {
        Arrays.sort(array);
        return array;
    }

     static int[] sortDescending(int[] array){
        int last = array.length - 1;
        int middle = array.length / 2;
        for (int i = 0; i <= middle; i++) {
            int temp = array[i];
            array[i] = array[last - i];
            array[last - i] = temp;
        }
        return array;
    }
}