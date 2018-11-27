package CRMproject;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Customer Causa = new Customer("Causa",1);
        Customer Venex = new Customer("Venex",2);
        Customer EMBE =  new Customer("EMBE",3);
        Customer Nortland = new Customer("Nortland",4);

        Employee Marcin = new Employee("Marcin");
        Employee Michał = new Employee("Michał");
        Employee Wojtek = new Employee("Wojtek");

        Scanner in = new Scanner(System.in);

        System.out.println("Wprowadz nazwę nowego klienta");
        String nazwaKlienta = in.nextLine();
        System.out.println("Wprowadz numer nowego klienta");
        int numerKlienta = in.nextInt();
        Customer Materace = new Customer(nazwaKlienta,numerKlienta);
        System.out.println("Nowy klient w bazie to " + nazwaKlienta + " o numerze " + numerKlienta);


    }
}
