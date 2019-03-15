package lesson4;

public class IfElse {
    public static void main(String[] args) {
//        System.out.println(ret(5,6));
//        System.out.println(raw(2, 5, 7));
//        System.out.println(tern(9, 8, 4));
//        System.out.println(count(1,100,1));
//        System.out.println(pizdak(5));
//        System.out.println(hh(3f));
//        System.out.println(hb(10));
        System.out.println(sherhen());
    }

    public static boolean ret(int a, int b) {
        if (a > b)
            return true;
        else
            return false;
    }

    public static int raw(int c, int d, int e) {
        if (c > d && c > e)
            return c;
        else
            return d;
    }

    public static int tern(int c, int d, int e) {
        int result = c < d && d < e ? e : c;
        return result;

    }

    public static int count(int a, int b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 10 == n)
                count++;
        }
        return count;
    }
    public static float pizdak(int a){
        return a;
    }
    public static float hh(float a){
        int s = (int) a;
        int b = s+4;
        return b;
    }
    public static int hb(int a){
        while(a<20){
            System.out.println(a);
             a++;
        }
        return a;
    }
    public static String sherhen(){
        int count = 10;
        int s = 0;
        while (count!=s){
            System.out.println("Кот");
            s++;
        }
        return String.valueOf("");
    }
}