
public class Square extends GeometricObject implements Colorable {

  private double side;

  public Square() {
    side = 2.0;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  @Override
  public double getArea() {
    return side * side;
  }

  @Override
  public double getPerimeter() {
    return side + side + side + side;
  }

  @Override
  public void howToColor() {
    System.out.println("Color all four sides");
  }

}
