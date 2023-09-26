
public class CheckingAccount {
    double balance =0;
    String name = "bill blow bggins ";

    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        }//end method displayCustomer
    public void withdraw(double amount){
        if (amount > 0){
        if (balance >= amount){
            balance = balance - amount;
            System.out.println("you have withdrawn $ "+ amount);
            System.out.println("your balance is now:" + balance);
        }else{
            System.out.println("srry you balance is to low");
        }
      }else{
        System.out.println("you can not withdraw a negitive amount");
      }
    }    

}
