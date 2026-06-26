import java.util.Scanner;
class BankAccount{
    int balance;
    BankAccount(int balance){
        this.balance=balance;
    }
    void deposit(int amount){
        balance=balance+amount;
        System.out.println("Amount Deposited Successfully");
    }
    void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawal Successful!");
        }else{
            System.out.println("Insufficient Balance!");
        }
    }
        void checkBalance(){
            System.out.println("Current balance: Rupess"+balance);
        }
    }
    class ATM{
        BankAccount account;
        ATM(BankAccount account){
           this.account=account;
        }
        void start(){
            Scanner sc=new Scanner(System.in);
            int choice;
            do{
                System.out.println("ATM MENU");
                System.out.println("1.Check Balance");
                System.out.println("2.Deposit Money");
                System.out.println("3.Withdraw Money");
                System.out.println("4.Exit");

                System.out.print("Enter your choice:");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                        account.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit:Rupess");
                        int deposit=sc.nextInt();
                        account.deposit(deposit);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw:Rupess");
                        int withdraw=sc.nextInt();
                        account.withdraw(withdraw);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                 }
            }while(choice!=4);
        }
    }
public class ATMInterface{
    public static void main(String[]args){
        BankAccount account=new BankAccount(1000);
        ATM atm=new ATM(account);
        atm.start();
    }
}