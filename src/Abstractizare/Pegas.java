package Abstractizare;

/*
* folosind cuvantul cheie "Implements" clasa Pegas trebuie sa implementeze toate
 metodele interfetei Bicicleta

 de asemenea, observam ca toate metodele pe care interfata Bicicleta le are si trebuie
 implementate in clasa Pegas au adnotarea @Override asupra lor. Mentionam ca acest
 lucru nu este necesar neaparat, dar este bine de pus/ folosit pentru o mai buna intelegere si
 vizibilitate asupra principiilor OOP
* */
public class Pegas implements Bicicleta {

  @Override
  public void schimbareCadenta (int valoare) {

  }


  @Override
  public void schimbareViteza (int viteza) {

  }


  @Override
  public void cresteViteza (int increment) {

  }


  @Override
  public void franeaza (int decrement) {

  }


  @Override
  public void franeazaComplet () {

  }
}
