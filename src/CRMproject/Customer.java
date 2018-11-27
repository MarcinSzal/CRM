package CRMproject;




public class Customer {

    private String name;
    private int number;


    public Customer(String name,int number){
        this.name = name;
        this.number = number;


    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }




    public String toStringg(Customer customer){
        return customer.toString();
    }

    public static Customer addCustomer(String name, int number){
        return new Customer(name, number);
    }
}
