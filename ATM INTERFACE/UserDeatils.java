import java.util.*;
public class UserDeatils implements AtmInterface{
  HashMap<String,Integer> hm = new HashMap<>();
  public void deposit(String user,int amount){
    if(hm.containsKey(user)){
      int money = hm.get(user);
      hm.put(user, money+amount);
    }else{
      hm.put(user, amount);
    }
    System.out.println("Your Transaction is being Processed!!");
    try{
      Thread.sleep(2000);
    }catch(Exception e){
      e.printStackTrace();
    }
    System.out.println();
    System.out.printf("Your %d is deposited to your user Account named %s",amount,user);
  }

  public void withdraw(String user,int amount){
    if(hm.containsKey(user)){
      int x = hm.get(user);
      if(x<amount){
        System.out.println("Your withdrawl amount is higher than you have in your bank account!!");
        return;
      }
      hm.put(user,x-amount);
    }else{
      System.out.println("Incorrect user name!!");
      return;
    }
    System.out.println("Your Transaction is being Processed!!");
    try{
      Thread.sleep(2000);
    }catch(Exception e){
      e.printStackTrace();
    }
    System.out.println();
    System.out.printf("Your %d is withdrawn from your user Account named %s",amount,user);
  }

  public void chechBalance(String user){
    if(hm.containsKey(user)){
      int v = hm.get(user);
      try{
        Thread.sleep(2000);
      }catch(Exception e){
        e.printStackTrace();
      }
      System.out.printf("Your balance is %d",v); 
      System.out.println();
    }
  }
}
