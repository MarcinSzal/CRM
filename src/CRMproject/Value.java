package CRMproject;

public class Value {

    private double value;

    public Value(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public static String toStringg(Value value){
        return value.toString();
    }

    public void setValue(double value){
        this.value = value;
    }
    public static Value addNewValue(double value){
        return new Value(value);
    }
}
