                                         // SOURCE CODE

// Md_Shoaib_Ansari.java

import java.util.Scanner;

// controller class
class Bank 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\t\t\t\tWelcome to National of India");
        System.out.println("\n\t\t\t\tBharat ke sapno ka saathi...");
        System.out.println("\n\t\t\t\tBranch:  G.T.B Nagar, Kareli");
        System.out.println("\n\nEnter your 'Name', 'CustomerId', 'Account Number' to access your Bank account:");
        String name = sc.nextLine();
        String customerId = sc.nextLine();
        String accno = sc.nextLine();
        BankAccount obj1 = new BankAccount(name,customerId);
        obj1.menu();               // creating object
    }
}
class BankAccount
{
    double bal;
    double pTrans;
    String customerName;
    String customerId;
    String accno;
    int mpin;
    static String branch;
    static
    {
        branch = "G.T.B Nagar, Kareli";
    }
    // defining constructor
    BankAccount(String customerName,String customerId)       // constructor with arguments
    {
        this.customerName=customerName;
        this.customerId=customerId;
    }

    // defining methods
    void deposit(double amount)       // method with an argument
    {
        if(amount!=0)
        {
            bal+=amount;
            pTrans=amount;
        }
    }
    void withdraw(double amt)        // method with an argument
    {
        if(amt!=0 && bal>=amt)
        {
            bal-=amt;
            pTrans=-amt;
        }
        else if(bal<amt)
        {
            System.out.println("Account balance is insufficient");
        }
    }
    void getPreviousTrans()         // method with no argument
    {
        if(pTrans>0)
        {
            System.out.println("Deposited: "+pTrans);
        }
        else if(pTrans<0)
        {
            System.out.println("Withdrawn: "+Math.abs(pTrans));
        }
        else
        {
            System.out.println("No transaction occured");
        }
    }
    void menu()                     // method with no argument
    {
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.print("Welcome  "+customerName);
        System.out.print("\nYour CustomerID is:  "+customerId);
        System.out.print("\nYour Account Number is: "+accno);
        System.out.print("\nBranch:  "+branch);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit");
        System.out.println("c) Withdraw");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");
        do
        {
            System.out.println("************************************");
            System.out.println("Choose form the following options:");
            op = sc.next().charAt(0);

            switch (op)                 // switch case
            {
                case 'a':
                    System.out.println("......................");
                    System.out.print("Your current balance is:   "+bal);
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.print("Enter any amount to deposit:  ");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.print("Enter any amount to Withdraw:  ");
                    double amtW = sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Transaction:  ");
                    getPreviousTrans();
                    break;

                case 'e':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed!!");
                    break;
            }
        }while(op!= 'e');
        System.out.println("\t\t\t\tThank you for using our banking services");
        System.out.println("\n\t\t\t\tIf any of the entities aren't matching with your credentials,");
        System.out.println("\t\t\t\tthen please go through the following contact details:");
        System.out.println("\n\t\t\t\t\tToll Free number: 1800288888");
        System.out.println("\t\t\t\tE-mail us at:  customercare@nbi.co.in");
        System.out.println("\n\n\t\t\t\tCreated By:\tMD SHOAIB ANSARI");
    }
}

