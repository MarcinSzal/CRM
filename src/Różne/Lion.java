package Różne;

public class Lion extends Animals {

    private double speed;





    public Lion(String name,int age,String description,float aggression,double speed){
        super(name,age,description,aggression);
        this.speed = speed;
    }



    public void move(){
        speed +=2;

    }

    public static void changeColour(){ colour = "biały";}

    public void voice(){
        System.out.println("Lew ryczy");
    }

    public void raiseAggresion(int x){
        aggression +=x;
    }

    public double getSpeed(){return speed;}


}
