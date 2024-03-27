//WAP to create a class having attributes and methods also create object and access attributes :
public class Account {   //method number 1
    int accountId;
    int accountNumber;
    String accountName;
    void setAccountsDetails(){  //i.e function.
        accountName="Saving";
        accountId=1;
        accountNumber=12344;
    }
    void printDetails(){
        System.out.println("Account Id is:"+ accountId);
        System.out.println("Account Name is:"+ accountName);
        System.out.println("Account Number is:"+ accountNumber);
    }
}

class Mains{ //number 2.
    public static void main(String[] args) {
        Account savingAccount=new Account();

        System.out.println(savingAccount.accountId); //accessing account id.
        savingAccount.printDetails();//yesma chai null aauxa kina bhane hamle mathi function call gareko xaina.

        savingAccount.setAccountsDetails();//accessing member function.

        savingAccount.printDetails();//calling functions.
    }
}