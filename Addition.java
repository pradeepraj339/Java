import java.util.Scanner;

public class Addition{
    public static void main(String args[]){

        Scanner s1 = new Scanner(System.in);
        //Scanner s2 = new Scanner(System.in);

        System.out.println("please enter first number");
        int num1 = s1.nextInt();

        System.out.println("please enter second number");
        int num2 = s1.nextInt();


        int total = sum(num1, num2);
        System.out.println("the addition is: " + total);

        int total1 = mul(num1, num2);
        System.out.println("the multiplication is: " + total1);

    }

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int mul(int a, int b){
        int res = a*b;
        return res;
    }

}