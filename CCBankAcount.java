public class CCBankAcount {
    protected String ac_num;
    protected double balance;
    protected String name;
    protected String email;
    protected String phone_no;

    //constructor
    public CCBankAcount(){
        System.out.println("Empty constructor called");
    }

    public CCBankAcount(String ac_num, double balance, String name, String email, String phone_no){
        System.out.println("Account constructor with parameters called");
        this.ac_num = ac_num;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
    }

    public String getAc_num() {
        return ac_num;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setAc_num(String ac_num) {
        this.ac_num = ac_num;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("Successfully deposited the amount of "+depositAmount+". Balance is "+balance);
    }
    public void withdraw(double withDrawAmount){
        if(balance - withDrawAmount < 0){
            System.out.println("Insufficient amount. You have only "+balance+" amount");
        }
        else{
            balance -= withDrawAmount;
            System.out.println("Withdraw amount is successful. Balance is "+balance);
        }
    }
}
