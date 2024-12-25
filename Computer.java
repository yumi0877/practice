public class Computer extends TangibleAsset{
  private String model;

  public Computer(String name,int price, String color,String model){
    super(name,price,color);
    this.model = model;
  }

  public String getModel(){return this.model;}
}
