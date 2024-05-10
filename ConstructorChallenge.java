public class ConstructorChallenge {
    private String name;
    private double creditLimit;
    private String email;

    public ConstructorChallenge(){
        this("abc", "abc@gmail.com");
    }

    public  ConstructorChallenge(String name, String email){
        this(name, 1000, email);
    }

    public ConstructorChallenge(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
