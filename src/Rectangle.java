public class Rectangle {
    public String name;
    int id;
    int salary;

    //    Rectangle() { for input.
//        name = "Suchana";
//        id = 5;
//        salary = 12345;
//    }
//}

//    class News{ for output.
//        public static void main(String[] args) {
//            Main n1=new Main();
//            System.out.println("Name:"+n1.name);
//            System.out.println("Name:"+n1.id);
//        }
//    }
    Rectangle(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void sayhello(){
        System.out.println("Name:"+name);
        System.out.println("Name:"+id);
        System.out.println("Name:"+salary);
    }
}

class add{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle("Suchana",12345,23000);
        r1.sayhello();
    }
}