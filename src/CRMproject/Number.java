package CRMproject;

public class Number {

    private int number;

    public Number(int number){
        this.number=number;
    }

    public int getNumber(){
        return  number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public static String toStringg(Number number){
        return number.toString();
    }

    public static int writeDownNumber(Number number){
        return number.number;

    }

    public static Number addNumber(int number){
        return new Number(number);
    }
}
