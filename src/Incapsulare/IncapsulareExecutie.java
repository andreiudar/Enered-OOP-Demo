package Incapsulare;


public class IncapsulareExecutie {


  public static void main (String[] args) {


    //declaram un obiect de tip Om cu numele de Mircea
    Om Mircea = new Om();

    //prorpietatea numeOm nu este accesibila obiectului nostru Mircea pentru ca ea este de tip
    // private
    //Mircea.numeOm;

    //apelam metoda setNumeOm cu un parametru de tip String, care nu returneaza nimic - pentru ca
    // e void
    Mircea.setNumeOm("Decebal");

    //apelam metoda getNumeOm, care returneaza un String
    Mircea.getNumeOm();

    //pentru a afisa numele tocmai setat mai sus, trebuie sa afisam rezultatul metodei .getNumeOm
    // printr-un System.out.println
    System.out.println("Numele setat este " + Mircea.getNumeOm());

  }

}
