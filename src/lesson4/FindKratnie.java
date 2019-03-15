package lesson4;

public class FindKratnie {
    public static void main(String[] args) {
        short a=1;
        short b = 100;
        int n = 5;
        findDivCount(a,b,n);
    }

    public static int findDivCount(short a, short b, int n) {
        int count = 0;
            int i = a;
            for (; i <= b; i++) {
                if (i % n == 0) {
                    count++;
                }

        }
        System.out.println(count);
        return count;
    }
}
