package DemonstrarePrincipiiOOP;


public class Cars extends CostAchizitie implements Vehicle{

  @Override
  public void maxSpeed (int maxSpeed) {

    System.out.println("Viteza maxima este:" +maxSpeed);
  }


  @Override
  public void horsePower () {

  }


  @Override
  public void sportCar (boolean isSportCar) {

    if (isSportCar)
    {
      System.out.println("Masine este sport");
    }
    else
    {
      System.out.println("Masina nu este sport");
    }

  }
  public void sportCar (boolean isSportCar, String numeMasina) {

    if (isSportCar)
    {
      System.out.println("Masine este sport si numele ei este  " + numeMasina);
    }
    else
    {
      System.out.println("Masina nu este sport si numele ei este  " + numeMasina);
    }
  }

  @Override
  public void fuelType (String fuelType) {

  }


  @Override
  public void expensiveCar () {
    if (carPrice >=10000 ){
      System.out.println("Masina este scumpa");
    }
    else{
      System.out.println("Masina este ieftina");
    }
  }
}
