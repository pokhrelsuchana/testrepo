import java.util.Scanner;
public class Area {  //sub-class ma hami sabai kam garxau except for making an obj and printing it.
    int l;
    int b;

    void area(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter length");
        l=input.nextInt();
        System.out.println("Enter Breadth");
        b=input.nextInt();
        System.out.println("Area:"+ (l*b)); //yeta hamle khali int ra print garne.
    }
}

class areaNext {
    public static void main(String[] args) {
        Area R1=new Area(); // sab main ko kam ya hunxa paila class tespaxi obj ani matra print garne tara sysout nahali.
        R1.area();
    }
}

