package lesson4;

/**
 * A class that represents a bank account.
 */
public class BankAccount {
  /**
   * The unique identifier for the bank account.
   */
  int id;

  /**
   * The name of the account holder.
   */
  String name;

  /**
   * The current balance of the bank account.
   */
  double balance;
}

/**
 * A class that tests the BankAccount class.
 */
class BankAccountTest {
  /**
   * The main method that is called when the program is run.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    BankAccount bankAccount1 = new BankAccount();
    BankAccount bankAccount2 = new BankAccount();
    bankAccount.id = 1;
    bankAccount.name = "Alex";
    bankAccount.balance = 12.35;
    bankAccount1.id = 2;
    bankAccount1.name = "Den";
    bankAccount1.balance = 2.00;
    bankAccount2.id = 3;
    bankAccount2.name = "Vlad";
    bankAccount2.balance = 123.12;
    System.out.println("Owner's name " + bankAccount.name + ", balance " + bankAccount.balance);
    System.out.println("Owner's name " + bankAccount1.name + ", balance " + bankAccount1.balance);
    System.out.println("Owner's name " + bankAccount2.name + ", balance " + bankAccount2.balance);
  }
}