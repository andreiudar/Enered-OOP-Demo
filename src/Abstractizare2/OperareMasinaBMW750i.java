package Abstractizare2;


public class OperareMasinaBMW750i implements OperareMasina {

  @Override
  public boolean signalTurn (Directie direction, boolean signalOn) {

    if (signalOn) {
      System.out.println("Masina semnalizeaza " + direction);
      return true;
    } else {
      System.out.println("Semnalizarea masinii nu este aprinsa");
      return false;
    }
  }


  @Override
  public void turn (Directie direction, double radius, double startSpeed, double endSpeed) {

    System.out.println("Intoarce masina " + direction);
    System.out.println("Masina se intoarce cu un unghi de " + radius);

  }


  @Override
  public void changeLanes (Directie direction, double startSpeed, double endSpeed) {

    System.out.println("Masina schimba banda pe " + direction);

  }


  @Override
  public int getRadarFront (double distanceToCar, double speedOfCar) {

    return 0;
  }


  @Override
  public int getRadarRear (double distanceToCar, double speedOfCar) {

    return 0;
  }
}
