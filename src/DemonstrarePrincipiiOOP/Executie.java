package DemonstrarePrincipiiOOP;


public class Executie {

  public static void main (String[] args) {
    Cars newCar =new Cars();
    newCar.maxSpeed(250);
    newCar.expensiveCar();
    newCar.setFaruriXenon("Are");
    newCar.getFaruriXenon();
    newCar.setJanteMari(false);
    newCar.isJanteMari();
    newCar.sportCar(true);
    newCar.sportCar(false, "dacia");
    newCar.sportCar(false,"aro");
  }
}
