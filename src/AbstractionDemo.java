abstract class Animals{
    public void sound(){
        System.out.println("Animal is making sound!!");
    }
    abstract public void run();
}

public class AbstractionDemo extends Animals {
    public static void main(String[] args) {
        AbstractionDemo ad = new AbstractionDemo();
        ad.sound();
        ad.run();
    }

    @Override
    public void run() {
        System.out.println("Animal is Running !!");
    }
}