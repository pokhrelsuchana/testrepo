//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
abstract class Employee {
    abstract public void calculateSalary();
    abstract public void displayInfo();
}

class Manager extends Employee{
    @Override
    public void calculateSalary(){
        int salary= 90000;
        System.out.println("The salary of Manager in our Firm is Rs."+salary);
    }
    @Override
    public void displayInfo(){
        System.out.println("The Information of our Manager id given below: ");
        String Name="Suchana";
        int age=20;
        System.out.println(Name);
        System.out.println(age);
    }
}

class Programmer extends Employee{
    @Override
    public void calculateSalary(){
        int salaries=60000;
        System.out.println("The salary of the Programmer is Rs."+salaries);
    }
    @Override
    public void displayInfo(){
        System.out.println("The information of our Programmer is given below: ");
        String Name="Swechya";
        int age=25;
        System.out.println(Name);
        System.out.println(age);
    }
}

class Office{
    public static void main(String[] args) {
        Manager m=new Manager();
        m.displayInfo();
        m.calculateSalary();

        System.out.println("--------------------------------------");

        Programmer p=new Programmer();
        p.displayInfo();
        p.calculateSalary();
    }
}