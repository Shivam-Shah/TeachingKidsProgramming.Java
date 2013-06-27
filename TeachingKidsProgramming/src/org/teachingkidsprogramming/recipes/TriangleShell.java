package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TriangleShell
{
  public static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 1; i <= 60; i++)
    {
      int length = i;
      Tortoise.setPenColor(Colors.getRandomColor());
      length = length + 4;
      drawTriangle();
      Tortoise.turn(360 / 60);
    }
  }
  public static void drawTriangle()
  {
    for (int i = 1; i <= 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
