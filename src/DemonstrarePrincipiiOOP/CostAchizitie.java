package DemonstrarePrincipiiOOP;


public abstract class CostAchizitie {

  private boolean janteMari =true;
  private String faruriXenon ="nu are";

  public boolean isJanteMari () {

    System.out.println(janteMari);
    return janteMari;
  }


  public String getFaruriXenon () {

    System.out.println(faruriXenon);
    return faruriXenon;
  }


  public void setJanteMari (boolean janteMari) {

    this.janteMari = janteMari;
  }


  public void setFaruriXenon (String faruriXenon) {

    this.faruriXenon = faruriXenon;
  }


  double carPrice;
  public static boolean newCar(boolean newCar){
    if(newCar){
      System.out.println("Masina a fost achiz. de noua");
      newCar=true;
    }
    else{
      System.out.println("Masina este second-hand");
      newCar=false;
    }
    return newCar;
  }
  public abstract void expensiveCar();

}
