import java.util.Scanner;
public class ATMMachine {
public static void main(String args[] )
    {
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to CC2 ATM!");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            System.out.print("Please input an option.");
            int option = s.nextInt();

            switch(option)
            {
           case 1:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;

                case 2:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please take your money.");
                    System.out.println("Your remaining balance is: " + balance);
                    break;
                }
                else
                {
                    System.out.println("Insufficient Balance");
                    break;
                }

		 case 3:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;

                case 4:
                System.exit(0);
            }
        }
    }
}