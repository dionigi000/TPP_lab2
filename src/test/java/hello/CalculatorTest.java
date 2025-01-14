package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test
  public void test1(){
    Calculator calculator = new Calculator();
    double value = calculator.calculate("10*3/5");
    assertEquals(6D, value);
  }
  
  //@Test
  //public void test2(){
  //  Calculator calculator = new Calculator();
  //  double value = calculator.calculate("70-23");
  //  assertEquals(100D, value);
  //}
}
