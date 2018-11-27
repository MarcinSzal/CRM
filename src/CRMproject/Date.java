package CRMproject;



import java.util.GregorianCalendar;

public class Date {

    private GregorianCalendar time;

    public Date(){

        this.time = time;
    }

    public GregorianCalendar getTime(){
        return time;
    }

    public void setTime(GregorianCalendar time){
        this.time = time;
    }

    public static String toStringg(Date date){
        return date.toString();
    }

    public static GregorianCalendar dateOfMeeting(Date date){
        return date.time;
    }

    public static GregorianCalendar dateOfContractSignature(Date date){
        return date.time;
    }

    public static Date addNewDate(){
        return new Date();

    }
}
