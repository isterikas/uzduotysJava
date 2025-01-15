public class Main {
    public static void main(String[] args) {
//        CheckingAcc account = new CheckingAcc("John Johnson", 5000, 3, 27000);
//        account.setAnnualInterestRate(4.5);
//        System.out.println(account);
//        account.withdraw(2500, "wi");
//        System.out.println(account.getStatement());
//        account.withdraw(2500);
//        account.withdraw(2500);
//        System.out.println(account.getStatement());
//        account.withdraw(2500);
//        System.out.println(account.getStatement());
//        account.deposit(3000);
//        System.out.println(account.getStatement());
//        System.out.println(account.getBalance());
//        System.out.println(account.getMonthlyInterest());
//        System.out.println(account.getDateCreated());

   SavingsAcc account = new SavingsAcc("George", 1122, 1000);
   account.setAnnualInterestRate(1.5);
   account.deposit(30);
   account.deposit(40, "for savings");
   account.deposit(50);
   account.withdraw(5, "ice cream");
   account.withdraw(-5);
   account.withdraw(2);
        System.out.println(account.getStatement());




    }
}