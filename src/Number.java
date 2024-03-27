//write a java program to get a number from the user and print whether it is positive or negative.//

import java.util.Scanner;
public class Number {
    int n;
    void num() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = input.nextInt();
        if (n < 0) {
            System.out.println("This is your negative number.");
        }
        else
            System.out.println("This is a positive number.");
    }
}

class positive{
    public static void main(String[] args) {
        Number N1=new Number();
        N1.num();
    }
}