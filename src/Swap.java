//to swap two numbers.
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Swap S1=new Swap();

        System.out.println("Enter the first number: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();

        System.out.println("Enter the second number: ");
        int b=input.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.println("The swapped element of a is:"+a);
        System.out.println("The swapped element of b is:"+b);
    }
}