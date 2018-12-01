package CRMproject;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int number;
    private List<Call> calls;

    public Customer(String name,int number){
        this.name = name;
        this.number = number;
        this.calls = new ArrayList<Call>();
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

    public List<Call> getCalls() {
        return calls;
    }

    public void addCall (Call call) {
        calls.add(call);
    }

    public void printAllCalls() {
        calls.forEach(call -> System.out.println(call.toString()));
    }
}