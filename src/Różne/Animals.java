package Różne;

public abstract class Animals {

    protected String name;
    protected int age;
    protected String description;
    protected float aggression;
    protected static String colour = "czarny";


    public Animals(String name, int age,String description,float aggression){ this.name = name;this.age = age;this.description = description;this.aggression = aggression;}
    public abstract void voice();
    public abstract void move();
    public abstract void raiseAggresion(int x);





}
