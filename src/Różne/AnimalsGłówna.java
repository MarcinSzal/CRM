package Różne;

public class AnimalsGłówna  {
    // Program demonstruje uzycie klasy abstrakcyjnej

    public static void main(String[] args) {

         Lion Ben = new Lion("Król Lew",12,"Lew jest groźny",56F,89);
         Pig Bella = new Pig("bella",11,"Zwierze nie jest agresywne",0F,5 );
         Bird Wojciech = new Bird("wojciech",34,"potrafi latać wysoko",10,400);

         Ben.move();
         System.out.println(Ben.getSpeed());

         Bella.voice();
         System.out.println(Bella.getAggresion());

         Wojciech.raiseAggresion(6);
         System.out.println(Wojciech.getAgression());
         System.out.println(Bella.colour);

        }
}
