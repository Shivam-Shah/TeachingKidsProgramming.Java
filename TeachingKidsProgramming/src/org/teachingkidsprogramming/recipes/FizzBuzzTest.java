package org.teachingkidsprogramming.recipes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest
{
  @Test
  public void testProduces1()
  {
    assertEquals("1", FizzBuzz.convert(1));
  }
  @Test
  public void testProduces2()
  {
    assertEquals("2", FizzBuzz.convert(2));
  }
  @Test
  public void test3Produces3()
  {
    assertEquals("Fizz", FizzBuzz.convert(3));
  }
  @Test
  public void test4Produces4()
  {
    assertEquals("4", FizzBuzz.convert(4));
  }
  @Test
  public void testmultiplesof3Producesfizz()
  {
    assertEquals("Fizz", FizzBuzz.convert(6));
  }
  @Test
  public void test5Produces5()
  {
    assertEquals("Buzz", FizzBuzz.convert(5));
  }
  @Test
  public void testmultiplesof5Produces10()
  {
    assertEquals("Buzz", FizzBuzz.convert(5));
  }
  @Test
  public void testmultiplesof5and3Produces15()
  {
    assertEquals("FizzBuzz", FizzBuzz.convert(3 * 5));
  }
}
