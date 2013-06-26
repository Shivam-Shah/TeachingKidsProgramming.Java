package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int side = MessageBox.askForNumericalInput("how many sides would you like?");
    for (int i = 1; i <= side; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.setPenWidth(i * 3.5);
      Tortoise.move(i * 5);
      Tortoise.turn(360.0 * -3 / side);
    }
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
  }
}
