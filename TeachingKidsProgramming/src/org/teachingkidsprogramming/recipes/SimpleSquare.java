package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int side = 17;
    for (int i = 1; i <= side; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.setPenWidth(7);
      Tortoise.move(25);
      Tortoise.turn(360.0 / side);
    }
  }
}
