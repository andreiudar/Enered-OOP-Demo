package Abstractizare2;


public class Executie {

  public static void main (String[] args) {

    OperareMasinaBMW750i A = new OperareMasinaBMW750i();
    A.signalTurn(Directie.STANGA, false);
    A.signalTurn(Directie.STANGA, true);
  }


}
