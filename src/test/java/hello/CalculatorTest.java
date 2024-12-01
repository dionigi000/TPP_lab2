package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test
  public void test1(){
    Calculator calculator = new Calculator();
    double value = calculator.calculate("3+7*2");
    assertEquals(17D, value);
  }
  
  //@Test
  //public void test2(){
  //  Calculator calculator = new Calculator();
  //  double value = calculator.calculate("17+20");
  //  assertEquals(45D, value);
  //}
}
