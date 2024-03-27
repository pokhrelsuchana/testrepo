//Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.
abstract class Zoo{
    abstract public void sound(); //yo method hamro parent class ma xa.
}

class Lion extends Zoo{
    @Override
    public void sound() { //yo method hamro child class ma xa tei vaira hamle override gareko ho.
        System.out.println("The lion makes a roaring sound.");
    }
}

class Tiger extends Zoo{
    @Override
    public void sound(){
        System.out.println("The tiger makes a sound dangerous than Lion.");
    }
}

public class Animal{
    public static void main(String[] args) {
        //for lion only.
        Lion l=new Lion();
        l.sound();

        //for tiger only.
        Tiger t=new Tiger();
        t.sound();
    }
}