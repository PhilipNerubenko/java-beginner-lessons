package lesson4;

public class BankAccount {
  int id;
  String name;
  double balance;
}

class BankAccountTest {
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
    System.out.println("Имя владельца " + bankAccount.name + ", баланс " + bankAccount.balance);
    System.out.println("Имя владельца " + bankAccount1.name + ", баланс " + bankAccount1.balance);
    System.out.println("Имя владельца " + bankAccount2.name + ", баланс " + bankAccount2.balance);
  }
}
