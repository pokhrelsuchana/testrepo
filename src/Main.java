public class Main{
    public String name;
    int id;
    int salary;
    
    Main(){
        name="Suchana";
        id=5;
        salary=12345;
    }
}

class News{
    public static void main(String[] args) {
        Main n1=new Main();
        System.out.println("Name:"+n1.name);
        System.out.println("Name:"+n1.id);
    }
}