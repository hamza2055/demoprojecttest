public class BankAccountAPP {

    public  static void main(String[] args){
        System.out.println("BankAccount App");
    /*    BankAccount bankAccount = new BankAccount("4478965" ,1000);
        bankAccount.showBalance();

        bankAccount.makeDeposit(1000);
        bankAccount.payBill(1500);

        bankAccount.accrue();

        System.out.println(bankAccount.toString());*/
//        BankAccount bankAccount1 = new BankAccount("456887", 2000);
//
//        BankAccount bankAccount2 = new BankAccount("125556", 3000);

        Student s1 = new Student("Hamza Riaz" , "7786542");
        s1.setCity("Islamabad");
        s1.setstate("Pakistan");
        s1.setPhone("031550148888");


        System.out.println(s1.toString());
    }



}


class BankAccount implements IInterest {

    private  static  int id = 1000;
    private String name;
    private String accountNumber; // combination of id+random 2 digit no + first 2 no of SSN
    private static final String routingNumber = "5669884";
    private String SSN;
    private double balance;

    public BankAccount(String SSN, double initDeposit){
        balance = initDeposit;
        System.out.println("New Account Created");
        this.SSN = SSN;
        id++;
        System.out.println(id);
        setAccountNumber();



    }

    private void setAccountNumber() {
        int random = (int) (Math.random() * 100);

        accountNumber = id + ""+ random + "" + SSN.substring(0,2);

        System.out.println("the account no is" + accountNumber);
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public  void  payBill(double amount){
        System.out.println("Paying the bill of amount" + amount);

        balance = balance - amount;
        showBalance();
    }

    public  void  makeDeposit(double amount){
        System.out.println("making the deopsit of the amount" + amount);

        balance = balance + amount;
        showBalance();
    }

    public  void  showBalance(){
        System.out.println("the curent balance is  " + balance);
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }


    @Override
    public String toString() {

        return ("{ name is " + name +"}/n"  + "{ Account no is " + accountNumber +"}/n" + "{ routing no is " + routingNumber +"}/n" + "{ SSN is " + SSN +"}/n");
    }
}