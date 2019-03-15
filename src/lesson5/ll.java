package lesson5;

public class ll {
    public static void main(String[] args) {
        int[] array = {100, 500, 8432, -99, 12000, -54, 0};
        sortAscending(array);
        sortDescending(array);
    }

    public static int[] sortAscending(int[] arr){
        int n = arr.length;
        int temp;
        for(int i =0;i<n;i++){
            for (int j =1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] sortDescending(int[] arr){
        int n = arr.length;
        int temp;
        for(int i =0;i<n;i++){
            for (int j =1;j<(n-i);j++){
                if(arr[j-1]<arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
