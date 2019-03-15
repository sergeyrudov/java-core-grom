package lesson4;

public class MyOwnTernar {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(lol(kek(a,b)));
    }
    private static int kek(int a, int b) {
        return a > b ? b : a;
    }
    public static boolean lol(int suka){
        if(suka!=100)
            return true;
        else
            return false;
    }
}
