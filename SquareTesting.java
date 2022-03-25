import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SquareTesting {

  final double DELTA = 0.0000001;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @Test
  void testSetSide() {
    Square s = new Square();
    s.setSide(3.0);
    double actual = s.getSide();
    double expected = 3.0;
    Assert.assertEquals(actual, expected, DELTA);
  }

  @Test
  void testGetPerimeter() {
    Square s = new Square();
    double actual = s.getPerimeter();
    double expected = 8.0;
    Assert.assertEquals(actual, expected, DELTA);
  }

  @Test
  void testGetArea() {
    Square s = new Square();
    double actual = s.getArea();
    double expected = 4.0;
    Assert.assertEquals(actual, expected, DELTA);
  }

  @Test
  void testSquare() {
    Square s = new Square();
    double actual = s.getSide();
    double expected = 2.0;
    Assert.assertEquals(actual, expected, DELTA);
  }

}
