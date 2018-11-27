package CRMproject;

public class Employee {

    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toStringg(Employee employee){
        return this.toString();
    }

    public static String chooseEmployee(Employee employee){
        return employee.name;
    }

    public static Employee addEmployee(String name){
        return new Employee(name);
    }


}
