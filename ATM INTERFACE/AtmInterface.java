public interface AtmInterface {
  void withdraw(String user,int amount);
  void deposit(String user,int amount);
  void chechBalance(String user);  
}