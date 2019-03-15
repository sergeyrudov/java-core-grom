package lesson3;

public class FindOdd {
    public static void main(String[] args) {
        int temp=0;
        for(int i=0;i<=1000;i++){
            if(i%2!=0){
                System.out.println("Found");
                temp = i+i;
                //System.out.println(temp);
            }
        }
        if(temp*5>5000){
            System.out.println("Bigger");
        }
        if(temp*5==5000){
            System.out.println("equal");
        }
    }
}
