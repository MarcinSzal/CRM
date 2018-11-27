package CRMproject;



import java.util.GregorianCalendar;

public class Meeting {

    private String name;
    private String employee;
    private String consumer;
    private GregorianCalendar date;

    public Meeting(String name, String employee,String consumer,GregorianCalendar date){
         this.name = name;
         this.employee = employee;
         this.consumer = consumer;
         this.date = date;
    }

    public String getName(){
        return name;
    }

    public String getEmployee(){
        return employee;
    }

    public String getConsumer(){
        return consumer;
    }

    public GregorianCalendar getDate(){
        return date;
    }

    public static String toStringg(Meeting meeting){
        return meeting.toString();
    }

    public static GregorianCalendar setUpMeeting(Meeting meeting){
        return meeting.date;
    }

    public static Meeting addNewMeeting(String name,String employee,String consumer,GregorianCalendar date){
        return new Meeting(name,employee,consumer,date);
    }


}
