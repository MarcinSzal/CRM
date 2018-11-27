package CRMproject;




import java.util.GregorianCalendar;

public final class Call {

    private String number;
    private String customer;
    private GregorianCalendar date;
    private String info;
    private String employee;

    public Call(String number,String customer, GregorianCalendar date,String info,String employee){
        this.number = number;
        this.customer = customer;
        this.date = date;
        this.info = info;
        this.employee = employee;

    }

    public String getNumber(){
        return number;
    }

    public String getCustomer(){
        return customer;
    }

    public GregorianCalendar getDate(){
        return date;
    }

    public String getInfo() {
        return info;
    }

    public String getEmployee(){
        return employee;
    }

    public static String makeCall(Call call){
        return call.number + call.customer+call.date+call.info+call.employee;

    }

    public static String toStringg(Call call){
        return call.toString();

    }

    public static Call addNewCall(String number,String consumer,GregorianCalendar date,String info,String employee){
        return new Call(number,consumer,date,info,employee);
    }


}
