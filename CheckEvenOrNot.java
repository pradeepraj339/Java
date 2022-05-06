import java.util.Scanner;

public class CheckEvenOrNot{
    public static void main(String args[]){

        Scanner s1 = new Scanner(System.in);

        System.out.println("please enter nay number ");
        int num = s1.nextInt();

        FindEvenOrNot(num);
    }

    public static void FindEvenOrNot(int num){
        if(num%2==0){
            System.out.println("number is even...");
        }else{
            System.out.println("number is odd...");
        }
    }
}