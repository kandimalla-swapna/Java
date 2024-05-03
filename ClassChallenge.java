public class ClassChallenge {
  public static void main(String[] args){
    CCBankAcount account = new CCBankAcount();

    account.setAc_num("12345678");
    account.setBalance(12000.0);
    account.setEmail("abcd@gmail.com");
    account.setName("Swapna");
    account.setPhone_no("134567890");

    account.deposit(1200);
    account.withdraw(1300);
    account.deposit(100);
    account.withdraw(500);
  }
}
