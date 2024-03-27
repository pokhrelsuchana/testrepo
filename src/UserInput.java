import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: "); //ln bhanya chai next line ho ani yesle output mext line ma dinxa.
        String name=input.nextLine(); //sab ko lagi xuttai xuttai hunxa jasto int ko lagi nextint float lai nextfloat.
        System.out.println("GOOD MORNING "+ name);
    }
}
