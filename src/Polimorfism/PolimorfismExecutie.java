package Polimorfism;

/*
 * OVERLOAD = supra-incarcare = Runtime Polymorfism
 * OVERRIDE = supra-scriere = Compile Time Polymorfism
 * */
public class PolimorfismExecutie {


  public static void main (String[] args) {

    Animal Ani = new Animal();
    Ani.afisareSunetAnimal();

    //apelam metode demoOverload care are 1 parametru
    Ani.demoOverload("nume generic");


    System.out.println("-----------------------------------");
    System.out.println("-----------------------------------");
    Pisica Suzy = new Pisica();
    Suzy.afisareSunetAnimal();

    //apelam metode demoOverload care are 2 parametrii
    Suzy.demoOverload("Suzy", "albastra");


    System.out.println("-----------------------------------");
    System.out.println("-----------------------------------");
    Caine Patrocle = new Caine();
    Patrocle.afisareSunetAnimal();

    //apelam metode demoOverload care are 3 parametrii
    Patrocle.demoOverload("Rottweiler", "Neea", "alba");

  }
}
