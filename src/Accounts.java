public class Accounts {
    int Ac_Id;
    String Ac_Holder_Name;

    public void setAc_Id(int ac_Id, String Ac_Holder_Name) {
       this.Ac_Id = ac_Id;
       this.Ac_Holder_Name=Ac_Holder_Name;
    }

    public int getAc_Id() {
        return Ac_Id;
    }

    public String getAc_Holder_Name() {
        return Ac_Holder_Name;
    }

   void openAccount(int Ac_Id){
       System.out.println("Your Account Id has been Created");
    }

    void closeAccount(int Ac_Id){
        System.out.println("Your Account Id has been Closed.");
    }
}

class Saving extends Accounts{
    void dhanLaxmi(){
        System.out.println(Ac_Holder_Name+" Your saving Account has been Created.");
    }
     void khuturke(){
         System.out.println(Ac_Id+" Id Your money has been safely been kept.");
     }

     Saving(int Ac_Id, String Ac_Holder_Name){
        this.Ac_Holder_Name=Ac_Holder_Name;
        this.Ac_Id=Ac_Id;
     }
}

class Current extends Accounts{
    void sabalBachat(){
        System.out.println("We are formed to keep your expense safe.");
    }

    Current(int Ac_Id, String Ac_Holder_Name){
        this.Ac_Holder_Name=Ac_Holder_Name;
        this.Ac_Id=Ac_Id;
    }
    void printDetails(){
        System.out.println("Account Id: "+Ac_Id);
        System.out.println("Account Name: "+Ac_Holder_Name);
    }
}

class Bank{
    public static void main(String[] args) {
        Current C=new Current(101,"Ravi-raj");
        C.sabalBachat();

        Saving S=new Saving(103,"Kishan-raj");
        S.dhanLaxmi();
        S.khuturke();
    }
}