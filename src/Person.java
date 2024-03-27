 public class Person{
    //Attributes
    public int personId;
    public String personName;

    Person(){
        System.out.println("Object Created");
    } //default constructor

    Person(int personId, String name){
        this.personId=personId; // using this to resolve name conflicts
        personName= name;
    } // parameterized constructor
    void setPersonName(String personName){ //set ra get chai aauta
        this.personName = personName;
    }
    String getPersonName(){
        return this.personName;
    }

    void printDetails(){
        System.out.println("Id is: " + personId);
        System.out.println("Name is: " + personName);

    }
} // class closed


 class Program{

//    public static void main(
    public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person(5,"Hari");

    System.out.println(p1.personId + "\n" + p1.personName);
    System.out.println(p2.personId + "\n" + p2.personName);

    p1.printDetails();
    p2.printDetails();

    p1.personId=10;
    p1.personName="Ram";

    System.out.println(p1.personId + "\n" + p1.personName);
    p2.setPersonName("Harry");
    p2.printDetails();
}
}