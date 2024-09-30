import java.util.*;
import UserDeatils;
public class UserTransaction{
  public static void main(String args[]){
    System.out.println();
    System.out.println("Welcome to ATM INTERFACE!!");
    System.out.println("-------------------------------------------------");
    UserDeatils obj = new UserDeatils();
    Scanner inp = new Scanner(System.in);
    for(int l = 0;l<3;l++){
      System.out.println("1) Withdraw        2)Deposit");
      System.out.println("3) CheckBalance");
      System.out.println("---------------------------------------------------");
      System.out.print("Enter your user name : ");
      String user = inp.nextLine();
      System.out.println();
      System.out.print("Please select from above transaction options!!(choose the respective number) :  ");
      int z = inp.nextInt();
      inp.nextLine();
      if(z==1){
        System.out.println();
        System.out.print("Enter the amount that you wanted to withdraw: ");
        int amount = inp.nextInt();
        obj.withdraw(user,amount);
        System.out.println();
        System.out.println();
        System.out.print("Do you want to see your remaing balance?(yes/no): ");
        inp.nextLine();
        String p = inp.nextLine();
        if(p.equals("yes")){
          obj.chechBalance(user);
          System.out.println("Your Transaction is Completed!!");
          System.out.println("Thankyou!!");
        }else if(p.equals("no")){
          System.out.println("Your Transaction is completed!!");
          System.out.println("Thankyou!!");
        }
      }
      else if(z==2){
        System.out.println();
        System.out.print("Enter the amount that you wanted to deposit: ");
        int amount = inp.nextInt();
        obj.deposit(user, amount);
        System.out.println();
        System.out.print("Do you want to see your remaing balance?(yes/no): ");
        inp.nextLine();
        String p = inp.nextLine();
        if(p.equals("yes")){
          obj.chechBalance(user);
          System.out.println("Your Transaction is Completed!!");
          System.out.println("Thankyou!!");
        }else{
          System.out.println("Your Transaction is completed!!");
          System.out.println("Thankyou!!");
        }
      }
      else{
        obj.chechBalance(user);
      }
    }
  }
}
