package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    //if the number is multiplied by 3+5 then it produces FizzBuzz
    if (i % (3 * 5) == 0) { return ("FizzBuzz"); }
    if (i % 5 == 0)
    {
      return ("Buzz");
    }
    // if the number is 5 its buzz
    // if the number is  multiple 3 give fizz
    else if (i % 3 == 0)
    {
      return "Fizz";
    }
    else
    {
      //otherwise do the normal thing
      return "" + i;
    }
  }
}
