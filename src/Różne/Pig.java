package Różne;

public class Pig extends Animals {

    private double walkspeed;

    public Pig(String name,int age,String description,float aggression,double walkspeed){
        super(name,age,description,aggression);
        this.walkspeed = walkspeed;
    }

    public void move(){
        walkspeed +=2;
    }

    public static void changeColour(){ colour = "pomaranczowy";}

    public void voice(){ aggression--;}
    public void raiseAggresion(int x){aggression +=x;}

    public float getAggresion(){
        return aggression;
    }

}
