package Różne;

public class Bird extends Animals {

    private float altitude;

    public Bird(String name, int age,String description, float aggression,float altitude){
        super(name,age,description,aggression);
        this.altitude = altitude;
    }

    public void voice(){
        System.out.println("Ptak wydaje dzwięk");
    }

    public void move(){ float z = altitude - 5;}

    public void raiseAggresion(int x ){ aggression+=x;}

    public  void showDescription(){
        description = "Ptak to orzeł";
    }

    public float getAgression(){return aggression;}



    }

