//Multiple Inheritance.
public class Multiple {
    int vId;
    String vName;
    int vModel;

    public void setvId(int vId, String vName,int vModel){
            this.vId=vId;
        }

        int getvId(){
            return vId;
        }

    }

class Name extends Multiple{
    Name(int vId) {
        this.vId = vId;
    }
    void printDetails(){
        System.out.println("Id is: "+ vId);
    }
}

class Programmed{
    public static void main(String[] args) {
        Name M=new Name(101);
        M.printDetails();
    }
}