public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

  public int getBalance(){
    return this.balance;
  }
  
  public void consignar (int c){
    this.balance = this.balance + c;
  } 
  public void retirar (int r){
    this.balance = this.balance - r;
  } 
  
  public void setBalance(int newBalance, int consignar){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
}
