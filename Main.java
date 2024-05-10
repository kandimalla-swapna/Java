public class Main{
    public static void main(String[] args) {
        ConstructorChallenge customer = new ConstructorChallenge("Swapna", 10000, "abc@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        ConstructorChallenge secondCustomer = new ConstructorChallenge();

        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        ConstructorChallenge thirdCustomer = new ConstructorChallenge("Joe", "Joe@gmail.com");

        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}