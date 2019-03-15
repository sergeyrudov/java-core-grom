package Lesson2;

public class ForLoopExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 0; a <= 1000; a++) {
            sum += a;
        }
        int wholeValue = sum / 1234;
        int moduleValue = sum % 1234;
        System.out.println(sum+"_"+wholeValue+"_"+moduleValue);
        boolean boo = true;
        while(moduleValue>wholeValue){
            System.out.println(boo);
            break;
        }

    }
}

//control+alt+L
