package Lesson4;

public class SravnenieSummi {
    public static void main(String[] args) {
        compareSums(1, 5,2,8);
    }
    public static boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum(c, d);
    }
    public static long sum(int from, int to) {
        long result = 0;
        for(long i = from; i<=to;i++){
            result+=i;
        }
        return result;
    }
}