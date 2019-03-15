package lesson5;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {
        int[] firstArray = new int[3]; //declaration
        //array name [index] - get array element
        firstArray[0] = 11;
        firstArray[1] = 200;
        firstArray[2] = -10;
        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[2]);

        for(int i =0;i<firstArray.length;i++){
            System.out.println(firstArray[i]);
        }
        System.out.println(Arrays.toString(firstArray));

        //declaration & initialization
        int[] secondArray = {1,10,15,20,-50};

        //for each
        for(int element: secondArray){
            System.out.println(element);
        }
    }
}
