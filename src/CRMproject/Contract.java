package CRMproject;





import java.util.GregorianCalendar;

public class Contract {

    private String custormer;
    private GregorianCalendar date;
    private int value;
    private String employee;

    public Contract(String custormer, GregorianCalendar date, int value, String employee){
        this.custormer = custormer;
        this.date = date;
        this.value = value;
        this.employee = employee;

    }

    public String getCustormer(){
        return custormer;
    }

    public GregorianCalendar getDate(){
        return date;
    }

    public int getValue(){
        return value;
    }

    public String getEmployee(){
        return employee;
    }

    public static String toStringg(Contract contract){
        return contract.toString();
    }

    public static String contractSign(Contract contract){
        return contract.custormer + contract.date+contract.value+contract.employee;
    }

    public static Contract addNewContract(String consumer,GregorianCalendar date,int value,String employee){
        return new Contract(consumer,date,value,employee);
    }
}


